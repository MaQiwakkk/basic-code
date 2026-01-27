package com.itmq.a03runtimedemo3;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
    /*
    Runtime.getRuntime();
    exit();
    availableProcessors();
    maxMemory();
    totalMemory();
    freeMemory();
    exec();
    */

        System.out.println(Runtime.getRuntime().availableProcessors());
        Runtime.getRuntime().exec("shutdown -s -t 3600");

        try {
            // 暂停5000毫秒（即5秒）
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // 捕获线程中断异常（若等待过程中线程被中断，会触发此异常）
            e.printStackTrace();
        }

        Runtime.getRuntime().exec("shutdown -a");

        try {
            // 暂停5000毫秒（即5秒）
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // 捕获线程中断异常（若等待过程中线程被中断，会触发此异常）
            e.printStackTrace();
        }
    }
}




