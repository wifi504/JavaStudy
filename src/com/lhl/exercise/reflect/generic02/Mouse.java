package com.lhl.exercise.reflect.generic02;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_17:09
 */
public class Mouse implements Flyable<String, Integer>, Comparable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
