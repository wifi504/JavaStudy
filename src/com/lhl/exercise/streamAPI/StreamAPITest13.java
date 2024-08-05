package com.lhl.exercise.streamAPI;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_17:28
 */
public class StreamAPITest13 {
    /*
     *  StreamAPI终止操作之  collect
     *      收集
     * */
    public static void main(String[] args) {
        // 将流中元素全部收集到一个集合中，具体是哪种不知道
        List<String> list = Stream.of("zhangsan", "lisi", "wangwu").collect(Collectors.toList());
        System.out.println(list);

        // 收集为Set集合，具体是哪种不知道
        Set<String> set = Stream.of("zhangsan", "lisi", "wangwu", "wangwu").collect(Collectors.toSet());
        System.out.println(set);

        // 收集为Map
//        Map<String, String> map = Stream.of("1:zhangsan", "2:lisi", "3:wangwu").collect(Collectors.toMap(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s.substring(0, s.indexOf(":"));
//            }
//        }, new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s.substring(s.indexOf(":") + 1);
//            }
//        }));
        Map<String, String> map = Stream.of("1:zhangsan", "2:lisi", "3:wangwu")
                .collect(Collectors.toMap(s -> s.substring(0, s.indexOf(":")),
                        s -> s.substring(s.indexOf(":") + 1)));
        System.out.println(map);
    }
}
