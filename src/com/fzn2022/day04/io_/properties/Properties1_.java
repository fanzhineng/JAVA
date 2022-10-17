package com.fzn2022.day04.io_.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @program: JAVA
 * 描述：      创建配置文件和修改配置文件
 * @author: fzn
 * @create: 2022-10-17 10:06
 **/
public class Properties1_ {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("charset","utf8");
        properties.setProperty("user","tom");
        properties.setProperty("naem","范知能");

        // 不存在就是创建 存在就是修改
        properties.setProperty("naem","范");

        // 将k-v 存到文件中
        // null 代表注释
        properties.store(new FileOutputStream("src\\com\\fzn2022\\day04\\io_\\properties\\my2.properties"),null);
    }
}