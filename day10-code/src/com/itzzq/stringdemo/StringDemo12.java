package com.itzzq.stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        String talk = "tmd，你玩的真的好，mlgb下次别玩了";
        String[] dirtyWords = {"tmd", "cnmd", "ntmd", "sb", "mlgb"};


        for (int i = 0; i < dirtyWords.length; i++) {
            talk = talk.replace(dirtyWords[i],"***");
        }


        System.out.println(talk);

    }
}
