package com.fzn2020.day09;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-31 10:34
 **/
public class ExeC {
    public static void main(String[] args) {
        //throwsa();
        throwb(null);
    }
    //throws
    public static void throwsa() throws NullPointerException{
        Integer i = null;
        System.out.println(i+1);
    }
    //throw
    public static void throwb(Integer i){
        if (i==null){
            throw  new NullPointerException();
        }
    }
}
