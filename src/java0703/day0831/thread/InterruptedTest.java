package java0703.day0831.thread;

/**
 * @program: JAVA
 * 描述：      线程中断演示
 * @author: fzn
 * @create: 2020-08-31 16:56
 **/
public class InterruptedTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run() {
                //获取线程是否被中断
                boolean interrupted = Thread.currentThread().isInterrupted();
                System.out.println("interrupted:"+interrupted);
                while (!Thread.currentThread().isInterrupted()){
                    System.out.println("我还活着~~");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
        thread.sleep(1000);
        //调用中断方法
        thread.interrupt();
    }
}
