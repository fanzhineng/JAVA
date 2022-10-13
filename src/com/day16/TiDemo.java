package com.day16;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @program: JAVA
 * 描述：      倒计时10s输出新年快乐
 * @author: fzn
 * @create: 2020-08-11 09:50
 **/
public class TiDemo {
    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer();
        TimerTask ta = new TimerTask() {
            @Override
            public void run() {
                System.out.println("新年快乐");
                t.cancel();//终止定时器
            }
        };
        t.schedule(ta,10000);//10s后
        System.out.println("倒计时开始");
        for (int i = 10; i>0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
