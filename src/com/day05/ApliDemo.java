package com.day05;

/**
 * @program: JAVA
 * 描述：
 *      多态的使用
 *          1)使用继承的方法
 * @author: fzn
 * @create: 2020-07-27 10:49
 **/
public class ApliDemo {
    public static void main(String[] args) {
        //支付宝支付
        Pay p1 = new AliPay();
        p1.payT();
        System.out.println(p1.payF());
        //微信支付
        Pay p2 = new WxPay();
        p2.payT();
        System.out.println(p2.payF());
        //银行卡支付
        Pay p3 = new Bank();
        p3.payT();
        System.out.println(p3.payF());
    }
}
//父类 支付类
class Pay{
    int mon;
    //方法 付了多少钱
    public int payF(){//支付金额
        int x=0;
        return x;
    }
    //支付方式
    public void payT(){
        System.out.println("支付的方式");
    }
}
//子类
//支付宝支付
class AliPay extends Pay{
    public int payF(){
        int x=50;
        return x;
    }
    public void payT(){
        System.out.println("我是用支付宝支付的");
    }
}
//微信支付
class WxPay extends Pay{
    public int payF(){
        int x=100;
        return x;
    }
    public void payT(){
        System.out.println("我是用微信支付的");
    }
}
//银行支付
class Bank extends Pay{
    public int payF(){
        int x = 200;
        return x;
    }
    public void payT(){
        System.out.println("我是用银行卡支付的");
    }
}