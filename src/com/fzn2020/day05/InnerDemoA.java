package com.fzn2020.day05;

/**
 * @program: JAVA
 * 描述：
 *         没有使用内部类
 * @author: fzn
 * @create: 2020-07-27 16:46
 **/
public class InnerDemoA {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.fun();
    }

}

//先不用内部类
class Outer{
    String oster = "我是学生信息";
    public String getOster(){
        return oster;
    }
    //希望通过这个方法，把本类中的参数传入，通过其他类 得到一个数据过来。
    public void fun(){
        //用到下面的类
        Inx in = new Inx(this);//this 当前对象
        in.pri();
    }
}
//又是一个类
class Inx{
    //此类要用到上面的类的信息
    public Outer o;//声明一个Outer的变量o
    //通过构造器 初始化
    public Inx(Outer o){
        this.o = o;
    }

    public void pri(){
        System.out.println(o.getOster()+" 成绩：570");
    }
}
