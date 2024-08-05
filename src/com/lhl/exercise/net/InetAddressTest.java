package com.lhl.exercise.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_13:02
 */
public class InetAddressTest {
    /*
     *  java.net.InetAddress 封装计算机的IP地址和DNS(无端口信息)
     *  包括一个主机名称和一个IP地址,是java对IP地址的高层表示,大多数其他网络类都需要用到这个类
     *  包括: Socket、ServerSocket、URL、DatagramSocket、DatagramPacket 等
     * */
    public static void main(String[] args) throws UnknownHostException {
        // 获取本机IP地址和主机名的封装对象
        InetAddress ia = InetAddress.getLocalHost();

        // 获取本机IP地址
        String hostAddress = ia.getHostAddress();
        System.out.println("本机IP地址为：" + hostAddress);

        // 获取本机的主机名
        String hostName = ia.getHostName();
        System.out.println("本机主机名是：" + hostName);

        // 通过域名获取 InetAddress 对象
        InetAddress ia2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ia2.getHostAddress());
        System.out.println(ia2.getHostName());
    }
}
