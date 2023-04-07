package com.lhl.exercise.chapter10To11_AbstractInterfaceInnerClassEnumeration_homework;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/04/07_20:53
 */
public class Homework06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧", new Boat());
        person.common();
        person.passRiver();
        person.common();
        person.passFireHill();
        person.passRiver();
        person.common();
    }
}

interface Vehicles {
    void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("一般情况，交通工具为 Horse");
        System.out.println(this);
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("遇到大河，交通工具为 Boat");
        System.out.println(this);
    }
}

class Plane implements Vehicles {
    @Override
    public void work() {
        System.out.println("遇到火焰山，交通工具为 Plane");
        System.out.println(this);
    }
}

class TrafficToolsFactory {

    private static Horse horse = new Horse();

    public static Horse getHourse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane() {
        return new Plane();
    }
}

class Person {

    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        if (!(vehicles instanceof Boat)) {
            vehicles = TrafficToolsFactory.getBoat();
        }

        vehicles.work();
    }

    public void common() {
        if (!(vehicles instanceof Horse)) {
            vehicles = TrafficToolsFactory.getHourse();
        }

        vehicles.work();
    }

    public void passFireHill() {
        if (!(vehicles instanceof Plane)) {
            vehicles = TrafficToolsFactory.getPlane();
        }

        vehicles.work();
    }
}