package com.lhl.exercise.streamAPI;

import java.util.stream.Stream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_16:12
 */
public class StreamAPITest04 {
    /*
     *   StreamAPI中间操作之  filter
     * */
    public static void main(String[] args) {
        // 筛选出年龄大于20的学生对象
        // filter属于中间操作，过滤
        // forEach属于终止操作，遍历
        StudentService.getStudents().stream()
                .filter(student -> student.getAge() > 20)
                .forEach(System.out::println);

        // 筛选出字符串长度大于3的元素
        Stream<String> stream = Stream.of("zhangsan", "lisi", "wangwu", "abc", "a", "bc");
        stream.filter(s -> s.length() > 3).forEach(System.out::println);

        // 筛选出学生名字大于4的
        StudentService.getStudents().stream()
                .filter(student -> student.getName().length() > 4)
                .forEach(System.out::println);
    }
}
