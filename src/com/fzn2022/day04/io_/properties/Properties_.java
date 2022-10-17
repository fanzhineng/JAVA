package com.fzn2022.day04.io_.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @program: JAVA
 * 描述：      读取文件
 * @author: fzn
 * @create: 2022-10-17 10:03
 **/
public class Properties_ {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src\\com\\fzn2022\\day04\\io_\\properties\\my.properties"));
        properties.list(System.out);

        String name = properties.getProperty("name");
        System.out.println(name);
    }
}