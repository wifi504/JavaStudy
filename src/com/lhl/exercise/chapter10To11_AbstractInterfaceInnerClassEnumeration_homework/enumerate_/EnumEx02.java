package com.lhl.exercise.chapter10To11_AbstractInterfaceInnerClassEnumeration_homework.enumerate_;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/04/07_15:21
 */
public class EnumEx02 {
    public static void main(String[] args) {

        Week[] values = Week.values();
        System.out.println("===所有星期如下===");
        for (Week week : values) {
            System.out.println(week);
        }
    }
}

enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    private final String day;

    Week(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return day;
    }
}