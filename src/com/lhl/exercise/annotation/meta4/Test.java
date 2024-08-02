package com.lhl.exercise.annotation.meta4;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_11:24
 */
public class Test {
    // 可重复的注解
    @Author(name = "张三")
    @Author(name = "李四")
    @Author(name = "王五")
    void doSome() {

    }
}
