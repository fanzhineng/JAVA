package com.fzn2020.day02;

/**
 * @program: JAVA
 * 描述：
 *      100以内的质数
 *        质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。
 *       比较方法：对自己开平方，比较一半
 *
 *  先假设所有的都是质数
 * @author: fzn
 * @create: 2020-07-21 09:20
 **/
public class EexDemo {
    public static void main(String[] args) {
        for (int i=2;i<101;i++){
            boolean f=true;
            for (int j=2;j<i/2;j++){
                if (i%j==0){
                    f=false;
                    break;
                }
            }
            if (f){
                System.out.println(i);
            }
        }
    }
}
