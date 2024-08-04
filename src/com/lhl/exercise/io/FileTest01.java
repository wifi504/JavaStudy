package com.lhl.exercise.io;

import java.io.File;
import java.io.IOException;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/7/25_15:59
 */
public class FileTest01 {
    /*
     *   java.io.File
     *       1. File 是路径的抽象表示形式
     *       2. File 和 IO流没有继承关系，父类是Object，通过File不能完成文件读写
     *       3. 可能是一个文件，也可能是一个目录
     *       4. File 常用方法
     *          void createNewFile() 创建文件
     *          void delete() 删除文件
     *          void mkdir() 创建目录
     *          void mkdirs() 创建目录
     *          void renameTo(File dest) 重命名
     *          String getAbsolutePath() 获取绝对路径
     *          String getPath() 获取路径
     *          String getName() 获取文件名
     *          long length() 获取文件长度
     *          boolean isFile() 是否是文件
     *          boolean isDirectory() 是否是目录
     *          boolean canRead() 是否可读
     *          boolean canWrite() 是否可写
     *          boolean isHidden() 是否隐藏
     *          String[] list() 获取目录下的所有文件名
     *          File[] listFiles() 获取目录下的所有文件
     *
     * */

    public static void main(String[] args) throws IOException {
        File file = new File("testFiles/test8.txt");

        // 存在吗？
        System.out.println(file.exists() ? "存在" : "不存在");

        if (!file.exists()) {
            // 不存在就创建
            file.createNewFile();
        }

        // 存在吗？
        System.out.println(file.exists() ? "存在" : "不存在");

        if (file.exists()) {
            // 存在就删除
            file.delete();
        }

        // 存在吗？
        System.out.println(file.exists() ? "存在" : "不存在");
    }
}
