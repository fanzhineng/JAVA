package com.day04;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-23 09:52
 **/
public class PerDemo {
    public static void main(String[] args) {
        Shoe s = new Shoe(101,"nike",399,"red");
        s.up();
        s.sal();
        s.down();
        System.out.println(s.id);
        System.out.println("--------------");
        Computer c = new Computer(102,"dell",5999,6);
        c.up();
        c.sal();
        c.down();
        System.out.println(c.id);
    }
}
//父类
class ProDu{
    int id;//编号 默认是int类型的值 0
    String name;
    int pri;//价格
    public void up(){
        System.out.println("商品上架");
    }
    public void sal(){
        System.out.println("商品出售");
    }
    public void down(){
        System.out.println("商品下架");
    }
    //构造器
    //有参
    public ProDu(int id,String name,int pri){
        this.id = id;
        this.name = name;
        this.pri = pri;
    }
}
//鞋子
class Shoe extends ProDu{
    String color;//颜色
    //重写 子类重写父类方法
    @Override
    public void sal(){
        System.out.println("鞋子出售");
    }
    public Shoe(int id, String name, int pri,String color) {
        super(id, name, pri);
        this.color = color;
    }

}
//电脑s
class Computer extends ProDu{
    int wi;//重量
    public Computer(int id, String name, int pri,int wi) {
        super(id, name, pri);
        this.wi = wi;
    }
}
