package com.lhl.exercise.thread_.thread14;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/29_16:47
 */

public class ThreadTest14 {
    /*
     *  在实例方法上也可以添加 synchronized 关键字
     *      1. 添加之后，整个方法体是一个同步代码块
     *      2. 添加之后，共享对象一定是this
     * */
    public static void main(String[] args) {

        // 同步演示

        // 创建账户对象
        Account account = new Account("act-001", 10000);
        // 创建线程对象1
        Thread t1 = new Thread(new Withdraw(account));
        // 创建线程对象2
        Thread t2 = new Thread(new Withdraw(account));
        // 启动线程
        t1.start();
        t2.start();

    }
}

// 取款线程类
class Withdraw implements Runnable {
    // 实例变量
    private Account act;

    public Withdraw(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        act.withdraw(1000);
    }
}


// 银行账户
class Account {
    private String actNo; // 账号
    private double balance; // 余额

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String actNo, double balance) {
        this.actNo = actNo;
        this.balance = balance;
    }

    /**
     * 取款的方法
     *
     * @param money 取款额度
     */
    public synchronized void withdraw(double money) {

        // 想要演示出多线程并发带来的安全隐患，这里分为两步完成取款
        double before = this.getBalance();
        System.out.println(Thread.currentThread().getName()
                + "线程正在取款" + money + "，当前" + this.getActNo() + "账户余额：" + before);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(before - money);
        System.out.println(Thread.currentThread().getName()
                + "线程取款成功，当前" + this.getActNo() + "账户余额：" + this.getBalance());

    }
}
