package com.lhl.exercise.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_15:50
 */
public class StreamAPITest01 {
    /*
     *  获取 Stream 流对象的第一种方式：使用Collection接口的stream()方法来获取Stream对象
     * */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // 顺序流，单线程，数据量不多采用这种方式
        Stream<Integer> stream = list.stream();
        // 通过stream对象可以对集合中的元素进行操作
        System.out.println(stream);

        // 默认情况下，stream的操作是单线程执行的，在巨大数据情况下，可以使用多线程加速
        // 这是一个并行流，底层自动启用多线程，程序员不需要接管也不需要干涉
        Stream<Integer> parallelStream = list.parallelStream();
        System.out.println(parallelStream);
    }
}
