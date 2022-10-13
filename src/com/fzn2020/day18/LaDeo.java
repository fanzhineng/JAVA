package com.fzn2020.day18;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-13 16:57
 **/
public class LaDeo {
    public static void main(String[] args) {
        /*
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
                System.out.println("------------");
            }
        }.start();

        //使用Lambda表达式
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }).start();

         */
        Ta t =mess -> {
            System.out.println(mess);
        };
        t.saym("sun");
        //无参 有返回
        Tc c =()->3;
        System.out.println(c.sayc());
        //多参 无返回
        No n = ( int a, int b)->{
            System.out.println(a+b);
        };
        n.ma(2,3);
        //无参 无返回
        NoR n1 = ()->{
            System.out.println("aaa");
        };
        n1.me();

    }
}
interface Ta{
    void saym(String mess);
}
interface Tc{
    int sayc();
}
interface No{
    //多个参数无返回
    void ma(int a,int b);
}
interface NoR{
    //无参无返回
    void me();
}
