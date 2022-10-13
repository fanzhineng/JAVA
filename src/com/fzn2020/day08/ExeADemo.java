package com.fzn2020.day08;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *      新建一个类，控制台中，可输入一个宠物的信息，
 *      属性自己可定义，可设置值，设置房间号为103,
 *      再输入此宠物的信息，取到房间号.0
 *      用到hashCode
 * @author: fzn
 * @create: 2020-07-30 17:33
 **/
public class ExeADemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----请输入宠物的信息----");
        System.out.println("请输入宠物的名字:");
        String name = sc.next();
        Pet pet = new Pet(name);
        //利用hashCode
        HashMap<Pet,Integer> h = new HashMap<>();
        h.put(pet,103);//103房间号
        System.out.println("请输入你要查找宠物：");
        String name2 = sc.next();
        Pet pet2 = new Pet(name2);
        System.out.println(pet2.name+" 的房间号是："+h.get(pet2));
    }

}

//宠物类
class Pet{
    String name;
    //构造器
    public Pet(String name) {
        this.name = name;
    }

    //重写equals方法
    public boolean equals(Object obj){
        if (obj instanceof  Pet){//判断传入的对象是不是Pet class实例化出来的。
            Pet o = (Pet) obj;
            return this.name.equals( o.name);
        }
        return false;
    }
    //重写hashCode方法
    public int hashCode(){
        return name.hashCode()*10000;
    }

}