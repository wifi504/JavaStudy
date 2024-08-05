package com.lhl.exercise.streamAPI;

import java.util.stream.Stream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_17:07
 */
public class StreamAPITest11 {
    /*
     *  StreamAPI终止操作之  reduce
     *      归约、总结
     *      将流中的所有数据按照指定规则最后计算出一个结果
     * */
    public static void main(String[] args) {

        // 获取所有元素求和
        // Integer i = Stream.of(1, 2, 3, 4).reduce((old, value) -> old + value).get();
        System.out.println(Stream.of(1, 2, 3, 4).reduce(Math::addExact).get());

        // 获取所有元素相乘
        System.out.println(Stream.of(1, 2, 3, 4).reduce(Math::multiplyExact).get());

        // 获取最大长度的元素
        System.out.println(Stream.of("abc", "de", "hello world", "zhangsan")
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get());

        // 获得所有学生总年龄
        System.out.println(StudentService.getStudents().stream().map(Student::getAge).reduce(Math::addExact).get());

        // 获得10和集合中所有元素相加的结果
        System.out.println(Stream.of(1, 2, 3, 4).reduce(10, Math::addExact));
    }
}
