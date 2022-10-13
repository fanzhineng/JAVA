package com.day05;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-27 15:42
 **/
public class In2Demo {
    public static void main(String[] args) {
        MyIn.sh();//静态方法
        Fc f = new Fc();
        f.inv();
        f.te();
        f.te2();
    }
}
//接口
interface MyIn{
    public abstract void te();//抽象方法
    //具体方法
    default void inv(){
        System.out.println("我是接口中的具体方法");
    }
    //静态方法
    static void sh(){
        System.out.println("我是接口中的静态方法");
    }
}
//
interface MyIn2{
    public abstract void te2();//抽象方法
    //具体方法
    default void inv(){
        System.out.println("我是接口2中的具体方法2");
    }
}

//具体类 用于扩展
class Fa{

}

class Fc extends Fa implements MyIn, MyIn2{

    @Override
    public void te() {
        System.out.println("fc te");
    }

    @Override
    public void te2() {
        System.out.println("fc te2");
    }

    @Override
    public void inv() {
        System.out.println("fc inv");
    }
}