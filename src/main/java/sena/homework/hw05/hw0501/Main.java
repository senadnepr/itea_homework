package sena.homework.hw05.hw0501;
/*
HW - 05 - 01
Створіть проєкт з класом Main.java.
Потрібно: Створити клас AbstractHandler. У тілі класу створити методи void open(), void create(), void change(), void save().
 Створити похідні класи XMLHandler, TXTHandler, DOCHandler від базового класу AbstractHandler.
 Створити три екземпляри XMLHandler, TXTHandler, DOCHandler.
Методи мають мати інформацію що саме за хендлер виконує роботу.
Для прикладу
…. xmlHandler= new XMLHandler();
xmlHandler.open();
В консолі буде
XMLHandler opens a document
 */
/**
 * @author Sergej Chumakov on 03.10.2023
 */
public class Main {

    public static void main(String[] args) {

        AbstractHandler xmlHandler= new XMLHandler();
        AbstractHandler txtHandler= new TXTHandler();
        AbstractHandler docHandler= new DOCHandler();

        xmlHandler.create();
        xmlHandler.open();
        xmlHandler.change();
        xmlHandler.save();

        txtHandler.create();
        txtHandler.open();
        txtHandler.change();
        txtHandler.save();

        docHandler.create();
        docHandler.open();
        docHandler.change();
        docHandler.save();

        System.out.println("");

        //або
        AbstractHandler[] handlers = {xmlHandler, txtHandler, docHandler};
        for (AbstractHandler handler : handlers) {
            handler.create();
            handler.open();
            handler.change();
            handler.save();
        }
    }
}
