package com.itmq.ui;

import com.itmq.domain.User;
import com.itmq.util.CodeUtil;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJframe extends JFrame implements MouseListener {

    //创建一个集合存储正确的用户名和密码
    static ArrayList<User> list = new ArrayList<>();

    static {
        list.add(new User("zhangsan", "123456"));
        list.add(new User("lisi", "1234"));
        list.add(new User("石佳段彤小屁屁", "111"));
    }

    //成员位置添加登录、注册按钮
    JButton loginButton = new JButton();
    JButton registerButton = new JButton();

    //成员位置添加验证码组件，显示正确的验证法
    JLabel rightCode = new JLabel();

    //成员位置添加用户名、密码、验证码的输入框
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JTextField code = new JTextField();

    public LoginJframe() {
        //初始化界面
        initJFrame();

        //在这个界面添加内容
        initView();

        this.setVisible(true);
    }

    public void initJFrame() {
        //设置界面的宽高
        this.setSize(488, 430);
        //设置界面的标题
        this.setTitle("登录界面");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //让界面显示出来
    }

    public void initView() {
        //1. 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("day16-code\\image\\login\\用户名.png"));
        usernameText.setBounds(116, 135, 51, 19);
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框
        //成员位置JTextField username = new JTextField();
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("day16-code\\image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 35, 18);
        this.getContentPane().add(passwordText);

        //4.添加密码输入框
        //成员位置JTextField password = new JTextField();
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //添加验证码文字
        JLabel codeText = new JLabel(new ImageIcon("day16-code\\image\\login\\验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);

        //添加验证码的输入框
        //成员位置JTextField code = new JTextField();
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        //添加5位的验证码
        String codeStr = CodeUtil.getCode();
        //成员位置 JLabel rightCode = new JLabel();
        //设置内容
        rightCode.setText(codeStr);
        //设置位置和宽高
        rightCode.setBounds(300, 256, 50, 30);
        //添加到界面
        this.getContentPane().add(rightCode);
        rightCode.addMouseListener(this);

        //5.添加登录按钮
        //成员位置 JButton loginButton = new JButton();
        loginButton.setBounds(123, 310, 128, 47);
        loginButton.setIcon(new ImageIcon("day16-code\\image\\login\\登录按钮.png"));
        //去除按钮的默认边框
        loginButton.setBorderPainted(false);
        //去除按钮的默认背景
        loginButton.setContentAreaFilled(false);
        this.getContentPane().add(loginButton);
        loginButton.addMouseListener(this);

        //6.添加注册按钮
        //成员位置  JButton registerButton = new JButton();
        registerButton.setBounds(256, 310, 128, 47);
        registerButton.setIcon(new ImageIcon("day16-code\\image\\login\\注册按钮.png"));
        //去除按钮的默认边框
        registerButton.setBorderPainted(false);
        //去除按钮的默认背景
        registerButton.setContentAreaFilled(false);
        this.getContentPane().add(registerButton);
        registerButton.addMouseListener(this);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("day16-code\\image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
    }

    //要展示用户名或密码错误
    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //获取是谁触发了这次事件
        Object obj = e.getSource();
        if (obj == loginButton) {
            String inputUsername = username.getText();
            String inputPassword = password.getText();
            String inputCode = code.getText();


            if (inputUsername.equals("") || inputPassword.equals("")) {
                showJDialog("用户名或密码为空！");
            } else if (inputCode.equals("")) {
                showJDialog("请输入验证码！");
            } else if (!inputCode.equals(rightCode.getText())) {
                showJDialog("验证码错误！");
                //重置验证码
                String codeStr = CodeUtil.getCode();
                rightCode.setText(codeStr);
            } else if (!ifContains(new User(inputUsername, inputPassword))) {
                showJDialog("用户名或密码错误！");
                //重置验证码
                String codeStr = CodeUtil.getCode();
                rightCode.setText(codeStr);
            } else {
                //隐藏登录界面
                this.setVisible(false);
                //进入游戏界面
                new GameJFrame();
            }
        } else if (obj == rightCode) {
            //看不清，换一张，重设验证码
            String codeStr = CodeUtil.getCode();
            rightCode.setText(codeStr);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //获取是谁触发了这次事件
        Object obj = e.getSource();
        if (obj == loginButton) {
            loginButton.setIcon(new ImageIcon("day16-code\\image\\login\\登录按下.png"));
        } else if (obj == registerButton) {
            registerButton.setIcon(new ImageIcon("day16-code\\image\\login\\注册按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //获取是谁触发了这次事件
        Object obj = e.getSource();
        if (obj == loginButton) {
            loginButton.setIcon(new ImageIcon("day16-code\\image\\login\\登录按钮.png"));
        } else if (obj == registerButton) {
            registerButton.setIcon(new ImageIcon("day16-code\\image\\login\\注册按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    //判断用户在集合中是否存在和密码是否正确
    public boolean ifContains(User userInput) {
        for (int i = 0; i < list.size(); i++) {
            User rightUser = list.get(i);
            if (userInput.getUsername().equals(rightUser.getUsername()) && userInput.getPassword().equals(rightUser.getPassword())) {
                //有相同的代表存在，返回true，后面的不需要再比了
                return true;
            }
        }
        //循环结束之后还没有找到就表示不存在
        return false;
    }
}
