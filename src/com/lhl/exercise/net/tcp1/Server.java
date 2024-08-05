package com.lhl.exercise.net.tcp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketImpl;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_14:04
 */
public class Server {

    /*
     *  使用 Socket 实现基于TCP的单向通信
     * */
    public static void main(String[] args) {
        // 启动服务端
        int port = 8888;
        try (ServerSocket serverSocket = new MyServerSocket(port);
             Socket accept = serverSocket.accept()) {

            // 获取输入
            try (BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()))) {
                String s = null;
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MyServerSocket extends ServerSocket {

    protected MyServerSocket(SocketImpl impl) {
        super(impl);
    }

    public MyServerSocket(int port) throws IOException {
        super(port);
        System.out.println("服务器启动成功，端口号：" + port);
    }

    public MyServerSocket(int port, int backlog) throws IOException {
        super(port, backlog);
    }

    public MyServerSocket(int port, int backlog, InetAddress bindAddr) throws IOException {
        super(port, backlog, bindAddr);
    }
}
