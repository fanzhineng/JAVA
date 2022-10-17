package com.fzn2022.day04.io_.transformation;

import java.io.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2022-10-17 09:43
 **/
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String fielPath = "e:\\fzn.txt";
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fielPath),"utf-8");
        outputStreamWriter.write("范知能");
        outputStreamWriter.close();

    }
}