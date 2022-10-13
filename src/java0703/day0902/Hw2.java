package java0703.day0902;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-02 10:52
 **/
public class Hw2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //使用线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        //放到集合中
        List<Callable<Integer>> tasks = Arrays.asList(new MathAddCallableTask(1,100),
                new MathAddCallableTask(101,200),new MathAddCallableTask(201,300));
        //提交
        List<Future<Integer>> futures = executorService.invokeAll(tasks);
        int count=0;
        for (Future<Integer> future : futures) {
            count +=future.get();
            System.out.println(count);
        }
        System.out.println("结果为："+count);
        //关闭 线程池 不会立马关闭 要等待线程池中的任务执行完成才会关闭
        executorService.shutdown();
        //shutdownNow() 立马关闭 不会等线程池中的任务执行完成
    }
}
//计算相加
class MathAddCallableTask implements Callable<Integer> {
    private int start;
    private int end;

    public MathAddCallableTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        int count =0;
        for (int i = start; i <= end; i++) {
            count+=i;
        }
        return count;
    }
}
