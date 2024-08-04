package com.lhl.exercise.thread_.thread16;

/**
 * @author lhl
 * Version 1.0
 * Create on 2024/7/30 14:34
 */
public class SellTicket {
    /*
     *  模拟三个窗口卖票
     * */
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("1");
        t2.setName("2");
        t3.setName("3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyRunnable implements Runnable {
    //实例变量
    private int ticketTotal = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) { // 互斥锁
                if (ticketTotal <= 0) {
                    System.out.println("票已售完");
                    break; // 停止售票
                }

                try {
                    Thread.sleep(50); // 模拟出票时长
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("窗口" + Thread.currentThread().getName()
                        + "售出一张票，还剩" + (--ticketTotal) + "张票");
            }
        }
    }
}
