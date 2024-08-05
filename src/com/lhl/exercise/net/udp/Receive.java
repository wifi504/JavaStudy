package com.lhl.exercise.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_11:18
 */
public class Receive {
    /*
     *  演示 UDP 编程，这是接收方
     * */

    public static void main(String[] args) {
        int port = 8888;
        try (DatagramSocket ds = new DatagramSocket(port)) {

            // 准备一个包，接收发送方的消息
            byte[] bytes = new byte[64 * 1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

            // 程序执行到这里停下来，等待发送方的发送
            ds.receive(datagramPacket);

            String msg = new String(bytes, 0, datagramPacket.getLength());
            System.out.println("接收到的发送方发来的消息：" + msg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
