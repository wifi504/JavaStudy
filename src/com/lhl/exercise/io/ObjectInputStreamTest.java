package com.lhl.exercise.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author lhl
 * Version 1.0
 * Create on 2024/7/25 14:15
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("testFiles/testDates"))) {
            Object readObject = ois.readObject();
            if (readObject instanceof ArrayList<?>) {
                ((ArrayList<?>) readObject).forEach(System.out::println);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
