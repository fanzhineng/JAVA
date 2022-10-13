package com.fzn2020.fzntest;

/**
 * @program: JAVA
 * 描述：
 *          枚举类
 * @author: fzn
 * @create: 2020-08-01 11:03
 **/
public class EnumDemo {
    public static void main(String[] args) {
        //day 工作日变量
        Week w = Week.FRIDAY;
        System.out.println(w);//会打印重写的toString方法
        switch (w){
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
                break;
            case THURSDAY:
                System.out.println("星期四");
                break;
            case FRIDAY:
                System.out.println("星期五");
                break;
        }
        System.out.println("-----------");
        System.out.println(w.getInfo());
        System.out.println(Week.getStaticVar());
    }
}
enum Week{
    //枚举常量列表
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;

    //实例变量
    private String name;
    private int index;
    //静态变量
    private static int staticVar = 100;

    //覆盖 重写 父类的toString方法
    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }

    //实例方法
    public String getInfo(){
        return super.toString();
    }
    //静态方法
    public static int getStaticVar(){
        return staticVar;
    }
}
