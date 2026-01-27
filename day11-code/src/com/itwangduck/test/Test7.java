package com.itwangduck.test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("001", "jaychou", "mojito");
        User u2 = new User("002", "jolin", "sunset");
        User u3 = new User("003", "jj", "Singapore");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        int index = getIndex(list, "004");
        boolean flag = contains(list, "004");
        System.out.println(index);
        System.out.println(flag);


    }

    public static boolean contains(ArrayList<User> list, String id) {
        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}