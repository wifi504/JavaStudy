package com.lhl.exercise.exception_;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/04/08_16:34
 */
public class Homework01 {

    public static void main(String[] args) {

        try {
            // 传入参数数量必须为2
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数数量不为2！");
            }

            // 转换整数
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            // 计算返回
            System.out.println("计算结果为：" + cal(n1, n2));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("参数错误: " + e.toString());
        } catch (NumberFormatException e) {
            System.out.println("格式错误: " + e.toString());
        } catch (ArithmeticException e) {
            System.out.println("数学错误: " + e.toString());
        }
    }

    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}
