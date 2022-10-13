package com.fzn2020.fzn.action;

import com.fzn2020.fzn.util.CardUtil;

import java.io.IOException;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：  运行类
 * @author: fzn
 * @create: 2020-08-13 19:05
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        //创建Scanner对象 用于输入
        Scanner sc = new Scanner(System.in);
        System.out.println("***********欢迎使用SoSo5G移动业务大厅***********");
        //使用do-while 一直循环使用
        do {
            System.out.println("1.用户注册\t2.用户登录\t3.使用SoSo\t4.话费充值\t5.资费说明\t6.退出系统");
            System.out.print("请选择你要进行的操作：");
            int nextInt = sc.nextInt();
            switch (nextInt){
                case 1:
                    //用户注册
                    break;
                case 2:
                    //用户登录
                    break;
                case 3:
                    //使用SoSo
                    break;
                case 4:
                    //话费充值
                    break;
                case 5:
                    //资费说明
                    CardUtil.showInfo("zf.txt");
                    break;
                case 6:
                    //退出系统
                    System.out.println("感谢使用，下次见！");
                    System.exit(0);
                default:
                    System.out.println("请正确输入！");
            }
        }while (true);
    }
}
