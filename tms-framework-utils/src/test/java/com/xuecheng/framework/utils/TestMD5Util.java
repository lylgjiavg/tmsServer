package com.xuecheng.framework.utils;

import java.io.File;
import java.io.IOException;

/**
 * @Classname TestMD5Util
 * @Description 测试类
 * @Date 2020/2/10 17:54
 * @Created by 姜立成
 */
public class TestMD5Util {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        long beginTime = System.currentTimeMillis();
        File fileZIP = new File("D:\\BaiduNetdiskDownload\\test1.avi");

        String md5 = "";
        try {
            md5 = MD5Util.getFileMD5String(fileZIP);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("MD5:" + md5 + "\n time:" + ((endTime - beginTime)) + "ms");

        System.out.println(MD5Util.getStringMD5("111111"));
    }

}
