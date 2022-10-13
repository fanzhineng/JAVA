package com.fzn2020.day04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *         试卷-
 * @author: fzn
 * @create: 2020-07-23 10:27
 **/
public class QuestionDemo {
    public static void main(String[] args) {
        //int[] ary = new int[2];
        Qu[] q = new Qu[2];//放两个Qu 放两份试卷
        //选项中的选项
        String[] ops = new String[]{"A.朱重八","B.燕王","C.刘伯温","D.顺治"};
        //多选答案的答案  输入的答案
        char[] chs = new  char[]{'A','B','C'};
        //单选
        Sing si = new Sing("下面选项中不是明朝人物的是：",ops,'D');
        //多选
        Mul mu = new Mul("下面选项中是明朝人物的是：",ops,chs);
        //多选
        q[0] = si;//单选题 是试卷  发生多态
        q[1] = mu;
        Scanner sc = new Scanner(System.in);
        //遍历试卷
        for (int i=0;i<q.length;i++){
            q[i].pr();
            System.out.print("请输入你的选项：");
            String str = sc.nextLine();//nextLine可以包含空格
            //str-char 把String 转换为char数组 toUpperCase变成大写
            char[] chs2 = str.toUpperCase().toCharArray();
            if (q[i].check(chs2)){//如果正确
                System.out.println("答对了");
            }else {
                System.out.println("答错了");
            }
        }
    }
}
//父类---包含的属性有题干 选项 方法有 核对答案
class Qu{
    String text;//题干
    String[] options;//选项 A.xx B.xx C.xx
    //运行时要把题干和选项输出到控制台
    public void pr(){
        //输出题干
        System.out.println(text);
        //输出选项
        for (int i=0;i<options.length;i++){
            System.out.print(options[i]+" ");
        }
        System.out.println();
    }
    //核对答案 :等下子类要重写的，默认参数为一个数组。
    //单选也可以chs[0] 如果是多选     chs数组
    public boolean check(char[] chs){
        return false;
    }
    //父类有参构造器
    public Qu(String text,String[] options){
        this.text = text;
        this.options = options;
    }
}
//子类 单选
class Sing extends Qu{
    //可用父类的题干和选项
    char ch;//答案
    //重写父类的核对答案,chs是等下要传入的。
    public boolean check(char[] chs){
        //先判断chs是否为空 长度不为1 单选题只有一个答案
        if (chs==null || chs.length!=1){
            return false;
        }
        //再判断是否正确
        return ch==chs[0];
    }
    //构造器
    public Sing(String text, String[] options,char ch) {
        super(text, options);
        this.ch = ch;
    }
}
//多选
class Mul extends Qu{
    //提供的答案 A B C
    char[] chs;

    //核对答案  chs2等下要输入的
    public boolean check(char[] chs2){
        Arrays.sort(chs2);
        //要比较是否相同
        return Arrays.equals(chs,chs2);
    }

    //构造器
    public Mul(String text, String[] options,char[] chs) {
        super(text, options);
        this.chs = chs;
    }

}
