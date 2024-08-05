package com.lhl.exercise.streamAPI;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_16:51
 */
public class StreamAPITest10 {
    /*
     *  StreamAPI终止操作之  forEach
     *      遍历
     * */

    // 示例略

    /*
     *  StreamAPI终止操作之  Match
     *      匹配
     * */
    public static void main(String[] args) {

        // 是否全是3
        System.out.println(Stream.of(1, 2, 3, 4, 5).allMatch(integer -> integer.equals(3))); //F
        System.out.println(Stream.of(3, 3, 3, 3, 3).allMatch(integer -> integer.equals(3))); //T

        // 是否包含3
        System.out.println(Stream.of(1, 2, 3, 4, 5).anyMatch(integer -> integer.equals(3))); //T

        // 是否没有3
        System.out.println(Stream.of(1, 2, 3, 4, 5).noneMatch((integer -> integer.equals(3)))); //F

        // 获取第一个元素
        Optional<Integer> optionalInteger = Stream.of(1, 2, 3, 4).findFirst();
        System.out.println(optionalInteger.get());

        System.out.println(Stream.of(1, 2, 3, 4).findFirst().get());

        // 匹配学生名字是否都是"zhangsan"
        System.out.println(StudentService.getStudents().stream().allMatch(student -> student.getName().equals("zhangsan"))); //F

        // 匹配学生名字至少一个是"zhangsan"
        System.out.println(StudentService.getStudents().stream().anyMatch(student -> student.getName().equals("zhangsan"))); //T

        // 匹配学生名字是否没有"zhangsan"
        System.out.println(StudentService.getStudents().stream().noneMatch(student -> student.getName().equals("zhangsan"))); //F

        // 获得第一个学生
        System.out.println(StudentService.getStudents().stream().findFirst().get()); // 万一为 null 就寄
        Optional<Student> first = StudentService.getStudents().stream().findFirst(); // 优化
        first.ifPresent(System.out::println);

        // 获得第四个学生
        System.out.println(StudentService.getStudents().stream().skip(3).findFirst().get());
    }
}
