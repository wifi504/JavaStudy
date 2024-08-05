package com.lhl.exercise.net.tcp2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_10:42
 */
public class Client {
    /*
     *  使用 Socket 实现基于 TCP 双向通信
     *
     *      发送图片给服务端，获取服务端返回的消息
     * */
    public static void main(String[] args) {
        int port = 8888;
        try (Socket socket = new Socket(InetAddress.getLocalHost(), port);
             BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:/ly.png"));
             BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            int readCount = 0;
            byte[] bytes = new byte[1024];
            while ((readCount = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, readCount);
            }
            bos.flush();
            socket.shutdownOutput();

            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
