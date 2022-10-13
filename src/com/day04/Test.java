package com.day04;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-25 11:46
 **/
public class Test {
    public static void main(String[] args) {
        //声明一个字符类型变量
        char charNum = 'A';
        // 声明一个整数类型变量
        int intResult = charNum + 1;
        System.out.println(intResult);//66
        intResult = intResult - 1;
        System.out.println(intResult);//65
        intResult = intResult * 2;
        System.out.println(intResult);//130
        intResult = intResult / 2;
        System.out.println(intResult);//65
        intResult = intResult + 8;//73
        intResult = intResult % 7;//73%7  10---3
        System.out.println(intResult);//3
        System.out.println("-------");
        // 声明一个浮点型变量
        double doubleResult = 10.0;
        System.out.println(doubleResult);//10.0
        doubleResult = doubleResult - 1;
        System.out.println(doubleResult);//9.0
        doubleResult = doubleResult * 2;
        System.out.println(doubleResult);//18.0
        doubleResult = doubleResult / 2;
        System.out.println(doubleResult);//9.0
        doubleResult = doubleResult + 8;
        doubleResult = doubleResult % 7;//17.0%7    2---3.0
        System.out.println(doubleResult);//3.0
        System.out.println("-------------");
        int i =100;
        int sum =0;
        while (i<=100 && i>0){
            sum += i;//100
            i--;//99
        }
        System.out.println(sum);
        System.out.println("----------");
        // 声明并初始化int数组
        int[] numbers = { 43, 32, 53, 54, 75, 7, 10 };
        System.out.println("----for each----");
        // for-each语句
        for (int item : numbers) {
            System.out.println("Count is:" + item);
        }

    }
}
//父类
class Base{
    //父类中的静态方法
    static void test(){
        System.out.println("我是父类的静态方法");
    }
}
//子类
class Child extends Base{
    //子类不能重写父类中的静态方法 编译错误
    /* 因为父类中静态方法时编译时就执行了 非静态方法时运行时的 所以不能重写
    void test(){
    }*/



}
