package com.lhl.exercise.streamAPI;

import java.util.stream.Stream;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_16:45
 */
public class StreamAPITest08 {
    /*
     *  StreamAPI中间操作之  concat
     *      合并
     * */
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);

        Stream.concat(stream1, stream2).forEach(System.out::println);
    }
}
