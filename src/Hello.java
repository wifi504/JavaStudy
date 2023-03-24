public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello IDEA");
        System.out.println("你好 IDEA");
        Dog dog = new Dog();
        dog.setAge(18);
        System.out.println(dog.getAge());
        Dog dog1 = new Dog(5);
        System.out.println(dog1.getAge());
        if (dog.getAge() == 5) {
            System.out.println("狗为5岁条件为真！");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("1");
            }
        }
        int[] a = new int[5];
        for (int k = 0; k < 8; ++k) {
            System.out.printf("非常高级的第%d个句子\n", k);
        }
    }
}

class Dog {
    private int age;

    public Dog() {
    }

    public Dog(int age) {
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("调用setAge方法设置狗的年龄！");
        this.age = age;
    }
}