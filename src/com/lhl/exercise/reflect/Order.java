package com.lhl.exercise.reflect;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_15:40
 */
public class Order {
    private String no;
    private double price;
    private String state;

    public Order() {
    }

    public Order(double price, String no) {
        this.price = price;
        this.no = no;
    }

    public Order(String no, double price, String state) {
        this.no = no;
        this.price = price;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "no='" + no + '\'' +
                ", price=" + price +
                ", state='" + state + '\'' +
                '}';
    }
}
