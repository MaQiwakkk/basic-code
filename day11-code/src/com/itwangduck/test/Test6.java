package com.itwangduck.test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList();
        User u1 = new User("001", "jaychou", "mojito");
        User u2 = new User("002", "jolin", "sunset");
        User u3 = new User("003", "jj", "Singapore");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        boolean flag = contains(list,"001");
        System.out.println(flag);


    }

    public static boolean contains(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
