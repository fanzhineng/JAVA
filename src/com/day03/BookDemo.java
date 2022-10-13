package com.day03;

/**
 * @program: JAVA
 * 描述：
 *      运行书的类
 * @author: fzn
 * @create: 2020-07-22 11:42
 **/
public class BookDemo {
    public static void main(String[] args) {
        //new Book()创建一个对象放入堆中
        //Book b1 声明一个引用变量，本身是没有值，只是有内容的地址值
        //把创建的对象的地址值给了b1,b1就具有Book这个的类的属性和方法。
        Book b1 = new Book();
        b1.id=101;
        System.out.println(b1.id);
        b1.read();
        System.out.println("------------");

        //类可有一个 对象可有多个
        Book b2 = new Book();
        b2.id=102;
        b2.name="三国演义";
        b2.users = new String[]{"罗"};
        b2.read();
        System.out.println(b2.id);
        System.out.println(b2.name);
        System.out.println(b2.users[0]);
        System.out.println("------------");

        //调用有参构造器，不会调用无参的。
        Book b3 = new Book(103,"西游记",new String[]{"1"});
        System.out.println(b3.id+" "+b3.name+" "+b3.users[0]);
        b3.read();
    }
}
