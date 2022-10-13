package com.fzn2020.day06;

/**
 * @program: JAVA
 * 描述：  方法内部类
 * @author: fzn
 * @create: 2020-07-28 10:31
 **/
public class In3Demo {
    public static void main(String[] args) {
        OutC o =new OutC();
        o.dis(2);
    }
}
class OutC{
    private int id = 5;
    //一般方法
    public void moves(){
        System.out.println("行走");
    }
    //再含一个方法
    public void dis(int t){
        //内部类
        class Inc{
            public void fun(){
                //t++;
                System.out.println(id);
                System.out.println(t);
            }
        }
        //此类只能再dis内中使用
        new Inc().fun();
    }
}
