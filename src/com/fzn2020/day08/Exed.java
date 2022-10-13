package com.fzn2020.day08;

/**
 * @program: JAVA
 * 描述：      练习catch并列 可以抛出自己的信息
 * @author: fzn
 * @create: 2020-07-30 16:01
 **/
public class Exed {
    public static void main(String[] args) {
        String str = null;//真正的空，
        String str2 = "";//只是内容为空，长度为0
        //System.out.println(str.length());//会报错  NullPointerException 空指针异常
        System.out.println(str2.length());
        System.out.println("----------");
        System.out.println(test(null));//空指针异常
        System.out.println("----------");
        System.out.println(test(""));//运行时异常
        System.out.println("----------");
        //System.out.println(test("Z"));//相距范围超出了  运行时异常
        System.out.println("----------");
        System.out.println(test("C"));//相距范围超出了  运行时异常

    }
    //输入一个字符，控制A 相距10以内
    public static int test(String s){
        try {
            int i = s.charAt(0)-'A';
            if (i<0 || i>9){
                throw new Exception("相距范围超出了");
            }
            System.out.println("yes");
            return i;
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
            return 1;
        }catch (RuntimeException e){
            System.out.println("运行时异常");
        }catch (Exception e){
            e.printStackTrace();
            return 3;
        }finally {
            System.out.println("finally");
            return 4;
        }
    }
}
