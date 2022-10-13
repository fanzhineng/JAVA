package java0703.day0831.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: JAVA
 * 描述：      实现Callable接口实现任务
 * @author: fzn
 * @create: 2020-08-31 15:40
 **/
public class CallableTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Callable任务开始执行的1~10相加");
        Thread.sleep(10000);
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            sum +=i;
        }
        System.out.println("执行完毕");
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTask callableTask = new CallableTask();
        //未来任务
        FutureTask<Integer> futureTask = new FutureTask(callableTask);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println("线程睡眠开始");
        Thread.sleep(10000);
        //FutureTask的get为获取线程执行的返回结果
        //get方法会等待线程执行完成 才会有返回结果 所以这个方法会有阻塞等待执行完毕并返回结果，才会继续向下执行。
        Integer sum = futureTask.get();
        System.out.println("1~10的累加和："+sum);
    }
}
