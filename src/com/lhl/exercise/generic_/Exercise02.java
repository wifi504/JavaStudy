package com.lhl.exercise.generic_;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WIFI连接超时
 * @version 1.0
 * Create Time: 2023/12/13_16:35
 */
public class Exercise02 {
    public static void main(String[] args) {
        DAO<User> userDAO = new DAO<>();

        userDAO.save("1", new User(1, 18, "张三"));
        userDAO.save("2", new User(2, 22, "李四"));
        userDAO.save("3", new User(3, 5, "王五"));

        System.out.println(userDAO.get("1"));
        System.out.println(userDAO.get("2"));
        System.out.println(userDAO.get("3"));

        userDAO.update("3", new User(3, 15, "王五"));

        System.out.println(userDAO.list());

        userDAO.delete("2");

        System.out.println(userDAO.list());
    }

    @Test
    public void testList() {
        DAO<User> userDAO = new DAO<>();

        userDAO.save("1", new User(1, 18, "张三"));
        userDAO.save("2", new User(2, 22, "李四"));
        userDAO.save("3", new User(3, 5, "王五"));

        List<User> list = userDAO.list();
        System.out.println(list);
    }
}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> tList = new ArrayList<>();
        for (String key : map.keySet()) {
            tList.add(map.get(key));
        }
        return tList;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}