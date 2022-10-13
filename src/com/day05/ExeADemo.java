package com.day05;

/**
 * @program: JAVA
 * 描述：
 *  3.1新建文件。用抽象类 父类 子类 完成能输出结果的，一个多态例子.
 * @author: fzn
 * @create: 2020-07-27 19:01
 **/
public class ExeADemo {
    public static void main(String[] args) {
        Ball b = new Basketball();
        b.pat();
    }
}
//球类
abstract class Ball{
    //抽象方法
    public abstract void pat();

}
//篮球类
class  Basketball extends Ball{
    //重写父类的抽象方法
    public void pat() {
        System.out.println("打篮球");
    }

}