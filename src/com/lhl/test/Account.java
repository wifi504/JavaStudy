package com.lhl.test;

public class Account {

    private String name; // 名字
    private double money; // 余额
    private String password; // 密码

    public Account() {
    }

    public Account(String name, double money, String password) {
        setName(name);
        setMoney(money);
        setPassword(password);
    }

    public void setName(String name) {
        if (name.length() >= 1 && name.length() <= 6) {
            this.name = name;
        } else {
            this.name = "无名";
            System.out.println("姓名要求1-6字符！已设置默认值无名");
        }
    }

    public void setMoney(double money) {
        if (money >= 20) {
            this.money = money;
        } else {
            System.out.println("余额要求20元以上！已设置默认值0");
        }
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            this.password = "123456";
            System.out.println("密码要求6位！已设置默认123456");
        }
    }

    public void info() {
        System.out.printf("姓名：%s，余额：%f，密码：%s\n", name, money, password);
    }
}
