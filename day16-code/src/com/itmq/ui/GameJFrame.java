package com.itmq.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //创建4x4的二维数组储存图片
    int[][] indexArr = new int[4][4];

    //记录空白方块图片的坐标
    int x = 0;
    int y = 0;

    //定义一个路径
    String path = "day16-code\\image\\animal\\animal3\\";

    //定义一个数组存储正确的下标
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //step存储游戏步数
    int step = 0;

    //创建条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem girlItem = new JMenuItem("美女");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");

    JMenuItem accountItem = new JMenuItem("公众号");

    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initMenu();

        //初始化打乱图片索引
        initData();

        //初始化图片
        initImage();

        //让界面显示出来
        this.setVisible(true);
    }


    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        //Fisher-Yates 洗牌算法打乱一维数组
        for (int i = tempArr.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            int temp = tempArr[i];
            tempArr[i] = tempArr[j];
            tempArr[j] = temp;
        }

        //将被打乱的一维数组放入二维数组
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            indexArr[i / 4][i % 4] = tempArr[i];
        }
    }

    private void initImage() {
        //首先移去原有的图片
        this.getContentPane().removeAll();

        if (ifVictory()) {
            //显示胜利图片
            JLabel winJlabel = new JLabel(new ImageIcon("day16-code\\image\\win.png"));
            winJlabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJlabel);
        }

        //添加步数显示
        JLabel stepCount = new JLabel("步数" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建一个JLabel，放入一个小块图片的ImageIcon对象 链式编程
                int number = indexArr[i][j];
                JLabel jLabel = new JLabel(new ImageIcon(path + number + ".jpg"));
                //指定小块图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器jLabel添加到界面中
                this.getContentPane().add(jLabel);
            }
        }

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("day16-code\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);
        //最后刷新图片
        this.getContentPane().repaint();
    }

    private void initMenu() {
        //创建菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单选项
        JMenu functionJmenu = new JMenu("功能");
        JMenu aboutJmenu = new JMenu("关于我们");
        JMenu changeJmenu = new JMenu("更换图片");


        //将条目添加到对应的选项下面
        functionJmenu.add(changeJmenu);
        functionJmenu.add(replayItem);
        functionJmenu.add(reLoginItem);
        functionJmenu.add(closeItem);

        aboutJmenu.add(accountItem);

        changeJmenu.add(girlItem);
        changeJmenu.add(animalItem);
        changeJmenu.add(sportItem);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        girlItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);

        //将两个选项添加到JMenuBar里
        jMenuBar.add(functionJmenu);
        jMenuBar.add(aboutJmenu);

        //把jMenuBar添加到GameJFrame上面去
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图游戏 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中
        this.setLayout(null);
        //给界面添加监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //如果已经胜利了就不能执行以下代码了，直接return结束方法
        if (ifVictory()) {
            //结束方法
            return;
        }
        //按a查看原图代码
        int code = e.getKeyCode();
        if (code == 65) {
            //首先移去原有的图片
            this.getContentPane().removeAll();

            //加载完整图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);

            //重新添加背景图片
            JLabel background = new JLabel(new ImageIcon("day16-code\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //如果已经胜利了就不能执行以下代码了，直接return结束方法
        if (ifVictory()) {
            //结束方法
            return;
        }

        //获取按键对应数据
        int code = e.getKeyCode();
        //37~40:左上右下
        if (code == 37) {
            //左移
            if (y == 0) {
                return;
            }
            indexArr[x][y] = indexArr[x][y - 1];
            indexArr[x][y - 1] = 0;
            y--;
            //游戏步数step自增一次
            step++;
            //调用initImage方法按左移后的坐标重新加载图片
            initImage();
        } else if (code == 38) {
            //上移
            if (x == 0) {
                return;
            }
            indexArr[x][y] = indexArr[x - 1][y];
            indexArr[x - 1][y] = 0;
            x--;
            //游戏步数step自增一次
            step++;
            //调用initImage方法按左移后的坐标重新加载图片
            initImage();
        } else if (code == 39) {
            if (y == 3) {
                return;
            }
            //右移
            indexArr[x][y] = indexArr[x][y + 1];
            indexArr[x][y + 1] = 0;
            y++;
            //游戏步数step自增一次
            step++;
            //调用initImage方法按变左移的坐标重新加载图片
            initImage();
        } else if (code == 40) {
            if (x == 3) {
                return;
            }
            //下移
            indexArr[x][y] = indexArr[x + 1][y];
            indexArr[x + 1][y] = 0;
            x++;
            //游戏步数step自增一次
            step++;
            //调用initImage方法按左移后的坐标重新加载图片
            initImage();
        } else if (code == 65) {
            //表示按下a后松开的时候，查看原图
            initImage();
        } else if (code == 87) {
            //表示按下w后松开的时候，直接拼好，w是作弊码
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    indexArr[i][j] = 4 * i + j + 1;
                }
            }
            //上面的遍历方法会使indexArr[4][4] = 16，这不是我们想要的，手动置为0
            indexArr[3][3] = 0;
            initImage();
        }
    }

    public boolean ifVictory() {
        for (int i = 0; i < indexArr.length; i++) {
            for (int j = 0; j < indexArr[i].length; j++) {
                if (indexArr[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayItem) {
            //步数清零
            step = 0;
            //重新打乱图片索引
            initData();
            //重新初始化图片
            initImage();
        } else if (obj == reLoginItem) {
            //关闭游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJframe();
        } else if (obj == closeItem) {
            //直接关闭虚拟机
            System.exit(0);
        } else if (obj == accountItem) {
            //创建一个弹窗对象
            JDialog jDialog = new JDialog();
            //创建一个Jlabel
            JLabel jlabel = new JLabel(new ImageIcon("day16-code\\image\\about.png"));
            jlabel.setBounds(0, 0, 258, 258);
            //将jlabel添加到弹窗中
            jDialog.getContentPane().add(jlabel);
            //设置弹窗的大小
            jDialog.setSize(344, 344);
            //设置弹窗置顶
            jDialog.setAlwaysOnTop(true);
            //设置弹窗居中
            jDialog.setLocationRelativeTo(null);
            //让弹窗不关闭无法操作下面的界面
            jDialog.setModal(true);
            //取消默认隐藏
            jDialog.setVisible(true);
        } else if (obj == girlItem) {
            Random r = new Random();
            int num = r.nextInt(13) + 1;
            path = "day16-code\\image\\girl\\girl" + num + "\\";
            //步数清零
            step = 0;
            //重新打乱图片索引
            initData();
            //重新初始化图片
            initImage();
        } else if (obj == animalItem) {
            Random r = new Random();
            int num = r.nextInt(8) + 1;
            path = "day16-code\\image\\animal\\animal" + num + "\\";
            //步数清零
            step = 0;
            //重新打乱图片索引
            initData();
            //重新初始化图片
            initImage();
        } else if (obj == sportItem) {
            Random r = new Random();
            int num = r.nextInt(10) + 1;
            path = "day16-code\\image\\sport\\sport" + num + "\\";
            //步数清零
            step = 0;
            //重新打乱图片索引
            initData();
            //重新初始化图片
            initImage();
        }
    }
}