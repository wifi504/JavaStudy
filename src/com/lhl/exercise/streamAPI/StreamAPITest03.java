package com.lhl.exercise.streamAPI;

import java.util.stream.Stream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_16:01
 */
public class StreamAPITest03 {
    /*
     *  获取 Stream 流对象的第三种方式：使用Stream接口本身的of(可变长度参数)方法来获取Stream对象
     * */
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("abc", "def", "xyz");
        System.out.println(stream);

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        System.out.println(stream1);
    }
}
