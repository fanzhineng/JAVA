package com.day05;

/**
 * @program: JAVA
 * 描述：
 *  3.2新建文件，用接口，实现类，多实现，完成能输出结果，
 * 多态的例子.
 * @author: fzn
 * @create: 2020-07-27 19:12
 **/
public class ExeBDemo {
    public static void main(String[] args) {
        //多态：
        Computer c = new Dell();
        c.bootUp();
        Mon m = new Dell();
        m.getM();
    }
}
//电脑
interface  Computer{
    //抽象方法  开机动画
    public abstract void bootUp();

}
//价格
interface Mon{
    //抽象方法 得到价格
    public abstract void getM();

}
//戴尔电脑
class  Dell implements Computer, Mon{
    //实现Computer 中的方法
    public void bootUp() {
        System.out.println("戴尔电脑开机动画");
    }
    //实现getM 中的方法
    public void getM() {
        System.out.println("6999元");
    }
}
