package java0703.day0902;

/**
 * @program: JAVA
 * 描述：
 *  定义3个线程 T1，T2  ,T3  保证多个线程执行的顺序  T1-T2-T3-T1-T2-T3-T1-T2-T3....每个线程输出10次
 * @author: fzn
 * @create: 2020-09-02 21:29
 **/
public class ExeCDemo {
    static Object object = new Object();
    public static void main(String[] args) {
        new Thread("T1"){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                        synchronized (object) {
                            System.out.println(this.getName());
                            //唤醒其他线程
                            object.notify();
                            //当前线等待
                            try {
                                object.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                }
            }
        }.start();
        new Thread("T2"){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (object) {
                        System.out.println(this.getName());
                        //当前线等待
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒其他线程
                        object.notify();
                    }
                }
            }
        }.start();
        new Thread("T3"){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (object) {
                        System.out.println(this.getName());
                        //唤醒其他线程
                        object.notify();
                        //当前线等待
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
    }
}
