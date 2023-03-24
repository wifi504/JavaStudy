package com.lhl.javaCode;

public class Homework03 {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("张三", 28, "青铜", 3500);
        Teacher teacher2 = new Professor("李四", 35, "王者", 15000);
        Teacher teacher3 = new AssociateProfessor("王五", 45, "钻石", 7800);
        Teacher teacher4 = new Lecturer("赵六", 50, "星耀", 12000);

        teacher1.introduce();
        teacher2.introduce();
        teacher3.introduce();
        teacher4.introduce();
    }
}

// 教师类
class Teacher {

    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("教师" + this);
    }

    @Override
    public String toString() {
        return "姓名：" + getName() + " 年龄：" + getAge() + " 职称：" + getPost() + " 工资：" + getSalary();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPost() {
        return post;
    }

    public double getSalary() {
        return salary;
    }

}

// 教授类
class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary() * 1.3;
    }

    @Override
    public void introduce() {
        System.out.println("教授" + this);
    }
}

// 副教授类
class AssociateProfessor extends Teacher {
    public AssociateProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary() * 1.2;
    }

    @Override
    public void introduce() {
        System.out.println("副教授" + this);
    }
}

// 讲师类
class Lecturer extends Teacher {
    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary() * 1.1;
    }

    @Override
    public void introduce() {
        System.out.println("讲师" + this);
    }
}