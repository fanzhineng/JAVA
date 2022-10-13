package com.fzn2020.day01;

/**
 * @program: JAVA
 * 描述：百钱买百鸡
 * @author: fzn
 * @create: 2020-07-20 15:38
 **/
public class For2Demo {
    public static void main(String[] args) {
        /*
        * 百钱买百鸡
        * 有100文钱 买100只鸡，鸡中有公，母，小鸡
        * 母的3文钱一只 公的5文钱一只 小的1文三只
        * 问如何买，并分别买到多少只公母小。
        * */
        //变量声明只能有一次，赋值可以有多次

        int g=1;
        int m = 1;
        for (g=1;g<=20;g++){
            for (m=1;m<=33;m++){
                int x=100-g-m;
                if (g*5+m*3+x/3==100 && x%3==0){
                    System.out.println("公鸡："+g+"只 母鸡："+m+"只 小鸡："+x+"只");
                }
            }
        }
    }
}
