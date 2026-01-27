package com.itmq.a08regexdemo;

public class Test {
    public static void main(String[] args) {
        //邮箱号码
        //3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
        String regex = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(regex));
        System.out.println("zhangsan@itcast.cnn".matches(regex));
        System.out.println("dlei0009@163.com".matches(regex));
        System.out.println("dlei0009@pci.com.cn".matches(regex));


        String regex1 = "[1-9]\\d{16}(\\d|x|X)";
        String regex2 = "[1-9]\\d{16}[\\dxX]";
        String regex3 = "[1-9]\\d{16}(\\d|(?i)x)";
        System.out.println("330483200210160033".matches(regex1));
        System.out.println("330483200210160033".matches(regex2));
        System.out.println("330483200210160033".matches(regex3));


    }
}
