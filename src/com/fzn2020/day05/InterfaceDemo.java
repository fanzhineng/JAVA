package com.fzn2020.day05;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-27 14:32
 **/
public class InterfaceDemo {
    public static void main(String[] args) {
        //多态:
        // 当使用多态时，父类中定义过那些方法，父类的引用变量才可调用此方法 父类中没定义就不能使用
        Car c1 = new BYD();
        c1.runs();
        c1.stop();
        c1.getType();
        Price p1 = new BYD();
        System.out.println(p1.getPri());
        System.out.println("-------------");
        Car c2 = new BMW();
        c2.runs();
        c2.stop();
        c2.getType();
    }
}

//接口 车接口
interface Car{
    abstract void runs();//因为接口的方法全是抽象的所有abstract可以省去不写。
    void stop();
    public static final String type = "H";//高配 type是常量 不能更改的。
     void  getType();
}

//有价格的商品
interface Price{
    //得到价格
    int getPri();
}

//当一个具体类实现接口时，得实现接口中的所有的抽象方法
//实现的接口的类 BYD
class BYD implements Car, Price{
   //实现Car接口中的抽象方法
    public void runs() {
        System.out.println("BYD在跑");
    }

    public void stop() {
        System.out.println("BYD在停");
    }
    public void getType(){
        //type = "L";编译出错 常量不能更改
        System.out.println(type);
    }
    //实现Price接口中的抽象方法
    public int getPri() {
        return 40000;
    }
}

//实现接口的类 BMW
class BMW implements Car,Price{
    //实现Car接口中的抽象方法
    public void runs() {
        System.out.println("BMW在跑");
    }
    public void stop() {
        System.out.println("BMW在停");
    }
    public void getType() {
        System.out.println(type);
    }
    //实现Price接口中的抽象方法
    public int getPri() {
        return 100000;
    }
}
