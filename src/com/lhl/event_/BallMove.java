package com.lhl.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/14_16:58
 * 演示小球通过键盘控制上下左右移动
 */

// Java的事件处理是采取“委派事件模型”

public class BallMove extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        new BallMove();
    }

    // 构造器
    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.addKeyListener(mp);
    }
}

// 面板
class MyPanel extends JPanel implements KeyListener {
    // KeyListener 是监听器，可以监听键盘事件

    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);
    }

    // 有字符输出时会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 某个键按下时触发
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        System.out.println("x=" + x + ", y=" + y);

        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN:
                y++;
                break;
            case KeyEvent.VK_UP:
                y--;
                break;
            case KeyEvent.VK_RIGHT:
                x++;
                break;
            case KeyEvent.VK_LEFT:
                x--;
                break;
        }

        this.repaint();
    }

    // 某个键松开时触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
