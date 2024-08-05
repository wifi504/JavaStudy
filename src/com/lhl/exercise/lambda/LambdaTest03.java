package com.lhl.exercise.lambda;

import java.net.InetAddress;
import java.util.*;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_12:11
 */
public class LambdaTest03 {
    /*
     *  Lambda表达式语法格式
     *      (形参列表) -> {
     *          方法体;
     *      }
     * */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 500, 400, 300, 200);

        // 排序
        // Collections.sort(list);

//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });

        Collections.sort(list, (Integer a, Integer b) -> {
            return a - b;
        });

        System.out.println(list);
    }
}
