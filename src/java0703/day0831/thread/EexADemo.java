package java0703.day0831.thread;

/**
 * @program: JAVA
 * 描述：
 *      1、随便选择两个城市作为预选旅游目标。实现两个独立的线程分别显示10次城市名，
 *   每次显示后休眠一段随机时间(1000ms以内)，
 *   哪个先显示完毕，就决定去哪个城市。分别用Runnable接口和Thread类实现。
 * @author: fzn
 * @create: 2020-08-31 18:31
 **/
public class EexADemo {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("去上海");
                    try {
                        Thread.sleep((int) (Math.random()*1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("去北京");
                    try {
                        Thread.sleep((int) (Math.random()*1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
