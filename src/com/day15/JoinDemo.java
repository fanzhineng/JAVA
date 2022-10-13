package com.day15;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-10 14:32
 **/
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        WorkStu s1 = new WorkStu(101,"sun");
        WorkStu s2 = new WorkStu(102,"hu");
        WorkStu s3 = new WorkStu(103,"xi");
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);
        t1.start();
        t1.join();
        System.out.println("------");
        t2.start();
        t3.start();
        System.out.println("main end");
        /*
            1.正常情况下，先输出main start main end
            2.如果希望t1执行完，再t2 t3
         */
    }
}
//学生类 实现接口
class WorkStu implements Runnable{
    int id;
    String name;
    public WorkStu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
            try {
                Thread.sleep(10);//睡眠
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
