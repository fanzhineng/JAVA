package com.subject;

import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：  排序算法
 * @author: fzn
 * @create: 2020-09-17 10:37
 **/
public class SortingAlgorithm {
    public static void main(String[] args) {
        int[] arr = new int[]{8,2,3,7,1,6};
        bubbleSort(arr);
        System.out.println("冒泡排序："+Arrays.toString(arr));
        selectSort(arr);
        System.out.println("选择排序："+Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("插入排序："+Arrays.toString(arr));
        qu(arr,0,arr.length-1);
        System.out.println("快速排序："+Arrays.toString(arr));
        System.out.println("-----------------斐波那契数列");
        int a=5;
        int i = fibonacciSequence(a);
        System.out.println("第"+a+"位数是："+i);
        System.out.println("-----------------二分查找法");
        Arrays.sort(arr);
        int i1 = binarySearch(arr, 3);
        System.out.println(i1);

    }
    /**
      冒泡排序原理：两个两个进行比较 小的放左边大的放右边
     */
    public static void bubbleSort(int[] arr){
        //临时变量
        int temp;
        //控制要比较的趟数
        for (int i = 0; i < arr.length - 1; i++) {
            //控制每趟要比的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //如果右边比左边小 交换位置
                if (arr[j+1]<arr[j]){
                    temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    /**
     * 选择排序：每一轮的第一个元素和后面的元素比较，如果每轮的第一个元素比后面的元素大，就交换位置，一轮之后，最小的在左边
     */
    public static void selectSort(int[] arr){
        int temp;
        //用来控制第一个元素
        for (int i = 0; i < arr.length-1; i++) {
            //用来控制第一个元素后面的元素
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    /**
     * 插入排序：就是吧一个数组看成两个数组，第一个是有序的，第二个是无序的
     */
    public static void insertionSort(int[] arr){
        int temp;
        //从第二个元素开始 默认前面第一个是有序的
        for (int i = 1; i < arr.length - 1; i++) {
            //取出 放入临时变量中
            temp = arr[i];
            //和之前的元素比较
            for (int j = i-1; j >0 ; j--) {
                //如果之前的大于临时的 就把之前的向下移动一个位置
                if (arr[j]>temp){
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    /**
     * 快速排序：把第一个数当成基数 比基数大就放右边 小就放左边
     */
    public static int quickSort(int[] arr,int low ,int hi){
        if (low>hi){
            return -1;
        }
        //取出第一个假设中间数
        int t = arr[low];
        while (low < hi){
            //如果右边的数比中间数大 不动，下标移动
            while (low < hi && arr[hi] > t){
                hi--;
            }
            //移动 放到左边
            arr[low] = arr[hi];
            //如果左边的数比中间数小 不动 下标移动
            while (low < hi && arr[low] < t){
                low++;
            }
            //移动 放到右边
            arr[hi] = arr[low];
        }
        arr[low] = t;
        //返回下标
        return low;
    }
    //递归调用
    public static void qu(int[] arr,int low ,int hi){
        if (low<hi){
            int i = quickSort(arr, low, hi);//得到中间数
            //分成两部分
            qu(arr,low,i-1);
            qu(arr,i+1,hi);
        }
    }
    /**
     * 斐波那契数列
     */
    public static int fibonacciSequence(int i){
        if (i<=0){
            return 0;
        }
        if (i==1 || i==2){
            return 1;
        }
        return fibonacciSequence(i-1) + fibonacciSequence(i-2);
    }
    /**
     * 二分查找法
     *      得到中间数 比较 比中间数大就看中间数右边的那些数 再递归调用
     */
    public static int binarySearch(int[] arr,int key){
        int low = 0;
        int hi = arr.length-1;
        while (low<=hi){
            //中间下标
            int mid = (low+hi)/2;
            if (arr[mid] > key){
                hi = mid -1;
            }else if (arr[mid] <key){
                low = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
