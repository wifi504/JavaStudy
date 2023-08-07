package com.lhl.test.test02;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/04/14_14:19
 */
public class Exercise1 {
    public static void main(String[] args) {
        new CC();
    }
}

class AA {
    public AA() {
        System.out.println("AA的无参构造");
    }
}

class BB extends AA {
    public BB() {
        System.out.println("BB的无参构造");
    }
    public BB(String name) {
        System.out.println("BB的有参构造，得到了" + name);
    }
}

class CC extends BB {
    public CC() {
        this("罗明瑞");
        System.out.println("CC的无参构造");
    }
    public CC(String name) {
        super("赵子敬");
        System.out.println("CC的有参构造");
    }
}
