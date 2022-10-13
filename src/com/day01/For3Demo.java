package com.day01;

/**
 * @program: JAVA
 * 描述：
 *        99乘法表
 * @author: fzn
 * @create: 2020-07-20 15:56
 **/
public class For3Demo {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){//i控制行
            for (int j=1;j<=i;j++){
                //控制样式排版
                if((i==3 &&j==2)  ||  (i==4 && j==2)){
                    System.out.print(j+"*"+i+"="+(i*j)+"  ");
                }else {
                    System.out.print(j+"*"+i+"="+(i*j)+" ");
                }
            }
            System.out.println();
        }
    }
}
