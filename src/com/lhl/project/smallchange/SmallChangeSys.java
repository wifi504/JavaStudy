package com.lhl.project.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {

        // 变量初始化
        Scanner input = new Scanner(System.in);
        String str = "";
        double money = 0;
        double balance = 0;
        String info = "";
        boolean loop = true;
        String detail = "";
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        do {
            // 主界面
            System.out.println("\n====================零钱通菜单====================");
            System.out.println("\t\t\t\t1 零钱通明细");
            System.out.println("\t\t\t\t2  收益入账");
            System.out.println("\t\t\t\t3 消     费");
            System.out.println("\t\t\t\t4 退     出");
            System.out.print("请选择(1-4): ");
            str = input.next();

            // 判断输入
            switch (str) {
                case "1":
                    System.out.println("--------------------零钱通明细--------------------");
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.print("2 收益入账 输入金额：");
                    money = input.nextDouble();
                    if (money <= 0) {
                        System.out.println("收益入账金额必须大于0！");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    detail += "收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额：" + balance + "\n";
                    break;
                case "3":
                    System.out.print("3 消费 输入金额：");
                    money = input.nextDouble();
                    if (money <= 0) {
                        System.out.println("消费金额必须大于0！");
                        break;
                    } else if (money > balance) {
                        System.out.println("您的余额不足，无法完成本次消费！");
                        break;
                    }
                    System.out.print("请输入消费内容：");
                    info = input.next();
                    balance -= money;
                    date = new Date();
                    detail += info + "\t-" + money + "\t" + sdf.format(date) + "\t余额：" + balance + "\n";
                    break;
                case "4":
                    System.out.println("4 退     出");
                    // 确认用户退出，必须输入y/n
                    String exitStr;
                    while (true) {
                        System.out.println("你确认要退出零钱通吗？(y/n)");
                        exitStr = input.next();
                        if ("y".equals(exitStr) || "n".equals(exitStr)) {
                            break;
                        }
                        System.out.println("你的输入有误，请重新输入！");
                    }
                    // 退出系统
                    loop = !"y".equals(exitStr);
                    break;
                default:
                    System.out.println("您的输入有误，请检查输入！");
                    break;
            }
        } while (loop);

        System.out.println("系统已退出...");
    }
}
