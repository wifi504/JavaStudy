package com.lhl.exercise.reflect;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_10:39
 */
public class ReflectTest01 {
    /*
     *  1. 反射机制是 JDK 中的一套类库，这套类库可以帮助我们操作、读取 class 字节码文件
     *  2. 后期学习的大量 Java 框架，底层都是基于反射机制实现的，所以必须掌握
     *  3. 反射机制可以让程序更加灵活
     *  4. 反射机制最核心的几个类：
     *      java.lang.Class: Class类型的实例代表着硬盘上的某个class文件，或者说代表某一类型
     *      java.lang.reflect.Filed: Filed类型的实例代表类中的属性/字段
     *      java.lang.reflect.Constructor: Constructor类型的实例代表类中的构造方法
     *      java.lang.reflect.Method: Method类型的实例代表类中的方法
     *  5. 在 Java 语言中获得 Class 的三种方式
     *      第一种方式：Class c = Class.forName("完整的全限定类名")
     *          注意：   1. 全限定类名是带有包名的
     *                  2. 是lang包下的，java.lang也不能省略
     *                  3. 这个是字符串参数
     *                  4. 如果这个类不存在，则运行时抛异常 java.lang.ClassNotFoundException
     *                  5. 这个方法的执行会导致类的加载动作发生
     *      第二种方式：Class c = obj.getClass()
     *          注意：这种方法是通过引用去调用的
     *      第三种方式：在 Java 语言中，任何一种类型，包括基本数据类型，都有.class属性，用这个属性就可以获取class实例
     * */

    public static void main(String[] args) throws ClassNotFoundException {
        // stringClass 就代表 String 类型
        // stringClass 就代表硬盘上的 String.class 文件
        Class stringClass = Class.forName("java.lang.String");

        // 获取 User 类型
        Class userClass = Class.forName("com.lhl.exercise.reflect.User");

        String s1 = "Hello World!";
        Class stringClass2 = s1.getClass();

        // 某种类型的字节码文件在内存中只有一份
        System.out.println(stringClass == stringClass2); // true

        User user = new User("张三", 20);
        Class userClass2 = user.getClass();
        System.out.println(userClass2 == userClass); // true

        // intClass 代表的就是基本数据类型 int类型
        Class intClass = int.class;
        Class doubleClass = double.class;
        Class stringClass3 = String.class;
        Class userClass3 = User.class;

        System.out.println(stringClass3 == stringClass); // true



    }
}
