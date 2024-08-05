package com.lhl.exercise.streamAPI;

import java.util.Comparator;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_17:23
 */
public class StreamAPITest12 {
    /*
     *  StreamAPI终止操作之  reduce
     *      Stream对象的 count()、max()、min() 方法等，底层是使用reduce实现的
     * */
    public static void main(String[] args) {
        // 获得元素个数
        System.out.println(StudentService.getStudents().stream().count());
        System.out.println(StudentService.getStudents().size());

        // 获得年龄最大的学生
        System.out.println(StudentService.getStudents().stream().max(Comparator.comparingInt(Student::getAge)).get());

        // 获得年龄最小学生
        System.out.println(StudentService.getStudents().stream().min(Comparator.comparingInt(Student::getAge)).get());

    }
}
