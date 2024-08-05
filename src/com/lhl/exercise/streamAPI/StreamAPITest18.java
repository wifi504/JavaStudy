package com.lhl.exercise.streamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_18:05
 */
public class StreamAPITest18 {
    /*
     *  StreamAPI终止操作之  collect
     *      分组：groupingBy
     * */
    public static void main(String[] args) {
        // 按性别分组
        Map<String, List<Student>> genderMap = StudentService.getStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));
        genderMap.forEach((k, v) -> System.out.println(k + " =====> " + v));

    }
}
