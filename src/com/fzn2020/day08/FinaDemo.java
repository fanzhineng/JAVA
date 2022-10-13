package com.fzn2020.day08;

/**
 * @program: JAVA
 * 描述：   finally和return的关系 顺序
 * @author: fzn
 * @create: 2020-07-30 15:48
 **/
public class FinaDemo {
    public static void main(String[] args) {
        System.out.println(getC());
    }
    public static int getC(){
        try {
            System.out.println("a");
            System.exit(0);//程序结束了 强行退出
            return 1;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("b");
        }finally {
            System.out.println("c");
        }
        return 4;
    }
}
