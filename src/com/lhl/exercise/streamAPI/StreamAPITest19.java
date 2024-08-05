package com.lhl.exercise.streamAPI;

import java.util.stream.Collectors;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_18:07
 */
public class StreamAPITest19 {
    /*
     *  StreamAPI终止操作之  collect
     *      接合：joining
     * */
    public static void main(String[] args) {
        // 将所有学生姓名连接成字符串，每个名字用", "拼接
        String s = StudentService.getStudents().stream()
                .map(Student::getName).collect(Collectors.joining(", "));
        System.out.println(s);
    }
}
