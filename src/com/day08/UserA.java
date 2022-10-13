package com.day08;


import java.util.Random;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-30 10:32
 **/
public class UserA {
    int id;
    String name;
    public UserA(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    //重写equals
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (this == obj){//同一对象
            return true;
        }
        if (obj instanceof  UserA){//判断传入的对象是不是UserA class实例化出来的。
            UserA o = (UserA) obj;
            return this.id==o.id && this.name == o.name;
        }
        return false;
    }
    //重写hashCode
    public int hashCode(){
        Random rd = new Random();
        return this.id*rd.nextInt(10000);
    }
}
