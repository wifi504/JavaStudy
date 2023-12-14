package com.lhl.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/13_23:28
 */

// 在面板上画出圆形

public class DrawMethod extends JFrame { // JFrame 对应窗口

    // 定义一个面板
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawMethod();
    }

    public DrawMethod() {
        // 初始化面板
        mp = new MyPanel();
        // 把面板放入窗口
        this.add(mp);
        // 设置窗口大小
        this.setSize(960, 720);
        // 可以显示
        this.setVisible(true);
        // 关闭窗口退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// 1. 定义一个MyPanel，继承 JPanel 类，画图在画板上画
class MyPanel extends JPanel {
    /*
        1. MyPanel 是一个画板
        2. Graphics g 把 g 理解成一个画笔
        3. Graphics 提供了很多绘图方法
     */
    int i = 0;

    @Override
    public void paint(Graphics g) { // 绘图方法
        System.out.println("paint() 方法被调用..." + ++i);
        super.paint(g); // 调用父类的方法完成初始化
        // 画出一个圆形
        g.drawOval(100, 100, 500, 500);
        // 画直线
        g.drawLine(100, 100, 500, 500);
        // 画矩形边框
        g.drawRect(100, 100, 500, 500);
        // 设置画笔颜色
        g.setColor(Color.red);
        // 填充椭圆
        g.fillOval(100, 100, 500, 500);
        // 填充矩形
        g.setColor(Color.pink);
        g.fillRect(200, 200, 300, 300);

        // 画图片
        // 获取图片资源
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/jiaran.png"));
        g.drawImage(image, 300, 300, 100, 100, this);

        // 画字符串
        // 设置颜色与字体
        g.setColor(Color.green);
        g.setFont(new Font("隶书", Font.BOLD, 50));
        g.drawString("嘉然", 300, 450); // 此处x,y是字符串的左下角
    }
}