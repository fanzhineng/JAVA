package com.fzn2020.day06;

/**
 * @program: JAVA
 * 描述：  代理模式
 * @author: fzn
 * @create: 2020-07-28 14:36
 **/
public class PriDemo {
    public static void main(String[] args) {
       //代理方 ，实例化xiaoL
        Co c = new Co(1);
        /*
        1.对于男方来说，过程看不到，安全系数高
        2.男方不能直接认识xiaoL 不能直接new xiaoL
        */
        c.coding();
        c.sing();
    }
}

//需求--都是一些方法---接口
//找女孩类
interface FindGirl{
    abstract void sing();//会唱歌
    abstract void coding();//会敲代码
}
//女孩类
class XiaoF implements FindGirl{

    @Override
    public void sing() {
        System.out.println("小芳会唱歌");
    }

    @Override
    public void coding() {
        System.out.println("小芳会敲代码");
    }
}
//女孩类
class XiaoL implements FindGirl{

    @Override
    public void sing() {
        System.out.println("小丽会唱歌");
    }

    @Override
    public void coding() {
        System.out.println("小丽会敲代码");
    }
}
//代理方
class Co implements FindGirl{
    //不是代理方自己直接去完成所需求功能，调用资源去完成功能
    FindGirl gr;//属性
    //使用代理 发生多态
    public Co(int i){
        if (i==0){
            gr = new XiaoF();
        }else if (i==1){
            gr = new XiaoL();
        }
    }
    public void sing() {
        gr.sing();//通过属性gr去完成
    }

    public void coding() {
        gr.coding();
    }
}