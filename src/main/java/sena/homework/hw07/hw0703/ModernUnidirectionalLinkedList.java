package sena.homework.hw07.hw0703;

import java.util.Arrays;

/**
 * @author Sergej Chumakov on 19.10.2023
 */
public class ModernUnidirectionalLinkedList<T> {

    private Element<T>[] elementsArray;
    private int size;
    private Element<T> tail;

    public ModernUnidirectionalLinkedList() {
        this.elementsArray = new Element[5];
        this.elementsArray[0] = null;
        this.elementsArray[4] = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public void add(final T value) {
        checkSize();
        if (tail == null) {
            tail = new Element<T>(null, value);
        } else {
            Element<T> oldTail = tail;
            tail = new Element<>(oldTail, value);
        }
        elementsArray[size] = tail;
        size++;
    }

    public void add(final int index, final T value) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Індекс більше розміру листа!");
        }
        checkSize();
        if (tail == null && index == 0) {
            tail = new Element<T>(null, value);
        } else {
            Element<T> tmp = tail;
            boolean flag = false;
            int count = 0;
            do {
                if (index == size - 1 - count) {
                    elementsArray[size] = new Element<>(tmp.next, value);
                    tmp.next = elementsArray[size];
                    flag = true;
                } else {
                    tmp = tmp.next;
                    count++;
                }
            } while (!flag);
        }
        elementsArray[size] = tail;
        size++;
    }

    public void remove(final int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Індекс більше розміру листа!");
        }
        Element<T> previous = tail;
        Element<T> tmp = previous.next;
        boolean flag = false;
        int count = 0;
        do {
            if (index == size - 2 - count) {
                previous.next = tmp.next;
                tmp = null;
                flag = true;
            } else {
                previous = tmp;
                tmp = tmp.next;
                count++;
            }
        } while (!flag);
        size--;
    }

    public void remove(T value) {

        Element<T> previous = tail;
        Element<T> tmp = previous.next;
        boolean flag = false;
        int count = 0;
        do {
            if (tmp.value == value) {
                previous.next = tmp.next;
                tmp = null;
                flag = true;
            } else {
                previous = tmp;
                tmp = tmp.next;
                count++;
            }
        } while (!flag);
        size--;
        compressArray();
    }

    private void compressArray() {
        int newSize = 0;

        for (Element<T> element  :elementsArray) {
            if(element != null){
                newSize++;
            }
        }
        newSize = newSize * 2 + 1;
        Element<T>[] newArray = new Element[newSize];
        int count = 0;
        for (Element<T> element  :elementsArray) {
            if(element != null){
                newArray[count] = element;
            }
        }
        elementsArray = newArray;
    }

    public void insertHead(T value) {

        checkSize();
        if (tail == null) {
            tail = new Element<T>(null, value);
        } else {
            Element<T> tmp = tail;
            boolean flag = false;
            do {
                if (tmp.next == null) {
                    elementsArray[size] = new Element<>(null, value);
                    tmp.next = elementsArray[size];
                    flag = true;
                } else {
                    tmp = tmp.next;
                }
            } while (!flag);
        }
        elementsArray[size] = tail;
        size++;
    }

    private void checkSize() {
        int realSize = elementsArray.length;
        if (size + 1 > realSize) {
            int newSize = realSize * 2 + 1;
            Element<T>[] elementsArrayNew = Arrays.copyOf(elementsArray, newSize);
            elementsArray = elementsArrayNew;
        }
    }

    @Override
    public String toString() {

        Element<T> tmp;

        Element<T>[] arrayToPrint = new Element[size];

        boolean flag = (tail == null);
        if (flag) {
            return "[]";
        } else {
            tmp = tail;
        }
        StringBuilder sb = new StringBuilder();
        int count = size - 1;
        do {
            arrayToPrint[count] = tmp;
            tmp = tmp.next;
            if (tmp == null) {
                flag = true;
            }
            count--;
        } while (!flag);

        return Arrays.toString(arrayToPrint);
    }

    private class Element<T> {
        private Element<T> next;
        private T value;

        public Element(Element<T> next, T value) {
            this.next = next;
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }
}


