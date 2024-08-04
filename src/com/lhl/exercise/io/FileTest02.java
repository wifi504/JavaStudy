package com.lhl.exercise.io;

import java.io.File;
import java.io.FileFilter;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_16:22
 */
public class FileTest02 {
    public static void main(String[] args) {
        File file = new File("C:/Windows");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }

        System.out.println("============ 所有的文件夹如下 ===========");
        File[] floders = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
        for (File floder : floders) {
            System.out.println(floder.getName());
        }

        System.out.println("============ 所有的文件如下 ===========");
        File[] file2s = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });
        for (File file2 : file2s) {
            System.out.println(file2.getName());
        }
    }
}
