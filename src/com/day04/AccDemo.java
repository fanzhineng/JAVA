package com.day04;

import com.subject.Koa;

/**
 * @program: JAVA
 * 描述：
 *      java中的访问修饰符
 * @author: fzn
 * @create: 2020-07-23 15:08
 **/
public class AccDemo {
    public static void main(String[] args) {
        //同一包下
        Foo f = new Foo();
        System.out.println(f.id);//y public
        System.out.println(f.name);//y  protected
        System.out.println(f.email);//y default
        //System.out.println(f.password);//n  private 访问不了
        System.out.println(f.getD());//y 通过公有方法访问
        System.out.println("---------------------");
        //不同包
        Koa k = new Koa();
        System.out.println(k.id);//y public
        //System.out.println(k.name);//n  protected 不同包访问不了
        //System.out.println(k.email);//n default 不同包访问不了
        //System.out.println(k.password);//n  private 访问不了
        System.out.println(k.getD());//y 通过公有方法访问
        System.out.println("---------------------");
        //继承关系
        Goo g = new Goo();
        g.gt();

    }
}
class Goo extends Koa{
    //继承关系
    public void gt(){
        System.out.println("g"+id);
        System.out.println("g"+name);//保护 不同包 继承关系可取
        //System.out.println("g"+email);//默认的 不同包 不可取
        //System.out.println("g"+password);//私有的
        System.out.println("g"+getD());
    }
}
class Foo{
    public int id = 101;//公共的
    protected String name = "fan";//保护的
    String email = "1152826742@qq.com";//默认
    private  String password ="123456";//私有

    //方法：目的 别人直接调用password是拿不到，我先别的类调用这个方法 间接使用password
    public String getD(){
        return password;
    }
}
