package java0703.day0831.thread;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-31 15:18
 **/
public class Test {
    //使用两种方式创建两个线程
    public static void main(String[] args) {
        //打印奇数
        new Thread("线程A"){
            @Override
            public void run() {
                for (int i = 1; i < 100; i+=2) {
                    System.out.println(Thread.currentThread().getName()+" "+i);
                }
            }
        }.start();
        //打印偶数
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if (i%2==0){
                        System.out.println(Thread.currentThread().getName()+" "+i);
                    }
                }
            }
        },"线程B").start();
    }
}
