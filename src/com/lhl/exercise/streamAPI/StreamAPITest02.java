package com.lhl.exercise.streamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_15:57
 */
public class StreamAPITest02 {
    /*
     *  获取 Stream 流对象的第二种方式：使用Arrays数组工具类的stream()方法来获取Stream对象
     * */
    public static void main(String[] args) {
        String[] names = {"张三", "李四", "王五"};
        Stream<String> stream = Arrays.stream(names);
        System.out.println(stream);

        int[] nums = {1, 2, 3, 4};
        IntStream stream1 = Arrays.stream(nums);
        System.out.println(stream1);

        long[] lnums = {1L, 2L, 3L, 4L};
        LongStream stream2 = Arrays.stream(lnums);
        System.out.println(stream2);
    }
}
