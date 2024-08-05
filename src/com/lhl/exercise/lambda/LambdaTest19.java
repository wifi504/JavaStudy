package com.lhl.exercise.lambda;

import java.util.TreeSet;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_15:22
 */
public class LambdaTest19 {
    /*
     *  Set foreach 结合 lambda
     * */
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(100);
        treeSet.add(100);
        treeSet.add(200);
        treeSet.add(300);
        treeSet.add(400);
        treeSet.add(5);

        treeSet.forEach(System.out::println);
    }
}
