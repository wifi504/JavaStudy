package com.lhl.exercise.streamAPI;

import java.util.stream.Stream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_16:30
 */
public class StreamAPITest06 {
    /*
     *  StreamAPI中间操作之  distinct
     *      去重
     * */
    public static void main(String[] args) {
        // 去除重复元素
        Stream.of(1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3).distinct().forEach(System.out::println);

        // 去除重复对象（重写equals和hashCode）
        StudentService.getStudents().stream().distinct().forEach(System.out::println);

    }
}
