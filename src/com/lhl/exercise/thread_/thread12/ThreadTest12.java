package com.lhl.exercise.thread_.thread12;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/29_11:26
 */
public class ThreadTest12 {
    /*
     *  线程安全问题
     *      1. 什么情况需要考虑线程安全问题？
     *          条件1：多线程的并发环境下
     *          条件2：有共享数据
     *          条件3：共享数据涉及到修改的操作
     *      2. 一般情况下，局部变量不存在线程安全问题（尤其是基本数据类型，引用类型另说）
     *          实例变量、静态变量都可能存在线程安全问题，因为都在堆中，堆是多线程共享的
     *      3. 解决线程安全问题：
     *          线程排队执行，叫做线程同步机制，不排队叫异步机制
     *          同步：效率低，数据安全
     *          异步：效率高，数据可能不安全
     * */
    public static void main(String[] args) {

        // 异步演示

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
    public void withdraw(double money) {
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
