package com.itwangduck.homework3_1;

public class Test2 {
    public static void main(String[] args) {
        IPlay anonymousPlayer = new IPlay(){
            @Override
            public void playGame() {
                System.out.println("匿名内部类：玩单机游戏");
            }
        };
        anonymousPlayer.playGame();
    }
}
