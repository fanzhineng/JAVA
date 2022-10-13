package com.day09;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 *  3 新建文件，自己写商品的类，通过泛型和集合。物品
 *  *      可输入商品的编号  价格 名字，对商品增删改查。
 * @author: fzn
 * @create: 2020-07-31 19:14
 **/
public class ExeCDemo {
    Scanner sc = new Scanner(System.in);
    List<Article> li = new ArrayList<>();//全局
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExeCDemo ex = new ExeCDemo();
        System.out.println("-----还有来到mi商城-----");
        while (true){
            System.out.println("请对应数字输入你要执行的操作 ：");
            System.out.println("1)添加商品 2)查询商品  3）显示当前所有商品   其他数字退出");
            try {
                int en = sc.nextInt();
                switch (en){
                    case 1:
                        ex.add();
                        break;
                    case 2:
                        ex.In();
                        break;
                    case 3:
                        ex.show();
                        break;
                    default:
                        System.out.println("退出mi商城！");
                }
            } catch (InputMismatchException e) {
                System.out.println("请输入整数！");
            }
        }
    }



    //添加商品：
    public void add(){
        try {
            System.out.println("请输入你要添加的商品编号：");
            int id =sc.nextInt();
            System.out.println("请输入你要添加的商品价格：");
            int price = sc.nextInt();
            System.out.println("请输入你要添加的商品名：");
            String name = sc.next();
            li.add(new Article(id,price,name));
            System.out.println("添加成功！");
        } catch (InputMismatchException e) {
            System.out.println("请按正确的格式输入！");
        }
    }
    //显示当前商品
    public void show(){
        System.out.println("当前所有商品为：");
        for (Article a : li) {
            System.out.println("编号："+a.id+" 价格:"+a.price+" 商品名:"+a.name);
        }
    }

    //查询
    public void In(){
        System.out.println("请输入你要查询的商品名：");
        String str = sc.next();
        try {
            for (int i = 0; i < li.size(); i++) {
                if (str.equals(li.get(i).name)){
                    System.out.println("编号："+li.get(i).id+"  价格:"+li.get(i).price+" 商品名"+li.get(i).name);
                    boolean flag=true;
                    while (flag){
                        System.out.println("请输入你要执行的操作 1)修改商品 2) 删除商品 3)不修改");
                        int d = sc.nextInt();
                        switch (d){
                            case 1:
                                System.out.println("请输入你要修改的内容 1)编号 2)价格 3)商品名 不修改");
                                int f = sc.nextInt();
                                switch (f){
                                    case 1:
                                        System.out.println("请输入你要修改的编号为：");
                                        int xid = sc.nextInt();
                                        li.get(i).id =xid;
                                        break;
                                    case 2:
                                        System.out.println("请输入你要修改的价格为：");
                                        int xprice = sc.nextInt();
                                        li.get(i).price =xprice;
                                        break;
                                    case 3:
                                        System.out.println("请输入你要修改的商品名为：");
                                        String xname = sc.next();
                                        li.get(i).name =xname;
                                        break;
                                    default:
                                        System.out.println("退出修改");
                                }
                                System.out.println("修改成功");
                                flag=false;
                                break;
                            case 2:
                                li.remove(i);
                                System.out.println("删除成功！");
                                flag=false;
                                break;
                            case 3:
                                flag=false;
                                break;
                            default:
                                System.out.println("你的输入有误！请重新输入！");
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("你的输入有误！");
        }
    }

}

//物品类
class Articles{
    int id;//编号
    int price;//价格
    String name;//商品名
    //构造器
    public Articles(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
}
