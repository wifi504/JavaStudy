package com.lhl.project.tankGame.ver01;

import javax.swing.*;
import java.awt.*;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/14_0:14
 */
// 坦克大战绘图区域
public class MyPanel extends JPanel {
    // 定义我的坦克
    Hero hero = null;

    public MyPanel() {
        hero = new Hero(100, 100);//初始化自己坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); // 填充矩形，默认黑色

        // 绘制坦克
        drawTank(hero.getX(), hero.getY(), g, 0, 0);
    }

    // 编写方法，画出坦克

    /**
     * @param x      坦克的左上角 x 坐标
     * @param y      坦克的左上角 y 坐标
     * @param g      画笔
     * @param direct 坦克方向
     * @param type   坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        // 根据不同类型坦克，设置不同颜色
        switch (type) {
            case 0: // 我方坦克
                g.setColor(Color.cyan);
                break;
            case 1: // 敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        // 根据坦克方向绘制坦克
        switch (direct) {
            case 0: // 上
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1: // 右
            case 2: // 下
            case 3: // 左
            default:
                System.out.println("没有处理... ");
                break;
        }
    }
}
