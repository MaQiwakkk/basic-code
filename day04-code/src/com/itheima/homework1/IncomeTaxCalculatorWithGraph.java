import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class IncomeTaxCalculatorWithGraph extends JFrame {
    // 用于存储绘图数据的数组（x:原始工资，y1:原始工资，y2:到手工资）
    private double[] xData;
    private double[] y1Data;
    private double[] y2Data;

    public IncomeTaxCalculatorWithGraph() {
        // 初始化窗口
        setTitle("工资与税后工资关系图");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 窗口居中

        // 生成绘图数据（原始工资从0到50000，步长1000）
        generateData(0, 50000, 1000);

        // 添加绘图面板
        JPanel graphPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawGraph(g); // 绘制图表
            }
        };
        add(graphPanel);
    }

    // 生成x（原始工资）、y1（原始工资）、y2（到手工资）的数据
    private void generateData(double start, double end, double step) {
        int size = (int) ((end - start) / step) + 1;
        xData = new double[size];
        y1Data = new double[size];
        y2Data = new double[size];

        for (int i = 0; i < size; i++) {
            double grossSalary = start + i * step; // x轴：原始工资
            xData[i] = grossSalary;
            y1Data[i] = grossSalary; // y1：原始工资（与x相同，呈45°直线）

            // 计算到手工资（复用个税计算逻辑）
            double socialSecurity = grossSalary * 0.1;
            double taxableIncome = grossSalary - socialSecurity - 5000;
            double incomeTax = calculateTax(taxableIncome);
            double netSalary = grossSalary - socialSecurity - incomeTax;
            y2Data[i] = netSalary; // y2：到手工资
        }
    }

    // 计算个税（复用之前的逻辑）
    private double calculateTax(double taxableIncome) {
        if (taxableIncome <= 0) {
            return 0;
        }
        double tax = 0;
        if (taxableIncome <= 3000) {
            tax = taxableIncome * 0.03;
        } else if (taxableIncome <= 12000) {
            tax = 3000 * 0.03 + (taxableIncome - 3000) * 0.1;
        } else if (taxableIncome <= 25000) {
            tax = 3000 * 0.03 + 9000 * 0.1 + (taxableIncome - 12000) * 0.2;
        } else if (taxableIncome <= 35000) {
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + (taxableIncome - 25000) * 0.25;
        } else if (taxableIncome <= 55000) {
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + (taxableIncome - 35000) * 0.3;
        } else if (taxableIncome <= 80000) {
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + (taxableIncome - 55000) * 0.35;
        } else {
            tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + 25000 * 0.35 + (taxableIncome - 80000) * 0.45;
        }
        return tax;
    }

    // 绘制图表
    private void drawGraph(Graphics g) {
        // 坐标参数（边距、刻度等）
        int margin = 50; // 边距
        int width = getWidth() - 2 * margin;
        int height = getHeight() - 2 * margin;

        // 1. 绘制坐标轴
        g.setColor(Color.BLACK);
        // x轴（横线）
        g.drawLine(margin, getHeight() - margin, getWidth() - margin, getHeight() - margin);
        // y轴（竖线）
        g.drawLine(margin, margin, margin, getHeight() - margin);

        // 2. 绘制坐标轴刻度和标签
        drawAxisLabels(g, margin, width, height);

        // 3. 绘制y1（原始工资）曲线（红色）
        g.setColor(Color.RED);
        drawCurve(g, xData, y1Data, margin, width, height);

        // 4. 绘制y2（到手工资）曲线（蓝色）
        g.setColor(Color.BLUE);
        drawCurve(g, xData, y2Data, margin, width, height);

        // 5. 绘制图例
        g.setColor(Color.RED);
        g.drawString("原始工资", margin + 20, margin + 20);
        g.setColor(Color.BLUE);
        g.drawString("到手工资", margin + 20, margin + 40);
    }

    // 绘制坐标轴刻度和标签
    private void drawAxisLabels(Graphics g, int margin, int width, int height) {
        // x轴（原始工资）：每10000元一个刻度
        int xTicks = 5; // 5个刻度
        for (int i = 0; i <= xTicks; i++) {
            double xValue = i * (xData[xData.length - 1] / xTicks); // 刻度值
            int xPos = margin + (int) (i * (width / (double) xTicks)); // 刻度位置
            g.drawLine(xPos, getHeight() - margin - 5, xPos, getHeight() - margin + 5); // 刻度线
            g.drawString((int) xValue + "", xPos - 10, getHeight() - margin + 20); // 刻度标签
        }

        // y轴（金额）：每10000元一个刻度
        int yTicks = 5;
        for (int i = 0; i <= yTicks; i++) {
            double yValue = i * (xData[xData.length - 1] / yTicks); // 刻度值
            int yPos = getHeight() - margin - (int) (i * (height / (double) yTicks)); // 刻度位置
            g.drawLine(margin - 5, yPos, margin + 5, yPos); // 刻度线
            g.drawString((int) yValue + "", margin - 30, yPos + 5); // 刻度标签
        }

        // 坐标轴名称
        g.drawString("原始工资（元）", getWidth() / 2 - 50, getHeight() - margin + 40);
        g.drawString("金额（元）", margin - 50, getHeight() / 2);
    }

    // 绘制曲线（将数据坐标转换为屏幕坐标并连线）
    private void drawCurve(Graphics g, double[] xData, double[] yData, int margin, int width, int height) {
        if (xData.length < 2) return;

        double maxX = xData[xData.length - 1]; // x最大值（原始工资上限）
        double maxY = maxX; // y最大值（与x一致，因为原始工资y1=x）

        // 遍历数据点，绘制连线
        for (int i = 0; i < xData.length - 1; i++) {
            // 转换x坐标（数据值 -> 屏幕像素位置）
            int x1 = margin + (int) (xData[i] / maxX * width);
            int x2 = margin + (int) (xData[i + 1] / maxX * width);

            // 转换y坐标（数据值 -> 屏幕像素位置，注意y轴向下为正，需反转）
            int y1 = getHeight() - margin - (int) (yData[i] / maxY * height);
            int y2 = getHeight() - margin - (int) (yData[i + 1] / maxY * height);

            g.drawLine(x1, y1, x2, y2); // 绘制线段
        }
    }

    public static void main(String[] args) {
        // 1. 先执行个税计算逻辑（接收用户输入）
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的税前工资（元）：");
        double grossSalary = scanner.nextDouble();
        scanner.close();

        // 计算三险一金、个税、税后工资
        double socialSecurity = grossSalary * 0.1;
        double taxableIncome = grossSalary - socialSecurity - 5000;
        IncomeTaxCalculatorWithGraph calculator = new IncomeTaxCalculatorWithGraph();
        double incomeTax = calculator.calculateTax(taxableIncome);
        double netSalary = grossSalary - socialSecurity - incomeTax;

        // 输出计算结果
        System.out.println("\n===== 个税计算结果 =====");
        System.out.printf("税前工资：%.2f 元\n", grossSalary);
        System.out.printf("三险一金（10%%）：%.2f 元\n", socialSecurity);
        System.out.printf("应纳税所得额：%.2f 元\n", Math.max(taxableIncome, 0));
        System.out.printf("应缴纳个税：%.2f 元\n", incomeTax);
        System.out.printf("税后工资：%.2f 元\n", netSalary);

        // 2. 显示曲线图（Swing窗口需在事件调度线程中启动）
        SwingUtilities.invokeLater(() -> {
            new IncomeTaxCalculatorWithGraph().setVisible(true);
        });
    }
}