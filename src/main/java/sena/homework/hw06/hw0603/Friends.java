package sena.homework.hw06.hw0603;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Sergej Chumakov on 10.10.2023
 */
public class Friends {

    private List<String> friends = new ArrayList<>();

    public void addFriend(String name){
        friends.add(name);
    }

    public List<String> getFriends() {
        return friends;
    }

    public List<String> getSortedFriends() {
        Collections.sort(friends);
        return friends;
    }

    public void addFriends(String... myFriends) {
        friends.addAll(Arrays.asList(myFriends));
    }
}
