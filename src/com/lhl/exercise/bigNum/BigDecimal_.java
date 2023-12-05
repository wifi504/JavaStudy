package com.lhl.exercise.bigNum;

import java.math.BigDecimal;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/5_12:36
 */
public class BigDecimal_ {
    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal("1999.6546415641564564615641646541564154654154");
        BigDecimal bigDecimal1 = new BigDecimal("333.3333");

        // +
        System.out.println(bigDecimal.add(bigDecimal1));

        // -
        System.out.println(bigDecimal.subtract(bigDecimal1));

        // *
        System.out.println(bigDecimal.multiply(bigDecimal1));

        // /
        System.out.println(bigDecimal.divide(bigDecimal1, BigDecimal.ROUND_CEILING));
    }
}
