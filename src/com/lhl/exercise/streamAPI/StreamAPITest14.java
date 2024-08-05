package com.lhl.exercise.streamAPI;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_17:39
 */
public class StreamAPITest14 {
    /*
     *  StreamAPI终止操作之  collect
     *      收集
     * */
    public static void main(String[] args) {

        // 以ArrayList集合进行收集
        ArrayList<String> arrayList = Stream.of("zhangsan", "lisi", "wangwu", "wangwu")
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(arrayList);

        // 以LinkedList集合进行收集
        LinkedList<String> linkedList = Stream.of("zhangsan", "lisi", "wangwu", "wangwu")
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedList);

        // 以TreeSet集合收集
        TreeSet<String> treeSet = Stream.of("zhangsan", "lisi", "wangwu", "wangwu")
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);

    }
}
