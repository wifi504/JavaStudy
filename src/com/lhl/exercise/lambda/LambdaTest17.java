package com.lhl.exercise.lambda;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_15:13
 */
public class LambdaTest17 {
    /*
     *  数组引用
     *      语法格式
     *          数组::new
     *      条件
     *          1. 函数式接口中方法只有一个整数型参数
     *          2. 这个整数型参数正好是数组长度
     *          3. 返回值类型相同
     * */
    public static void main(String[] args) {
        Function<Integer, int[]> function = new Function<Integer, int[]>() {
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }
        };
        int[] nums = function.apply(10);
        System.out.println(Arrays.toString(nums));

        Function<Integer, int[]> function1 = l -> new int[l];
        int[] nums1 = function1.apply(20);
        System.out.println(Arrays.toString(nums1));

        Function<Integer, int[]> function2 = int[]::new;
        int[] nums2 = function2.apply(30);
        System.out.println(Arrays.toString(nums2));
    }
}
