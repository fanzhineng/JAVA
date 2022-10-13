package java0703.day0902;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @program: JAVA
 * 描述：
 *           1.模拟应用程序
 *  * a.大气环境数据：温度  湿度 风速
 *  * b.一个大气环境传感器测量环境数据需要5秒
 *  * c.一个计算器读取传感器的环境数据需要0.01秒
 *  * 要求 模拟一个计算器读取大气环境传感器读取的随机温度 湿度 风速100次
 * @author: fzn
 * @create: 2020-09-02 09:57
 **/
public class Hw1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        //大气环境传感器测量环境数据
        Callable<WeatherInfo> callable = new Callable<WeatherInfo>() {
            @Override
            public WeatherInfo call() throws Exception {
                System.out.println("数据采集中。。。");
                //睡眠5s
                Thread.sleep(5000);
                Random random = new Random();
                //创建对象
                WeatherInfo weatherInfo = new WeatherInfo(random.nextInt(100),random.nextInt(40),random.nextInt(100));
                return weatherInfo;
            }
        };
        //计算器任务
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //读取数据
                //future对象用来获取Callable任务的结果的对象
                Future<WeatherInfo> future = executorService2.submit(callable);
                try {
                    //获取结果
                    WeatherInfo weatherInfo = future.get();
                    System.out.printf("读取的天气信息, 温度:%d,湿度:%d,风度：%d\n",
                            weatherInfo.getTemp(),weatherInfo.getHumidity(),weatherInfo.getWindSpeed());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
                //读取间隔1s
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        for (int i = 0; i < 100; i++) {
            //执行计算器
            executorService.execute(runnable);
        }
        //关闭线程池
        //executorService.shutdown();
    }
}

/**
 * 天气信息
 */
class WeatherInfo{
    //风速
    private int windSpeed;
    //温度
    private int temp;
    //湿度
    private int humidity;

    public WeatherInfo() {
    }

    public WeatherInfo(int windSpeed, int temp, int humidity) {
        this.windSpeed = windSpeed;
        this.temp = temp;
        this.humidity = humidity;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
