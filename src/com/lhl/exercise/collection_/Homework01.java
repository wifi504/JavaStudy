package com.lhl.exercise.collection_;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/8_17:11
 */
public class Homework01 {
    /*
        按要求实现:
        (1) 封装一个新闻类，包含标题和内容属性，提供get、set方法，重写toString方法，打印对象时只打印标题;
        (2) 只提供一个带参数的构造器，实例化对象时，只初始化标题;并且实例化两个对象
                新闻一:新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧
                新闻二:男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生
        (3) 将新闻对象添加到ArrayList集合中，并且进行倒序遍历;
        (4) 在遍历集合过程中，对新闻标题进行处理，超过15字的只保留前15个，然后在后边加“…."
        (5) 在控制台打印遍历出经过处理的新闻标题;

     */
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new News("新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧"));
        list.add(new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生"));
        list.add(new News("蔡徐坤打篮球"));

        for (int i = list.size() - 1; i >= 0; --i) {
            System.out.println(list.get(i));
        }
    }
}

class News {
    private String title;
    private String text;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        int MAX_LENGTH = 15;
        if (title.length() <= MAX_LENGTH) {
            return title;
        } else {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < MAX_LENGTH; i++) {
                str.append(title.charAt(i));
            }
            str.append("...");
            return str.toString();
        }
    }

    // 示例方法
    public String processTitle(String title) {
        if (title == null) return "";

        if (title.length() <= 15) {
            return title;
        } else {
            return title.substring(0, 15) + "...";
        }
    }
}