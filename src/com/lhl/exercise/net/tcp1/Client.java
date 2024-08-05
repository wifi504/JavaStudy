package com.lhl.exercise.net.tcp1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_14:04
 */
public class Client {
    /*
     *  使用 Socket 实现基于TCP的单向通信
     * */

    public static void main(String[] args) {
        int port = 8888;
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            // 客户端发消息
            try (Socket socket = new Socket(localHost, port);
                 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {

                bw.write("你好，我是客户端，这是我发送的一条消息");

                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
