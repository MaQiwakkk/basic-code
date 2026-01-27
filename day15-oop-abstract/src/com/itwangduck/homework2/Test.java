package com.itwangduck.homework2;

public class Test {
    public static void main(String[] args) {
        OldPhone op = new OldPhone();
        NewPhone np = new NewPhone();

        UsePhone(op);
        UsePhone(np);
    }

    public  static void UsePhone(Phone phone) {
        phone.call();
        phone.message();
        if (phone instanceof NewPhone np) {
            np.playGame();
        }
    }

}
