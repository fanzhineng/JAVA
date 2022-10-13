package com.fzn2021.day02;

import java.util.Scanner;

/**
 * @program: JavaSE
 * 描述：      数组的添加
 * @author: fzn
 * @create: 2021-12-08 17:19
 **/
public class ArrayAdd {
    public static void main(String[] args) {
        /*
        要求：实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java
            1.原始数组使用静态分配int[] arr = {1,2,3}
            2.增加的元素4，直接放在数组的最后arr = {1,2,3,4}
            3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n

        思路分析
            1. 定义初始数组int[] arr = {1,2,3}//下标0-2
            2. 定义一个新的数组int[] arrNew = new int[arr.length+1];
            3. 遍历arr 数组，依次将arr 的元素拷贝到arrNew 数组
            4. 将4 赋给arrNew[arrNew.length - 1] = 4;把4 赋给arrNew 最后一个元素
            5. 让arr 指向arrNew ; arr = arrNew; 那么原来arr 数组就被销毁
            6. 创建一个Scanner 可以接受用户输入
            7. 因为用户什么时候退出，不确定，老师使用do-while + break 来控制
        */

        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3};
        do {


            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            System.out.println("请输入你要添加的元素");
            int addNum = scanner.nextInt();

            newArr[newArr.length - 1] = addNum;
            arr = newArr;
            System.out.println("====arr 扩容后元素情况====");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
            //问用户是否继续
            System.out.print("是否继续添加y/n:");
            char key = scanner.next().charAt(0);
            if( key == 'n') { //如果输入n ,就结束
                break;
            }
        }while(true);
        System.out.println("你退出了添加...");

    }
}