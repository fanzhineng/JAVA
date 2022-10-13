package com.fzn2020.day07;

import java.util.Arrays;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-29 14:06
 **/
public class Str2Demo {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        /*
            因为String是final类，所以abc都是定值 是常量 所以存在常量池中。
            str1 ="abc" 在编译完成时，赋值
            先在常量池中找abc 找到了，就不会再存入abc
         */
        System.out.println(str1 == str2);//t
        //编译时期找到常量池中的ab c,整个过程没有让我StringBuffer去新生成abc,也没有把变量的地址给str4
        String str4 = "ab" + "c";
        System.out.println(str1 == str4);//t
        String c = "c";
        String str3 = "ab" + c;//运行
        /*
            在定义str3时，是通过常量池中的ab和+ c 这个变量
            +c 这个变量，不是在编译时完成的，是在运行时，取c的值。
            再通过StringBuffer中的连续字符串形成的abc这个值
            然后再把新生成的abc的值，给str3.
         */
        System.out.println(str1 == str3);//f
        String str5 = new String("abc");
        System.out.println(str1 == str5);//f
        /*如果希望str1和str5地址相同
            intern 得到str5 首次出现的实例的引用。
            因为new String("abc") abc 在常量池出现过 得到那个开始出现的引用值。
         */
        System.out.println(str5.intern()==str1);//t
        System.out.println("-------------");

        //常用方法：
        //去掉两边的空格
        String name = " java sun ";
        System.out.println(name);
        System.out.println(name.trim());
        //判断字符串是不是含有@ 如果含有，得到下标，如果不含有-1
        String em = "1152826742@qq.com";
        System.out.println(em.indexOf("@"));//10
        String url = "http://baidu.com/index/reg.do";
        //返回最后一次出现/的位置
        System.out.println(url.lastIndexOf("/"));
        //取到最后/到.的这一串 取不到最后一位
        System.out.println(url.substring(url.lastIndexOf("/"),url.lastIndexOf(".")));
        //判断是不是以.do结尾
        System.out.println(url.endsWith(".do"));//t
        System.out.println("-----------");
        //字符串就是一个一个的字符组成的数组
        //字符转成字符串
        char[] ch = new char[]{'A','B','中','国'};//字符是单引号
        String s0 = new String(ch);
        System.out.println(s0);
        //字符串转成字符   toCharArray
        String str0 = "中国人民abc";
        char[] ch0 = str0.toCharArray();
        System.out.println(Arrays.toString(ch0));
        System.out.println("--------------");
        /*
            已知一个字符串 axyzf 然后在下标为2处，增加 u
         */
        String strx = new String("axyzf");
        char[] chs = strx.toCharArray();//转换为char数组
        char[] ch2 = new char[chs.length+1];
        for (int i = 0; i < chs.length; i++) {
            if (i==2){
                ch2[i+1] = chs[i];
                ch2[i] = 'u';
            }else if (i>2){
                ch2[i+1] = chs[i];//把之前在2处的变量，移动到下标为3处。
            }else {
                ch2[i] = chs[i];
            }
        }
        System.out.println(Arrays.toString(ch2));
    }
}
