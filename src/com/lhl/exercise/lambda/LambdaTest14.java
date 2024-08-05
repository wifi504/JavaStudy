package com.lhl.exercise.lambda;

import java.util.function.Function;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_14:59
 */
public class LambdaTest14 {
    /*
     *  特殊方法引用
     * */
    public static void main(String[] args) {
        Function<Vip, String> function = new Function<Vip, String>() {
            @Override
            public String apply(Vip vip) {
                return vip.getName();
            }
        };
        Vip vip = new Vip("李四");
        System.out.println(function.apply(vip));

        Function<Vip, String> function1 = v -> v.getName();
        System.out.println(function1.apply(vip));

        Function<Vip, String> function2 = Vip::getName;
        System.out.println(function2.apply(vip));
    }
}

class Vip {
    private String name;

    @Override
    public String toString() {
        return "Vip{" + "name='" + name + '\'' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vip(String name) {
        this.name = name;
    }
}
