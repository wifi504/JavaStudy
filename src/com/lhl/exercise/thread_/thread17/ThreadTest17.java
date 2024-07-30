package com.lhl.exercise.thread_.thread17;

/**
 * @author lhl
 * Version 1.0
 * Create on 2024/7/30 14:54
 */
public class ThreadTest17 {
    /*
     *  让两个线程交替输出 ------> 线程通信
     *
     *  1. 线程通信涉及三个方法
     *      wait() notify() notifyAll()
     *  2. 都是 Object 的方法
     *  3. 其中 wait() 方法重载了三个
     *      wait(): 调用此方法，线程进入“等待状态”
     *      wait(毫秒): 调用此方法，线程进入“超时等待状态”
     *      wait(毫秒, 纳秒): 调用此方法，线程进入“超时等待状态”
     *  4. 调用 wait() 方法和 notify() 相关的方法，不是通过线程对象去调用，而是通过共享对象去调用
     *  5. 例如，调用了 obj.wait() 方法之后，在obj对象上的所有活跃线程将会进入无限期等待，直到调用了该共享对象的notify()方法进行唤醒
     *      唤醒后，会接着上一次 wait() 方法的位置继续向下执行
     *  6. wait() 方法调用之后，会释放之前占用的对象锁
     *  7. 关于 notify() notifyAll()
     *      obj.notify(): 唤醒优先级最高的等待线程，优先级一样则随机唤醒
     *      obj.notifyAll(): 唤醒所有等待线程
     * */
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class MyRunnable implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                // 唤醒 另一个 线程
                this.notify();

                if (count >= 100) break;
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "====>" + (++count));
                // 让其中一个线程等待
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
