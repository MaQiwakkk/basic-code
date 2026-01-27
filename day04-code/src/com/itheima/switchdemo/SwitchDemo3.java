package com.itheima.switchdemo;

public class SwitchDemo3 {
    public static void main(String[] args) {
        /*漏写break;  会导致case穿透
        switch 的执行逻辑是：
        匹配到某个 case 后，
        会从该分支开始顺序执行后续所有分支，
        直到遇到 break 或 switch 结束。*/
        int number = 2;
        switch (number) {
            case 1, 2:
                System.out.println("number is 1212");
                break;
            case 10:
                System.out.println("number is 10");
                break;
            default:
                System.out.println("number is an other one");
                break;
            case 20:
                System.out.println("number is 20");
                break;
        }
    }
}
