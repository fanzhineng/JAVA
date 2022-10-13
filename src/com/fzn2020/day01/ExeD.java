package com.fzn2020.day01;

/**
 * @program: JAVA
 * 描述：
 *      100以内的质数
 *      质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。
 *      比较方法：对自己开平方，比较一半
 * @author: fzn
 * @create: 2020-07-20 19:09
 **/
public class ExeD {
    public static void main(String[] args) {
        int m, i, j;
        boolean f ;
        for (i = 2; i <= 100; i++) {
            f = true;
            //开平方取整数
            //m = (int) Math.sqrt(i);
            for (j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    f = false;
                    break;
                }
            }
            if (f) {
                System.out.println(i);
            }
        }

    }
}

