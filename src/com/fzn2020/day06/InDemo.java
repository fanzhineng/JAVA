package com.fzn2020.day06;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-28 09:34
 **/
public class InDemo {
    public static void main(String[] args) {
        OBoy o = new OBoy();
        System.out.println(o.getPa());
    }
}
//银行卡
class ABank{
    private  String pass = "123456";
    public String getPass(){
        return pass;
    }
}
//女孩类
class BGirl{
    private int age = 25;
    public int getAge(){
        return age;
    }
}
//男孩 想得到银行卡密码 和女孩的年龄 因为属性私有直接调用是得不到的
class OBoy{
    //内部类
    private class InA extends ABank{
        public String pass(){
            return super.getPass();
        }
    }
    private class InB extends BGirl{
        public int age(){
            return super.getAge();
        }
    }
    //公有方法
    public String getPa(){
        return new InA().pass();
    }
}
