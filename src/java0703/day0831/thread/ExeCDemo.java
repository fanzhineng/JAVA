package java0703.day0831.thread;

/**
 * @program: JAVA
 * 描述：
 *      3、选做题
 *   编写一个多线程程序，其中一个线程完成对某个对象int成员变量  每次加1，
 *   另一个线程完成对该对象成员变量每次减1，同时保证该变量的值不会小于0 ，不会大于1
 *   该变量的初始值为0
 * @author: fzn
 * @create: 2020-08-31 18:42
 **/
public class ExeCDemo {
    static int x = 0;
    public static void main(String[] args) {

        Thread threadA =new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    x++;
                    System.out.println(x);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread threadB =new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 10; i++) {
                    x--;
                    System.out.println(x);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        threadA.start();
        threadB.start();
    }
}
