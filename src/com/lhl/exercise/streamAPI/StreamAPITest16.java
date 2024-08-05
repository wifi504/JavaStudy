package com.lhl.exercise.streamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_17:49
 */
public class StreamAPITest16 {
    /*
     *  StreamAPI终止操作之  collect
     * */
    public static void main(String[] args) {
        // 转换成数组的形式
        // 默认转换Object数组
        Object[] array = Stream.of(1, 2, 3, 4).toArray();
        System.out.println(Arrays.toString(array));

        // 转换指定类型数组
        Integer[] integers = Stream.of(1, 2, 3, 4).toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));

        String[] strings = Stream.of("a", "b", "c", "d").toArray(String[]::new);
        System.out.println(Arrays.toString(strings));


    }
}
