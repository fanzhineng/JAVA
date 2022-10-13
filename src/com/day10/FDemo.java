package com.day10;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-03 10:19
 **/
public class FDemo {
    public static void main(String[] args) {
        Food f = new Food("面包");//一楼
        Pet p =new  Pet("狗","旺财");//二楼
        //去的是商场 二楼
        Shop<Pet> s = new Shop<>(p);
        System.out.println(s.buy().name);
        //一楼
        Shop<Food> s1 = new Shop<>(f);
        System.out.println(s1.buy().name);
        Col c = new Col(200,"耐克");
        Shop<Col> s2 = new Shop<>(c);
        System.out.println(s2.buy().name);
    }

}
//商场， P通配符 泛指.. 某一种类型
class Shop<P>{
    P p;//引用变量 p有可能是宠物
    //构造器
    public Shop(P p){
        this.p = p;
    }
    //一般方法
    public P buy(){
        return p;
    }
}
//食物
class Food{
    String name;
    public Food(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println("食物给人们吃");
    }
}
class Pet{
    String type;//类型
    String name;//名字
    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }
}
//女装
class Col{
    int price;
    String name;
    public Col(int price, String name) {
        this.price = price;
        this.name = name;
    }
}