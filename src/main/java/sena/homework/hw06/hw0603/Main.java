package sena.homework.hw06.hw0603;

import java.util.Arrays;

/**
 * @author Sergej Chumakov on 10.10.2023
 */
public class Main {
    public static void main(String[] args) {

        //якщо додати у масив імена друзів по-одному
        Friends friends = new Friends();
        friends.addFriend("Саша");
        friends.addFriend("Юра");
        friends.addFriend("Кирило");
        friends.addFriend("Ростік");
        friends.addFriend("Юра");

        System.out.println(friends.getFriends());
        System.out.println(friends.getSortedFriends());

        //якщо додати масив "імена друзів" (в завданні знову написано невизначено)
        friends = new Friends();
        friends.addFriends("Саша", "Юра", "Кирило", "Ростік", "Юра");

        System.out.println(friends.getFriends());
        System.out.println(friends.getSortedFriends());
    }
}
