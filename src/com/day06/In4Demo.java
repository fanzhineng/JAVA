package com.day06;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-28 10:48
 **/
public class In4Demo {
    public static void main(String[] args) {
        OutD o = new OutD();
        o.dis(2);
    }
}
//接口
interface MyIn{
    void moves();//移动
}
//一般类
class OutD {
    int id =5;
    //方法 方法类含有匿名内部类
    public void dis(int t){
        //实现接口 调用方法
        /*
            class x implements MyIn{....}
            x.moves();
        */
        //匿名内部类
        new MyIn(){
            //实现方法
            public void moves(){
                System.out.println("匿名内部类类中的移动");
            }
        }.moves();
    }
}
