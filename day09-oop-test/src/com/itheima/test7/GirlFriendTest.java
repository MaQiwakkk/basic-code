package com.itheima.test7;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];
        GirlFriend gf1 = new GirlFriend("May", 19, "女", "吃饭");
        GirlFriend gf2 = new GirlFriend("Lolaro", 21, "女", "睡觉");
        GirlFriend gf3 = new GirlFriend("Milly", 25, "女", "打豆豆");
        GirlFriend gf4 = new GirlFriend("Sindeay", 28, "女", "打游戏");
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }
        double avg = sum * 1.0 / arr.length;
        System.out.printf("平均年龄是%.2f岁.\n", avg);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < avg) {
                System.out.printf(arr[i].getName() + " " + arr[i].getAge()
                        + " " + arr[i].getGender() + " " + arr[i].getHobby() + "\n");
            }
        }
    }
}
