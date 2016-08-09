package com.wetts._util.chatroom.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 系统配置
 *
 * @author wetts
 * @since 1.0, 2014/08/11
 */
public class SysConfig {

    public static final String CODING;

    static {
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("sysconfig.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("sys配置文件找不到");
        } catch (IOException e) {
            e.printStackTrace();
        }
        CODING = p.getProperty("coding");
    }

    public static void main(String[] args) {
        System.out.println(CODING);
    }
}