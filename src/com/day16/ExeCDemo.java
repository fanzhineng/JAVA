package com.day16;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @program: JAVA
 * 描述：
 *      选做:
 * 1 通过定时器，不能用sleep.
 * 完成在控制台中，输出，倒计时一分钟。
 * 一分钟到了后，输出吃饭了。
 * 60
 * 59
 * ..
 *      使用定时器执行
 * @author: fzn
 * @create: 2020-08-11 18:38
 **/
public class ExeCDemo {
    public static void main(String[] args) {
        Timer t = new Timer();
        //开启定时器 打印吃饭了
        TimerTask ta = new TimerTask() {
            int i=60;
            @Override
            public void run() {
                if (i>0){
                    System.out.println(i);
                    i--;
                }else {
                    System.out.println("吃饭了");
                    t.cancel();
                }
            }
        };
        //设置开启的定时器和时间 一分钟后开启
        t.schedule(ta,0,1000);

    }
}
