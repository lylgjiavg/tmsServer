package com.xuecheng.framework.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Classname BCryptUtil
 * @Description 用户密码加密及匹配工具类
 * @Date 2020/2/10 17:42
 * @Created by 姜立成
 */
public class BCryptUtil {

    /**
     * 密码加密
     * @param password 密码
     * @return 加密后的密码
     */
    public static String encode(String password){

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        return passwordEncoder.encode(password);
    }

    /**
     * 密码校验
     * @param password 密码
     * @param hashPass 加密后的密码
     * @return 密码加密后是否一致
     */
    public static boolean matches(String password,String hashPass){

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        return passwordEncoder.matches(password, hashPass);
    }

}
