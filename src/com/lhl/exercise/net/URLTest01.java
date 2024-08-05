package com.lhl.exercise.net;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_13:19
 */
public class URLTest01 {
    /*
     *  URL 包括四部分：协议，IP地址，端口号，资源名称
     *  URL 是网络中某个资源的地址，某个资源的唯一标识
     *  通过 URL 可以定位到资源
     *  在 Java 中，提供了一个 URL 类
     *      构造方法： URL url = new URL("url");
     *
     *      常用方法： url.getXxx();
     * */
    public static void main(String[] args) throws MalformedURLException {
        // 创建URL类型对象
        URL url = new URL("https://www.baidu.com/oa/index.html?name=zhangsan&password=123456#tip");

        // 获取URL类型信息
        String protocol = url.getProtocol();
        System.out.println("协议：" + protocol);

        // 获取资源路径
        String path = url.getPath();
        System.out.println("资源路径：" + path);

        // 获取默认端口
        int defaultPort = url.getDefaultPort();
        System.out.println("默认端口：" + defaultPort);

        // 获取当前端口
        int port = url.getPort();
        System.out.println("当前端口：" + port);

        // 获取IP地址
        String host = url.getHost();
        System.out.println("主机地址：" + host);

        // 获取请求
        String query = url.getQuery();
        System.out.println("请求体：" + query);

        // 获取锚点
        String ref = url.getRef();
        System.out.println("锚点：" + ref);

        // 获取资源路径加数据
        String file = url.getFile();
        System.out.println("资源路径：" + file);
    }
}
