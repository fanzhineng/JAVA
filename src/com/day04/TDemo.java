package com.day04;

import com.sun.javafx.logging.PulseLogger;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-23 14:12
 **/
public class TDemo {
    public static void main(String[] args) {
        Te te = new Te(101,"fan");
        System.out.println(te);//输出地址值 是因为Object中提供了toString方法
        Te2 te2 = new Te2();
        System.out.println(te2);
        if (te.equals(te2)){
            System.out.println("是同一对象");
        }else {
            System.out.println("不是同一对象");
        }
    }
}
//在java中所有类默认继承Object类 超类
class Te extends Object{
    int id;
    String name;
    //有参构造器
    public Te(int id,String name){
        this.id = id;
        this.name = name;
    }
    //重写toString
    public String toString(){
        return id+" "+name;
    }
}
class Te2 extends Object{

}
