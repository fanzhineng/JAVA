package com.day09;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-31 10:07
 **/
public class ExceB {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        try {
            getRe(a,b);
        } catch (MyEx e) {
            System.out.println(e.getMessage());
        }

    }
    public static int getRe(int x,int y) throws MyEx {
        if (y==0){
            throw new MyEx("除数不能为0");
        }
        return x/y;
    }
}
//自定义异常类
class MyEx extends Exception{
    String message;
    //构造器
    public MyEx(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
