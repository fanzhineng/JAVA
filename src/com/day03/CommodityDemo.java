package com.day03;

/**
 * @program: JAVA
 * 描述：
 *      作业
 * @author: fzn
 * @create: 2020-07-22 18:36
 **/
public class CommodityDemo {
    /*
     * 有一个类，父类，商品类，子类有电脑  上衣  手表.
     *    属性有 编号  名字 库存 价格.
     *    方法有上架，下架 展示 .
     * 用输出代替. 编写程序，要体现 继承  重写  构造器关系. 要有运行结果
     */
    public static void main(String[] args) {
        //电脑
        Computer computer = new Computer(1,"戴尔电脑",200,5999);
        System.out.println("编号："+computer.id+" 名称："+computer.name+" 库存："+computer.stock+" 价格："+computer.price);
        computer.put();
        computer.show();
        computer.down();
        //上衣
        Coat coat = new Coat(2,"nike上衣",500,399);
        System.out.println("编号："+coat.id+" 名称："+coat.name+" 库存："+coat.stock+" 价格："+coat.price);
        coat.put();
        coat.show();
        coat.down();
        //手表
        Watch watch = new Watch(3,"DW手表",1000,1399);
        System.out.println("编号："+watch.id+" 名称："+watch.name+" 库存："+watch.stock+" 价格："+watch.price);
        watch.put();
        watch.show();
        watch.down();


    }
}
class Commodity{
    int id;//编号
    String name;//名字
    int stock;//库存
    int price;//价格
    //有参构造方法
    public Commodity(int id,String name,int stock,int price){
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price =price;
    }

    //上架方法
    public void put(){
        System.out.println("商品上架了");
    }
    //展示方法
    public void show(){
        System.out.println("正在展示当前商品");
    }
    //下架方法
    public void down(){
        System.out.println("商品下架了");
    }
}
//电脑类
class Computer extends Commodity{
    //构造方法
    public Computer(int id, String name, int stock, int price) {
        super(id, name, stock, price);
    }
    //重写父类的方法
    @Override
    public void put(){
        System.out.println("电脑上架了");
    }
    @Override
    public void show(){
        System.out.println("当前展示的是电脑");
    }
    @Override
    public  void down(){
        System.out.println("电脑下架了");
    }
}
//上衣类
class Coat extends Commodity{
    //构造方法
    public Coat(int id, String name, int stock, int price) {
        super(id, name, stock, price);
    }
    //重写父类的方法
    @Override
    public void put(){
        System.out.println("上衣上架了");
    }
    @Override
    public void show(){
        System.out.println("当前展示的是上衣");
    }
    @Override
    public  void down(){
        System.out.println("上衣下架了");
    }
}
//手表类
class Watch extends Commodity{
    //构造方法
    public Watch(int id, String name, int stock, int price) {
        super(id, name, stock, price);
    }
    //重写父类的方法
    @Override
    public void put(){
        System.out.println("手表上架了");
    }
    @Override
    public void show(){
        System.out.println("当前展示的是手表");
    }
    @Override
    public  void down(){
        System.out.println("手表下架了");
    }
}


