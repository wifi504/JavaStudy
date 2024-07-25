package com.lhl.exercise.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_16:33
 */
public class CopyDir {
    public static void main(String[] args) {
        File src = new File("src"); // 拷贝的路径
        File dest = new File("C:/test"); // 目标位置
        copy(src, dest);
    }

    private static void copy(File src, File dest) {
        if (src.isFile()) { // 如果是文件，直接拷贝然后出栈
            try (FileInputStream fis = new FileInputStream(src);
                 FileOutputStream fos = new FileOutputStream(dest.getAbsoluteFile()
                         + src.getAbsolutePath().substring(2))) {
                byte[] bytes = new byte[1024];
                int readCount = 0;
                while ((readCount = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, readCount);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        // 如果是目录，判断有没有，没有就创建
        File newDir = new File(dest.getAbsoluteFile() + src.getAbsolutePath().substring(2));
        if (!newDir.exists()) {
            newDir.mkdirs();
        }

        // 递归遍历所有的文件和文件夹
        File[] files = src.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
            copy(file, dest);
        }
    }
}
