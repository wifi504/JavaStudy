package com.lhl.exercise.bigNum;

import java.math.BigInteger;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/5_12:29
 */
public class BigInteger_ {
    public static void main(String[] args) {

        BigInteger bigInteger = new BigInteger("115416565415416144646416165155656156156156165");
        BigInteger bigInteger1 = new BigInteger("114514464646461656415");
        System.out.println(bigInteger);

        // +
        System.out.println(bigInteger.add(bigInteger1));

        // -
        System.out.println(bigInteger.subtract(bigInteger1));

        // *
        System.out.println(bigInteger.multiply(bigInteger1));

        // /
        System.out.println(bigInteger.divide(bigInteger1));

    }
}
