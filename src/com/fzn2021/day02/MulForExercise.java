package com.fzn2021.day02;

import java.util.Scanner;

/**
 * @program: JavaSE
 * 描述：          利用循环计算平均分
 * @author: fzn
 * @create: 2021-12-08 11:26
 **/
public class MulForExercise {
    public static void main(String[] args) {
        //统计3 个班成绩情况，每个班有5 名同学，
        //求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
        //统计三个班及格人数，每个班有5 名同学。
        Scanner scanner = new Scanner(System.in);
        // 总分数
        double totalScore = 0;
        // 及格人数
        int passNum = 0;
        // 班级个数
        int classNum = 3;
        // 学生人数
        int stuNum = 5;

        // 班级
        for (int i = 1; i <= classNum; i++) {
            // 一个班的总分
            double sum = 0;
            // 学生
            for (int j = 1; j <= stuNum; j++) {
                System.out.println("请数第"+i+"个班的第"+j+"个学生的成绩");
                double score = scanner.nextDouble();
                //当有一个学生成绩>=60, passNum++
                if (score >= 60){
                    passNum ++;
                }
                sum += score;
                System.out.println("成绩为："+score);
                //把sum 累积到totalScore
                totalScore += sum;
            }
        }
        System.out.println("三个班总分="+ totalScore
                + " 平均分=" + totalScore / (classNum*stuNum));
        System.out.println("及格人数=" + passNum);
    }
}