package com.lhl.oopExercise.override_;

public class Exercise {
    public static void main(String[] args) {

        Person person = new Person("jack", 18);
        System.out.println(person.say());

        Student smith = new Student("smith", 15, 112233, 89);
        System.out.println(smith.say());
    }
}
