package com.lhl.exercise.streamAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_16:09
 */
public class StudentService {
    public static List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("zhangsan", 20, "男"));
        studentList.add(new Student("lisi", 21, "男"));
        studentList.add(new Student("wangwu", 22, "女"));
        studentList.add(new Student("zhaoliu", 18, "男"));
        studentList.add(new Student("qianqi", 19, "女"));
        studentList.add(new Student("qianqi", 19, "女"));
        studentList.add(new Student("qianqi", 19, "女"));
        studentList.add(new Student("qianqi", 19, "女"));
        studentList.add(new Student("qianqi", 19, "女"));
        return studentList;
    }
}
