package com.lhl.exercise.usefulClassEx;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/5_20:17
 */
public class Ex02 {
    /*
        输入用户名、密码、邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
        要求：
        （1）用户名长度为2或3或4 isUsrName()
        （2）密码长度为6，要求全是数字 isDigital()
        （3）邮箱中包含@和. 并且@在.的前面 isEmail()
     */

    static boolean isUsrName(String str) {
        return !(str.length() < 2 || str.length() > 4);
    }

    static boolean isDigital(String str) {
        if (str.length() != 6) return false;
        // 这里其实可以直接判定 char 是不是处在 ASCII 码值范围内，没必要这样复杂
        // 也可以强转 Integer 看看会不会抛出异常
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < str.length(); ++i) {
            if (Arrays.binarySearch(num, str.charAt(i)) < 0) return false;
        }
        return true;
    }

    static boolean isEmail(String str) {
        int a = str.lastIndexOf("@");
        int b = str.lastIndexOf(".");
        return a > 0 && b > 0 && a < b;
    }

    public static void main(String[] args) {
        System.out.println("请输入您的信息");
        Scanner input = new Scanner(System.in);
        System.out.print("用户名：");
        String usrName = input.next();
        System.out.print("密码：");
        String pwd = input.next();
        System.out.print("邮箱：");
        String email = input.next();

        try {
            if (isUsrName(usrName) && isDigital(pwd) && isEmail(email)) {
                System.out.println("恭喜！注册成功");
            } else {
                if (!isUsrName(usrName)) System.out.println("用户名输入不合法！");
                if (!isDigital(pwd)) System.out.println("密码不是有效密码！");
                if (!isEmail(email)) System.out.println("电子邮件输入不合法！");
                throw new RuntimeException("错误的注册");
            }
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }

    }
}
