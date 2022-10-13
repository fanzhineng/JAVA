package com.fzn2020.day06;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-28 09:51
 **/
public class In2Demo {
    public static void main(String[] args) {
        //使用成员内部类
        Outa o = new Outa();
        //new Ina()看出一个属性， o.属性
        o.new Ina().fun();
        System.out.println("------------");
        //使用静态内部类
        //SOuta.age 取静态属性 SOuta.SIna相当于取静态属性
        //SOuta().SIna() 按道理来说这样写时正确的但是Java语法不通过 因为没有调用SOut类中的构造器所以省去（）
        // SOuta.SIna();
        SOuta.SIna in= new SOuta.SIna();
        System.out.println(in.id);
        in.fun();

    }
}

 class Outa{
    private String name = "sun";
    public static int age = 18;
    //成员内部类
    class Ina{
        public int id=101;
        public void fun(){
            //得到外面的属性
            System.out.println(name);
            //得到自己的属性
            System.out.println(id);

        }
    }
}
class SOuta{
    private String name = "sun";
    public static int age = 18;
    //静态内部类
    static class SIna{
        public int id=101;
        public static String pass = "123456";
        public void fun(){
            //得到外面的属性
            //System.out.println(name);name不是静态的 不能用
            System.out.println(age);
            //得到自己的属性
            System.out.println(id);
            System.out.println(pass);

        }
    }
}
