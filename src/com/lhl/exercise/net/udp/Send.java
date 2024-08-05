package com.lhl.exercise.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/5_11:26
 */
public class Send {
    /*
     *  演示 UDP 编程，这是发送方
     * */
    public static void main(String[] args) {
        try (DatagramSocket ds = new DatagramSocket()) {
            byte[] bytes = "这是一条UDP消息".getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getLocalHost(), 8888);

            ds.send(datagramPacket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
