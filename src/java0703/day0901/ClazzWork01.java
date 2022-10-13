package java0703.day0901;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-01 20:26
 **/
import java.util.*;

/**
 * @program: xu703
 * 描述：1.模拟应用程序
 * a.大气环境数据：温度  湿度 风速
 * b.一个大气环境传感器测量环境数据需要5秒
 * c.一个计算器读取传感器的环境数据需要0.01秒
 * @author:
 * @create: 2020-09-01 15:26
 **/
public class ClazzWork01 {
    public static void main(String[] args) throws InterruptedException {
        Measuring mea = new Measuring();
        ReaderData reader = new ReaderData(mea);
        new Thread(mea).start();
        // Thread.sleep(1000);
        new Thread(reader).start();
    }
}

//大气环境传感器测量类
class Measuring implements Runnable{
    HashMap<String, String> map = new HashMap<>();
    @Override
    public void run()  {
        Random random = new Random();
        while (true){
            map.clear();

            map.put("温度",random.nextInt(10)+20+"摄氏度");
            map.put("湿度",random.nextInt(30)+50+"%");
            map.put("风速",random.nextInt(10)+20+"km/h");
            try {
                Thread.sleep(1000*5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//计算器读取类
class ReaderData implements Runnable{
    Measuring measuring;
    public ReaderData(Measuring measuring) {
        this.measuring = measuring;
    }

    @Override
    public void run() {
        int i=0;
        while (i<=10){
            i++;
            Iterator<Map.Entry<String,String>> it = measuring.map.entrySet().iterator();
            while (it.hasNext()){
                Map.Entry<String,String> entry = it.next();
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
