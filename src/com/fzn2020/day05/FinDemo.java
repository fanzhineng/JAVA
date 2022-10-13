package com.fzn2020.day05;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-27 16:21
 **/
public class FinDemo {
}

//final 最终的，放在类前，不能被继承
final class Ioo{
    int i;
    String name;

}
/*不能被继承Ioo
class Aoo extends Ioo{

}*/
class Ka{
    final int id = 1;
    static int index = 1;
    //构造器
    public Ka(){
        //id++;final变量改变不了值 是一个常量
    }
    public final void getK(){
        System.out.println("我是final方法 getK");
    }
}
//因为要研究重写
class CKa extends Ka{
    /*不能重写父类中的final方法
    public void getK(){
    }*/
}
