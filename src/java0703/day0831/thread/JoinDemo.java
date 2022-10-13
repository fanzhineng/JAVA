package java0703.day0831.thread;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-31 17:18
 **/
public class JoinDemo {
    public static void main(String[] args) {
        Thread thread = new Thread("线程A"){
            @Override
            public void run() {
                System.out.println("线程A执行");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
        //使当前线程等待ThreadA执行完再执行
        try {
            //如果指定超出时间，那么等待时间之后，便会进入就绪状态
            thread.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程");
    }
}
