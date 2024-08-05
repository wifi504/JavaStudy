package com.lhl.exercise.streamAPI;

import java.util.stream.Stream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_16:49
 */
public class StreamAPITest09 {
    /*
     *  StreamAPI中间操作之  skip/limit
     *      跳过/截取
     *      组合使用可以做到取集合的一部分
     * */
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).skip(3).limit(5).forEach(System.out::println);
    }
}
