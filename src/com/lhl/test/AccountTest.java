package com.lhl.test;

public class AccountTest {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setName("张三");
        ac.setMoney(5);
        ac.setPassword("153566");


        Account ac1 = new Account("李四哈哈哈哈哈哈哈哈哈哈哈哈",88,"123");

        ac.info();
        ac1.info();

    }
}