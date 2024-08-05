package com.lhl.exercise.streamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_16:19
 */
public class StreamAPITest05 {
    /*
     *  StreamAPI中间操作之  map
     *      映射、转换
     * */
    public static void main(String[] args) {
        // 把字符串中所有字母转化为大写
        Stream.of("abc", "de", "fgh", "xyz").map(String::toUpperCase).forEach(System.out::println);

        // 获得集合中所有学生的名字
        StudentService.getStudents().stream()
                .map(Student::getName).forEach(System.out::println);


        System.out.println("------------------");
        // 获取集合中性别为男的名字
        StudentService.getStudents().stream()
                .filter(student -> "男".equals(student.getGender()))
                .map(Student::getName).forEach(System.out::println);

        // 将多个集合中的数据合并到一个流中
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // 扁平 flatMap
        Stream<ArrayList<Integer>> stream = Stream.of(list1, list2);
        stream.flatMap(ArrayList::stream).forEach(System.out::println);
    }
}
