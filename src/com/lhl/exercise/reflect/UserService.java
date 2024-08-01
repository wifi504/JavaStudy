package com.lhl.exercise.reflect;

/**
 * @author lhl
 * @version 1.0
 * Create Time 2024/8/1_15:06
 */
public class UserService {
    /**
     * 登录系统的方法
     *
     * @param userName 用户名
     * @param password 密码
     * @return true表示登录成功，false表示登录失败
     */
    public boolean login(String userName, String password) {
        if ("admin".equals(userName) && "123456".equals(password)) {
            return true;
        }
        return false;
    }

    /**
     * 退出系统的方法
     */
    public void logout() {
        System.out.println("系统已安全退出！");
    }
}
