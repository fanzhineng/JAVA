package com.day20;

/**
 * @program: JAVA
 * 描述：结束双层循环:
 *          通过return
 * @author: fzn
 * @create: 2020-08-20 09:36
 **/
public class ForDemo {
    public static void main(String[] args) {
        //a();
        //b();
        c();

    }
    //通过return
    public static void a(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j==5){
                    System.out.println("结束循环");
                    System.out.println(j);
                    return;//返回到作用域的(开始执行的代码)第一行
                }
            }
        }
    }
    //设置boolean类型
    public static void b(){
        boolean res = true;
        for (int i = 0; i < 10 && res; i++) {
            for (int j = 0; j < 10 && res; j++) {
                if (j==5){
                    System.out.println("结束循环");
                    System.out.println(j);
                    res = false;
                    break;
                }
            }
        }
    }
    //定义关键字 通过break
    public static void c(){
        o:for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                if (j==5){
                    System.out.println("结束循环");
                    System.out.println(j);
                    break o;
                }
            }
        }
    }

}
