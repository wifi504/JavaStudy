package com.lhl.exercise.io;

import java.io.*;

/**
 * @author lhl
 * Version 1.0
 * Create on 2024/7/25 11:18
 */
public class BufferedReaderWriterTest {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("testFiles/test3.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("testFiles/test5.txt"))) {

            // 可以一次读一行
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
