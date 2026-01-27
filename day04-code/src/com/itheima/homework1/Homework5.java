package com.itheima.homework1;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("输入税前工资：");
        Scanner sc = new Scanner(System.in);
        int grossSalary = sc.nextInt();
        double salaryAfterInsurance = grossSalary * 0.9;
        double tax = 0;
        if (salaryAfterInsurance - 5000 > 0 && salaryAfterInsurance - 5000 <= 3000) {
            tax = 0.03 * (salaryAfterInsurance - 5000);
        } else if (salaryAfterInsurance - 5000 > 3000 && salaryAfterInsurance - 5000 <= 12000) {
            tax = 0.03 * 3000 + (salaryAfterInsurance - 5000 - 3000) * 0.1;
        } else if (salaryAfterInsurance - 5000 > 12000 && salaryAfterInsurance - 5000 <= 25000) {
            tax = 0.03 * 3000 + 9000 * 0.1 + (salaryAfterInsurance - 5000 - 12000) * 0.2;
        } else if (salaryAfterInsurance - 5000 > 25000 && salaryAfterInsurance - 5000 <= 35000) {
            tax = 0.03 * 3000 + 9000 * 0.1 + 13000 * 0.2 + (salaryAfterInsurance - 5000 - 25000) * 0.25;
        } else if (salaryAfterInsurance - 5000 > 35000 && salaryAfterInsurance - 5000 <= 55000) {
            tax = 0.03 * 3000 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + (salaryAfterInsurance - 5000 - 35000) * 0.3;
        } else if (salaryAfterInsurance - 5000 > 55000 && salaryAfterInsurance - 5000 <= 80000) {
            tax = 0.03 * 3000 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + (salaryAfterInsurance - 5000 - 55000) * 0.35;
        } else if (salaryAfterInsurance - 5000 > 80000) {
            tax = 0.03 * 3000 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + 25000 * 0.35 + (salaryAfterInsurance - 5000 - 80000) * 0.45;
        }
        double netSalary = salaryAfterInsurance - tax;
        System.out.println("税前工资：" + grossSalary + "元");
        System.out.println("三险一金（10%）：" + grossSalary * 0.1 + "元");
        System.out.println("应纳税所得额：" + (salaryAfterInsurance - 5000 > 0 ? salaryAfterInsurance - 5000 : 0) + "元");
        System.out.println("应缴纳个税：" + tax + "元");
        System.out.println("税后工资" + netSalary + "元");
    }
}
