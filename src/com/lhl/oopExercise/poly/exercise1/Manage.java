package com.lhl.oopExercise.poly.exercise1;

public class Manage extends Employee {
    private double bonus;

    public Manage(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("经理 " + getName() + " 正在管理...");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
