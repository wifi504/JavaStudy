package com.lhl.exercise.system_;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/5_12:21
 */
public class System_ {
    public static void main(String[] args) {
        // 返回时间戳
        System.out.println(System.currentTimeMillis());

        // 垃圾回收
        System.gc();

        // 退出程序
        System.exit(66);
    }
}
