package com.fzn2020.day02;
import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-21 10:39
 **/
public class AryDemo {
    public static void main(String[] args) {
        //通过左边的[来解析是不是数组。
        //1.动态数组
        int[] ary;//标准写法 定义空数组。
        ary = new int[4];//放了四个位置，每一个位置的默认值是0，因为是int
        for (int i =0;i<4;i++){
            ary[i]=(int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(ary));
        //2.动态数组
        int[] ary2 = new int[]{11,12,13,14,15};
        ary2=new int[]{23,24};
        for (int i=0;i<ary2.length;i++){
            System.out.println(ary2[i]);
        }
        System.out.println("------------------");
        //静态数组
        int[] ary3 = {11,12,13,14,15};
        for (int i=0;i<ary3.length;i++){
            System.out.println(ary3[i]);
        }
        System.out.println("--------------------");
        //分别用char float boolean 定义数组，赋随机值，并输出结果
        char[] ary4 = new char[5];
        for (int i=0;i<ary4.length;i++){
            ary4[i]=(char)(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(ary4));
        System.out.println("--------------------");
        //数组的扩展
        int[] ary5= new int[]{11,12,13,14};//希望在数组的最后一位增加元素15
        //长度增加1
        ary5=Arrays.copyOf(ary5,ary5.length+1);
        //最后一个元素
        ary5[ary5.length-1]=15;
        System.out.println(Arrays.toString(ary5));
    }
}

