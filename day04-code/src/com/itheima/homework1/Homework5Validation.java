package com.itheima.homework1;

import java.util.Scanner;

public class Homework5Validation {
    public static void main(String[] args) {
        // 1. 获取用户输入的税前工资
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的税前工资（元）：");
        double grossSalary = scanner.nextDouble();
        scanner.close();

        // 2. 计算三险一金（假设为税前工资的10%）
        double socialSecurity = grossSalary * 0.1;

        // 3. 计算应纳税所得额（扣除三险一金和起征点5000元）
        double taxableIncome = grossSalary - socialSecurity - 5000;

        // 4. 根据应纳税所得额计算个税（若不足0则无需缴税）
        double incomeTax = 0;
        if (taxableIncome > 0) {
            // 分段计算个税（超额部分按梯度累加）
            if (taxableIncome <= 3000) {
                incomeTax = taxableIncome * 0.03;
            } else if (taxableIncome <= 12000) {
                incomeTax = 3000 * 0.03 + (taxableIncome - 3000) * 0.1;
            } else if (taxableIncome <= 25000) {
                incomeTax = 3000 * 0.03 + 9000 * 0.1 + (taxableIncome - 12000) * 0.2;
            } else if (taxableIncome <= 35000) {
                incomeTax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + (taxableIncome - 25000) * 0.25;
            } else if (taxableIncome <= 55000) {
                incomeTax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + (taxableIncome - 35000) * 0.3;
            } else if (taxableIncome <= 80000) {
                incomeTax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + (taxableIncome - 55000) * 0.35;
            } else {
                incomeTax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + 25000 * 0.35 + (taxableIncome - 80000) * 0.45;
            }
        }

        // 5. 计算税后工资（税前工资 - 三险一金 - 个税）
        double netSalary = grossSalary - socialSecurity - incomeTax;

        // 6. 输出结果（保留两位小数，符合金额格式）
        System.out.println("税前工资：" + grossSalary + "元");
        System.out.println("三险一金（10%）：" + socialSecurity + "元");
        System.out.println("应纳税所得额：" + (taxableIncome > 0 ? taxableIncome : 0) + "元");
        System.out.println("应缴纳个税：" + incomeTax + "元");
        System.out.println("税后工资：" + netSalary + "元");
    }
}
