package com.lhl.exercise.reflect;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_14:31
 */
public class ReflectTest05 {
    public static void main(String[] args) {
        Class c = "字符串".getClass();
        System.out.println(c.getName()); //java.lang.String
        System.out.println(c.getSimpleName()); //String
    }
}
