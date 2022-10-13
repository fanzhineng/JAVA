package java0703.day0831.thread;


/**
 * @program: JAVA
 * 描述：      1.模拟应用程序
 * a.大气环境数据：温度  湿度 风速
 * b.一个大气环境传感器测量环境数据需要5秒
 * c.一个计算器读取传感器的环境数据需要0.01秒
 * 要求 模拟一个计算器读取大气环境传感器读取的随机温度 湿度 风速100次
 * @author: fzn
 * @create: 2020-09-01 18:49
 **/
public class ExeADemo {
    public static void main(String[] args) {
        //大气环境传感器
        new Thread(new Atmospheric()).start();
        //算器读取传感器
        new Thread(new Calculator()).start();
    }
}
//大气环境传感器
class Atmospheric implements Runnable{
    //温度
     int tem=0;
    //湿度
     int hum=0;
    // 风速
     int wid=0;
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //温度
            tem = (int)(Math.random()*101);
            //湿度
            hum = (int)(Math.random()*20+40);
            // 风速
            wid = (int)(Math.random()*220);
            System.out.println("当前温度："+tem+"℃");
            System.out.println("当前湿度："+hum+"%");
            System.out.println("当前风度："+wid+"m/s");
            System.out.println("-------------------");
        }
    }
}
//一个计算器读取传感器
class Calculator implements Runnable{
    Atmospheric atmospheric;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(atmospheric.hum);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
