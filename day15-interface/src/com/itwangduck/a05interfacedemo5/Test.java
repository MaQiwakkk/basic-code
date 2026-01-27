package com.itwangduck.a05interfacedemo5;

public class Test {
    public static void main(String[] args) {
        PingPangSporter pps = new PingPangSporter("马龙", 35);
        System.out.println(pps.getName()+ ", " + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}
