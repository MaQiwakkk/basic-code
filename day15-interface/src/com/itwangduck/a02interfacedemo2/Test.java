package com.itwangduck.a02interfacedemo2;

public class Test {
    public static void main(String[] args) {
        interImpl ii = new interImpl();
        ii.b();
        System.out.println(Inter.a);
        System.out.println(ii.a);

    }
}
