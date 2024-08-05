package com.lhl.exercise.streamAPI;

import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_17:56
 */
public class StreamAPITest17 {
    /*
     *  StreamAPI终止操作之  collect
     *      统计相关
     *          计数
     *          平均值
     *          最值
     *          求和
     *          ...
     * */
    public static void main(String[] args) {
        // 获取元素个数
        System.out.println(StudentService.getStudents().stream().count()); // reduce
        System.out.println(StudentService.getStudents().stream().collect(Collectors.counting())); // collect

        // 获取学生平均年龄
        Double avgAge = StudentService.getStudents().stream().collect(Collectors.averagingDouble(Student::getAge));
        System.out.println(avgAge);

        // 获得最大年龄学生
        Student student = StudentService.getStudents().stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Student::getAge))).get(); // collect
        System.out.println(student);

        Student student1 = StudentService.getStudents().stream()
                .max(Comparator.comparingInt(Student::getAge)).get(); // reduce
        System.out.println(student1);

        // 获得所有年龄之和
        System.out.println(StudentService.getStudents().stream().collect(Collectors.summingInt(Student::getAge)));

        // 获得年龄的所有信息
        System.out.println(StudentService.getStudents().stream().collect(Collectors.summarizingDouble(Student::getAge)));
    }
}
