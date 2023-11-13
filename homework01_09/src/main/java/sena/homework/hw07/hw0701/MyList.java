package sena.homework.hw07.hw0701;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergej Chumakov on 19.10.2023
 */
public class MyList<T> {
    private List<T> simpleList;
    private int size;

    public MyList() {
        this.simpleList = new ArrayList<>();
        this.size = 0;
    }

    public boolean add(T element){
        boolean res = simpleList.add(element);
        if (res) size++;
        return res;
    }

    public T get(int index){
        if(index > (size - 1)){
            throw new IndexOutOfBoundsException("Індекс за межами листа.");
        } else if (index < 0){
            throw new IndexOutOfBoundsException("Індекс не може бути менше 0.");
        }
        return simpleList.get(index);
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "simpleList=" + simpleList +
                '}';
    }
}
