package com.day09;

import java.io.IOException;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-31 14:15
 **/
public class ExceD {
    public static void main(String[] args) {

    }
    //抛出一个异常
    public void mea() throws IOException {

    }
    //如果方法b调用方法a  b也要抛出异常
    public void b() throws IOException {
        mea();
    }
    public void c() throws Exception {
        mea();
    }
    public void d(){
        try {
            mea();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
