package com.fzn2021.day14;

/**
 * @program: JavaSE
 * 描述：  字符串交换
 * @author: fzn
 * @create: 2022-01-09 18:52
 **/
public class String_ {
    public static void main(String[] args) {
        String str = "abcdef";
        String reverse = null;
        try {
            reverse = reverse(str, 0, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(reverse);

    }
    public static String reverse(String str, int start, int end){
        if (!(str !=null && start >=0 && end > start &&  end <= str.length())){
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start,  j = end; i < j ; i++,j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}