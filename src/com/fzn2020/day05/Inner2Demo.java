package com.fzn2020.day05;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-27 17:04
 **/
public class Inner2Demo {
    public static void main(String[] args) {
        Ostr o =new Ostr();
        o.fun();
    }
}
//学生信息的类
class Ostr{
    String str = "我是学生fan";
    //一般方法
    public void fun(){
        Cin c = new Cin();
        c.pr();
    }
    //要把这个值给成绩类使用
    //内部类  成绩类 看出一个整体 看出一个属性
    class Cin{
        public void pr(){//直接使用str
            System.out.println(str+" 575");
        }
    }
}