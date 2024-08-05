package com.lhl.exercise.lambda;

import java.util.function.Function;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_15:10
 */
public class LambdaTest16 {
    /*
     *  构造方法引用
     * */
    public static void main(String[] args) {
        // 使用转换型的函数式接口
        Function<String, Person> function = new Function<String, Person>() {
            @Override
            public Person apply(String s) {
                return new Person(s);
            }
        };
        System.out.println(function.apply("张三"));

        Function<String, Person> function1 = s -> new Person(s);
        System.out.println(function1.apply("李四"));

        Function<String, Person> function2 = Person::new;
        System.out.println(function2.apply("王五"));
    }
}

class Person {
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
}
