package com.lhl.exercise.streamAPI;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_16:35
 */
public class StreamAPITest07 {
    /*
     *  StreamAPI中间操作之  sorted
     *      排序
     * */
    public static void main(String[] args) {
        Stream.of(1, 2, 8, 4, 3, 100, 12, 9, 60).sorted().forEach(System.out::println);
        Stream.of("ccc", "bbb", "aaa", "abc").sorted().forEach(System.out::println);

        // 按照学生年龄升序排序后输出学生对象
        StudentService.getStudents().stream().sorted((Comparator.comparingInt(Student::getAge))).forEach(System.out::println);

        System.out.println("-----------");
        // 按照学生年龄降序排序后输出学生对象
        StudentService.getStudents().stream().sorted((o1, o2) -> o2.getAge() - o1.getAge()).forEach(System.out::println);

        // 按照学生年龄升序排序后输出学生年龄
        StudentService.getStudents().stream().map(Student::getAge).sorted().forEach(System.out::println);

        System.out.println("-----------");
        // 按照学生年龄升序排序后输出学生年龄
        StudentService.getStudents().stream().map(Student::getAge).sorted((o1, o2) -> o2 - o1).forEach(System.out::println);
    }
}
