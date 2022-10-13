package com.fzn2021.day10.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @program: JavaSE
 * 描述：  零钱通
 * @author: fzn
 * @create: 2021-12-20 21:13
 **/
public class SmallChangeSys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key;
        boolean loop = true;
        /*
         * 菜单主体
         */
        // 1) 可以把收益入账和消费 保存到数组
        // 2) 可以使用对象
        // 3) 简单的话可以使用String 对象拼接
        // 1.
        String details = "------------------零钱通明细---------------------";

        // 2.完成收益入账
        double money;
        double balance = 0;
        // 日期
        Date date;
        // 用于日期格式的对象
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //3. 消费
        String note;
        do {
            System.out.println("\n==========零钱通菜单===========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消 费");
            System.out.println("\t\t\t4 退 出");
            System.out.print("请输入你的选择(1-4):");
            key = scanner.next();
            switch (key){
                case "1":
                    // 1 零钱通明细
                    System.out.println(details);
                    break;
                case "2":
                    // 2 收益入账
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
                    if (money <=0){
                        System.out.println("收益入账金额需要大于0");
                        break;
                    }
                    balance += money;
                    // 修改入账信息到 details
                    // 获取当前日期
                    date = new Date();
                    details += "\n收益入账\t+"+ money +"\t"+ dateFormat.format(date)+"\t"+ balance;
                    break;
                case "3":
                    // 3 消 费
                    System.out.print("消费金额：");
                    money = scanner.nextDouble();
                    System.out.print("请输入消费说明：");
                    note = scanner.next();
                    if (money<=0 ||  money > balance){
                        System.out.println("你的消费金额 应该在0-"+ balance);
                        break;
                    }
                    balance -= money;
                    date = new Date();
                    details += "\n"+ note +"\t-"+ money +"\t"+ dateFormat.format(date)+"\t"+ balance;
                    break;
                case "4":
                    // 4 退 出
                    // 定义一个变量
                    String choice;
                    do {
                        System.out.print("你确定要退出吗？（y/n）：");
                        choice = scanner.next();
                    } while (!"y".equals(choice) && !"n".equals(choice));
                    if (choice.equals("y")){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("你的输入有误 请重新选择");
            }

        }while (loop);

        System.out.println("========退出了零钱通项目========");

    }
}