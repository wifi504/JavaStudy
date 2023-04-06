package com.lhl.oopExercise.innerClass;

public class InnerClass01 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了...");
            }
        });
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴们上课了...");
            }
        });
    }
}

interface Bell {
    void ring();
}

class Cellphone {
    void alarmClock(Bell bell) {
        bell.ring();
    }
}