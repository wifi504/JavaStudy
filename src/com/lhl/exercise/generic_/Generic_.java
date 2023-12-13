package com.lhl.exercise.generic_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/10_20:23
 */
public class Generic_ {
    /*
        泛型

        1. 泛型又称为 参数化类型，是JDK5.0出现的新特性，解决数据类型安全性问题
        2. 在类声明或实例化时只要指定好具体类型即可
        3. Java 泛型可以保证程序在编译时没有发出警告，运行时就不会产生 ClassCastException 异常
        4. 使代码更加简洁与健壮

        泛型声明语法

        interface 接口<T> {}
        class 类<K, V> {}

        1. 其中，T、K、V不代表值，而是表示类型，可以使用任意字母，常用T（Type）表示
        2. 泛型只能是引用类型，不能放基本数据类型
        3. 在给泛型传入指定具体类型后，可以传入该类型或其子类型

        泛型实例化

        List<String> strList = new ArrayList<String>();
        Iterator<Customer> iterator = customer.iterator();

        不写泛型，默认会是 Object
        List list = new ArrayList();
        等价于
        List<Object> list = new ArrayList<>();

        自定义泛型
        class 类<T, R...> {
            成员;
        }
        1. 如上所述，即为自定义泛型类
        2. T、R等为泛型的标识符，一般是单个大写字母
        3. 泛型的标识符可以有多个
        4. 普通成员可以使用泛型（属性、方法）
        5. 使用泛型的数组，不能初始化
        6. 静态方法中不能使用类的泛型

        自定义泛型接口
        interface 接口<T, R...> {}
        1. 接口中，静态成员不能使用泛型
        2. 泛型接口的类型，在继承接口或实现接口时确定
        3. 没有指定类型，默认为 Object

        自定义泛型方法
        public <T, R> void fly(T t, R r) {}
        1. 可以定义在普通类，也可以定义在泛型类中
        2. 泛型方法在被调用时，类型才会确定
        3. public void eat(E e) {} 修饰符后面没有<> eat方法不是泛型方法，只是使用了泛型

        泛型不具备继承性
        // List<Object> list = new ArrayList<String>(); // 错误

        泛型上限
        List<? extends AA> c    只接受AA及其实现子类
        泛型下限
        List<? super BB> c      只接受BB及其超类


     */

    public static void main(String[] args) {
        Student s1 = new Student("小明", 18);
        Student s2 = new Student("小红", 19);
        Student s3 = new Student("小刚", 17);

        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(s1);
        studentHashSet.add(s2);
        studentHashSet.add(s3);

        for (Student student : studentHashSet) {
            System.out.println(student);
        }

        HashMap<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(s1.name, s1);
        studentHashMap.put(s2.name, s2);
        studentHashMap.put(s3.name, s3);

        for (String name : studentHashMap.keySet()) {
            System.out.println(studentHashMap.get(name));
        }

        Iterator<Map.Entry<String, Student>> entryIterator = studentHashMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Student> entry = entryIterator.next();
            System.out.println(entry.getValue());
        }

        Pig<A> pig = new Pig<A>(new A());
        Pig<A> pig1 = new Pig<A>(new B()); // 子类

    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class A {
}

class B extends A {
    public <T, R> void fly(T t, R r) {
    }
}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }
}