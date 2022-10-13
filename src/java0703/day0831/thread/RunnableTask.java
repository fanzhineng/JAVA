package java0703.day0831.thread;

/**
 * @program: JAVA
 * 描述：      通过实现Runnable接口 创建任务
 * @author: fzn
 * @create: 2020-08-31 14:54
 **/
public class RunnableTask implements Runnable{
    //没有返回值，不能声明抛出异常
    @Override
    public void run() {
        System.out.println("实现Runnable接口创建任务");
    }

    public static void main(String[] args) {
        RunnableTask runnableTask = new RunnableTask();
        Thread thread =new Thread(runnableTask);
        thread.start();
        //使用匿名内部类的方式创建
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用匿名内部类的方式创建");
            }
        });
        thread1.start();
    }
}
