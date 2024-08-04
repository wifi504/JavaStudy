package com.lhl.project.tankGame.ver01;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/14_0:12
 */
public class Tank {
    private int x; // 坦克横坐标
    private int y; // 坦克纵坐标

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
