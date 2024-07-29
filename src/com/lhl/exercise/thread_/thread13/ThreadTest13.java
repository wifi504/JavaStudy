package com.lhl.exercise.thread_.thread13;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/29_16:28
 */

public class ThreadTest13 {
    /*
     *  使用线程同步机制，保证多线程并发环境下的数据安全问题
     *      1. 线程同步的本质是：线程排队执行就是同步机制
     *      2. 语法格式
     *          synchronized(必须是需要排队的几个线程共享的对象) {
     *              // 需要同步的代码
     *          }
     *          共享对象选错会无故增加同步线程的数量，导致效率降低
     *      3. 原理：
     *          synchronized(obj) {
     *              // 需要同步的代码
     *          }
     *          假设obj是t1和t2共享的
     *          t1和t2执行这个代码的时候，一定是有一个先抢到了CPU时间片，一定有先后顺序
     *          假设t1先抢到了CPU时间片，t1线程找共享对象obj的对象锁，找到之后，
     *          则占有这把锁，只要能占有obj对象的对象锁，就有权力进入同步代码块执行代码
     *          当t1线程执行完同步代码块之后，会释放之前占有的对象锁
     *          同样，t2线程抢到CPU时间片之后，也开始执行，也会去找共享对象obj的对象锁
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
    public void withdraw(double money) {
        synchronized (this) {
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
}
