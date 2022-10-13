package java0703.day0831.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: JAVA
 * 描述：
 *      2、创建一个线程去计算10的阶乘，并返回结果。（使用callable）
 * @author: fzn
 * @create: 2020-08-31 18:35
 **/
public class ExeBDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable callableTask = new Callable(){
            @Override
            public Integer call() throws Exception {
                //计算10的阶乘
                int sum=1;
                for (int i = 1; i <= 10; i++) {
                    sum *= i;
                }
             return sum;
            }
        };
        FutureTask<Integer> futureTask = new FutureTask<>(callableTask);
        Thread thread = new Thread(futureTask);
        thread.start();
        Integer sum = futureTask.get();
        System.out.println("10的阶乘和："+sum);
    }
}
