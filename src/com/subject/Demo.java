package com.subject;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：      算法题目
 * @author: fzn
 * @create: 2020-09-17 14:26
 **/
public class Demo {
    public static void main(String[] args) {
        System.out.println(findSecondSmallNumber(new int[]{5,1,2,1,6,4,3,1,9}));
        System.out.println("-------------");
        boolean a = palindrome("aba");
        System.out.println(a);
        System.out.println("-------------");
        int subCount = findSubCount("how are you", 'o');
        System.out.println(subCount);
        System.out.println("------------");
        System.out.println(addNum(5));
        System.out.println("----------------");
        getNum(new int[]{2,5,8,10,12,15,16,19,22,},20);
        System.out.println("---------------");
        System.out.println(sorString("3213asdvda"));
        System.out.println("---------------");
        System.out.println(find(new int[]{1,3,5,7,9,11,15}));
    }
    /**
     * 找出一个数组中第二小的数
     * @param arr
     * @return
     */
    public static int findSecondSmallNumber(int[] arr){
        int[] nums = new int[2];
        nums[0] = Integer.MAX_VALUE;//用来存放最小的数
        nums[1] = Integer.MAX_VALUE;//用来存放第二小的数
        for (int i = 0; i < arr.length; i++) {
            //如果数组中最小的数比nums数组中最小的还要小 那么就把数组最下的赋值给nums中最小的数 nums[0]就赋值给nums[1]变成第二小的数
            if (arr[i] < nums[0]){
                nums[1] = nums[0];
                nums[0] = arr[i];
            }else if (arr[i] < nums[1] && arr[i] !=nums[0]){
                //如果数组中没有比最小的数小 但是有比第二小的数小 那么就把那个数赋值给第二小的数
                nums[1] = arr[i];
            }
        }
        return nums[1];
    }
    /**
     * 判断一个数是不是回文（对称）
     */
    public static boolean palindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
      return true;
    }
    /**
     * 判断字母出现的次数:
     *     indexOf底层是循环遍历 时间复杂度是n
     *     charAt底层是直接判断 拿到字符 时间复杂度是1
     */
    public static int findSubCount(String str,char c){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
    /**
     * 求以下表达式的值:1-2+3-4+5-6+7-8……+m;
     */
    public static int addNum(int m){
        if (m%2==0){
            return m/-2;
        }else {
            return m/ -2 +m;
        }
    }
    /**
     * 给定一个n个元素的数组，在数组中查找两个元素，这两个元素的和等于给定的元素K，请给出程序
     * 2 5 8 10 12 15 16 19 22
     * 25
     */
    public static void getNum(int[] arr,int k){
        //先排序
        Arrays.sort(arr);
        int i,j;
        for (i = 0,j=arr.length-1;i < j;) {
            //每次都头和尾部相加
            if (arr[i]+arr[j] == k){
                System.out.printf("%d + %d = %d",arr[i],arr[j],k);
                return;
            }else if (arr[i]+arr[j]<k){
                //如果小于 则移动左边的i++
                i++;
            }else if (arr[i]+arr[j]>k){
                //如果大于 则移动右边的j--
                j--;
            }
        }
        System.out.println("没有整个数！");
    }
    /**
     * 输入任意字符串，对字符串进行 ASCII码的顺序进行排序（升序)，
     * 并对排序后的字符串进行加密，加密规则为:如果是英文字母，则将该字母替换为该字母后的第三个字母。其他字符时, 不做替换。
     */
    public static String sorString(String str){
        StringBuffer s = new StringBuffer();
        char[] chars = str.toCharArray();
        int[] asciis = new int[128];
        for (char c : chars) {
            asciis[c]++;
        }
        for (int i = 0; i < asciis.length; i++) {
            while (asciis[i]-- >0){
                s.append((char) ((i>=97 && i<=122)?(i+3):i));
            }
        }
        return s.toString();
    }
    /**
     * 有一个等差数列(至少三个数字)，但是这个数列中明显缺失了一个数字，
     * 并且这个缺失的数字不是最后一个或者第一个。请写出一个函数，找出这个缺失的数字。例如:
     * 输入:1,3,5,9,11
     * 输出:7
     * 输入:0,5,10,20,25
     * 输出:15
     * 输入:0,1,2,3,4,5,6,7,8,9,11
     * 输出:10
     * 输入:1040,1220,1580
     * 输出:1400
     * 写出解题思路;
     *
     * 答案: 先找出这个等差数列每一项的差值. 可以用 最后的数减去第一个数然后除数列的长度 从第二个数开始循环遍历,
     * 拿前面的数加上这个(差值),如果不相等, 代表缺少的是这个数.
     */
    public static int find(int[] arr){
        //得到差值
        int value = (arr[arr.length-1] - arr[0])/ arr.length;
        //遍历
        for (int i = 1; i <arr.length/2 +1 ; i++) {
            //前面找
            //前一个加差值 等于 后一个
            //如果不相等就是缺少的那一个
            if (arr[i-1]+value != arr[i]){
                return arr[i-1]+value;
            }
            //后面找
            //后一个减差值等于前一个
            if (arr[arr.length-1]-- -value != arr[arr.length-1-i]){
                return arr[arr.length-1] -value;
            }
        }
        return -1;
    }
    /**
     * 请编写一个函数，接受一个非负整数作为参数，返回值为这个参数的各种数字组成的最大的整数
     * 输入:21445
     * 输出:54421
     * 输入:145263
     * 输出:654321
     * 输入:1254859723
     * 输出:9875543221
     */
    /**
     * 给定一个正整数，编写程序计算有多少对质数的和等于这个输入的正整数，并输出结果. 输出值小于1000.
     * 测试用例: 输入10 , 输出2 ((3, 7) 和 (5, 5))
     */

}
