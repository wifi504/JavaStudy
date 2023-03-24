package com.lhl.poly.exercise1;

public class Test {
    public static void main(String[] args) {
        Employee aa = new Worker("aa", 8000);
        Employee bb = new Manage("bb", 10000, 200000);

        Test test = new Test();
        test.testWork(aa);
        test.showEmpAnnual(aa);
        test.testWork(bb);
        test.showEmpAnnual(bb);
    }

    public void showEmpAnnual(Employee e) {
        System.out.println("年薪为：" + e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manage) {
            ((Manage) e).manage();
        }
    }
}
