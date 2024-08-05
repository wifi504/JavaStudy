package com.lhl.exercise.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_17:45
 */
public class StreamAPITest15 {
    /*
     *  获得年龄大于18岁的女同学，返回升序排序后的List集合
     * */
    public static void main(String[] args) {
        ArrayList<Student> arrayList = StudentService.getStudents().stream()
                .filter(student -> student.getGender().equals("女"))
                .filter(student -> student.getAge() > 18)
                .sorted(Comparator.comparingInt(Student::getAge))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(arrayList);
    }
}
