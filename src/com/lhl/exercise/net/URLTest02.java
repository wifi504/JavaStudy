package com.lhl.exercise.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/2_13:35
 */
public class URLTest02 {
    /*
     *  实现网络爬虫
     *
     * */
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("https://tianqi.qq.com/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try (InputStream is = url.openStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
