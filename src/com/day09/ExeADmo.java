package com.day09;

/**
 * @program: JAVA
 * 描述：
 *      2 通过自定义异常，对于一个商品的给定的价格，
 * 和付款的价格比较，如果付款时价小于给定的价，就异常，提示，余额不足.
 * @author: fzn
 * @create: 2020-07-31 18:49
 **/
public class ExeADmo {
    public static void main(String[] args) {
        try {
            getS(200,220);
        } catch (Com e) {
            System.out.println(e.getMsg());
        }
    }
    //得到价格
    public static void getS(int x,int y) throws Com {
        if (x<y){//付款金额小于要付的金额抛出异常
            throw new Com("余额不足！");
        }
    }
}
//自定义异常类
class Com extends Exception{
    String msg;
    public Com(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

