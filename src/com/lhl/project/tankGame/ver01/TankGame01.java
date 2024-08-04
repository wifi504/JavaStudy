package com.lhl.project.tankGame.ver01;

import javax.swing.*;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/14_0:11
 */
public class TankGame01 extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame01 tankGame01 = new TankGame01();
    }

    public TankGame01() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
