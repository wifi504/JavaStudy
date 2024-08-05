package com.lhl.exercise.net.tcp2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_10:42
 */
public class Server {
    /*
     *  使用 Socket 实现基于 TCP 双向通信
     *
     *      接受客户端的图片，回复消息给客户端
     * */

    public static void main(String[] args) {
        int port = 8888;
        System.out.println("服务器启动成功，正在接收客户端的请求！");
        try (ServerSocket socket = new ServerSocket(port);
             Socket clientSocket = socket.accept();
             BufferedInputStream bis = new BufferedInputStream(clientSocket.getInputStream());
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())); // 回信的
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("testFiles/ly.png"))) {

            int readCount = 0;
            byte[] bytes = new byte[1024];
            while ((readCount = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, readCount);
            }
            bos.flush();

            bw.write("服务器已经收到了图片");
            bw.flush();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
