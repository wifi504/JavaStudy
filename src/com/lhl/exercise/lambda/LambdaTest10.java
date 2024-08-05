package com.lhl.exercise.lambda;

import java.util.function.Supplier;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_14:36
 */
public class LambdaTest10 {
    /*
     *  实例方法引用
     *  语法格式
     *      对象::实例方法名字;
     *  什么条件可以使用实例方法引用？
     *      函数式接口中的     返回值类型   和   形参
     *      与
     *      内部调用方法的     返回值类型   和   形参
     *      一致
     * */

    public static void main(String[] args) {
        // 使用生产型接口 Supplier
        Teacher teacher = new Teacher("张三");
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return teacher.getName();
            }
        };
        System.out.println(supplier.get());

        // 以上是否符合实例方法引用条件？
        Supplier<String> supplier1 = () -> teacher.getName();
        System.out.println(supplier1.get());

        Supplier<String> supplier2 = teacher::getName;
        System.out.println(supplier2.get());
    }
}

class Teacher {
    private String name;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(String name) {
        this.name = name;
    }
}


