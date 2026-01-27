package com.itwangduck.homework5_1;

public interface InterA {
    void showA();
}

class A {
    public void methodA(InterA ia) {
        ia.showA();
    }
}
