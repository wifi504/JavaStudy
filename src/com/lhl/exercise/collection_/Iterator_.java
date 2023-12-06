package com.lhl.exercise.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/6_15:28
 */
public class Iterator_ {
    // 迭代器
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        System.out.println(col);

        // 遍历集合，一本一本打印

        // 1. 先得到集合对应的迭代器
        Iterator iterator = col.iterator();
        // 2. 使用while循环遍历 (这一坨代码可以使用 itit 快捷生成，快捷模板 Ctrl + J 查看)
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
            System.out.println(obj.getClass());
        }
        // 3. 当退出遍历后，迭代器指向最后元素，再执行会抛出异常
        try {
            System.out.println(iterator.next());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        // 4. 如果希望再次遍历，需要重置迭代器指针
        iterator = col.iterator();
        try {
            System.out.println(iterator.next());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
