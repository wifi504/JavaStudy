package com.lhl.exercise.collection_.list_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/6_16:44
 */

@SuppressWarnings({"all"})
public class ListEx01 {
    /*
        使用 List 的实现类添加三本书，并遍历，打印如下结果

        名称：xx   价格：xx   作者：xx
        名称：xx   价格：xx   作者：xx
        名称：xx   价格：xx   作者：xx

        要求：
        1. 按照价格排序，从低到高（使用冒泡法）
        2. 要求使用 ArrayList、LinkedList、Vector 三种集合实现
     */

    public static void main(String[] args) {
        List arrayListBooks = new ArrayList();
        List linkedListBooks = new LinkedList();
        List vectorBooks = new Vector();

        Book[] books = new Book[5];
        books[0] = new Book("C程序设计", 68.5, "小明");
        books[1] = new Book("Java程序设计", 50.3, "小张");
        books[2] = new Book("Python入门到精通", 9.9, "小红");
        books[3] = new Book("数据结构与算法", 99.9, "小强");
        books[4] = new Book("计算机网络基础", 80.6, "小刚");

        for (Book book : books) {
            arrayListBooks.add(book);
            linkedListBooks.add(book);
            vectorBooks.add(book);
        }

        sortByPrice(arrayListBooks);
        sortByPrice(linkedListBooks);
        sortByPrice(vectorBooks);

        System.out.println("-------- ArrayList --------");
        for (Object arrayListBook : arrayListBooks) {
            System.out.println(arrayListBook);
        }
        System.out.println("-------- LinkedList --------");
        for (Object linkedListBook : linkedListBooks) {
            System.out.println(linkedListBook);
        }
        System.out.println("-------- Vector --------");
        for (Object vectorBook : vectorBooks) {
            System.out.println(vectorBook);
        }
    }

    static void sortByPrice(List list) {
        Object temp = null;
        int size = list.size();
        for (int i = 0; i < size - 1; ++i) {
            for (int j = 0; j < size - i - 1; ++j) {
                if (((Book) list.get(j)).getPrice() > ((Book) list.get(j + 1)).getPrice()) {
                    temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}

class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称：" + this.name + "\t价格：" + this.price + "\t作者：" + this.author;
    }
}
