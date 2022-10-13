package com.day09;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: JAVA
 * 描述：
 *      3 新建文件，自己写商品的类，通过泛型和集合。物品
 *      可输入商品的编号  价格 名字，对商品增删改查。
 * @author: fzn
 * @create: 2020-07-31 18:56
 **/
public class ExeBDemo {
    public static void main(String[] args) {

        Article a1 = new Article(101,3,"百世可乐");
        Article a2 = new Article(102,10,"衣架");
        Article a3 = new Article(103,200,"被子");
        List<Article> li = new ArrayList<>();
        //增加
        li.add(a1);
        li.add(a2);
        li.add(a3);
        for (Article a : li) {
            System.out.println("编号："+a.id+"  价格:"+a.price+" 商品名："+a.name);
        }
        System.out.println("------修改后-----");
        //修改 把编号为102 的商品 价格加5
        for (int i = 0; i < li.size(); i++) {
            if (li.get(i).id == 102){
                li.get(i).price += 5;
            }
        }
        for (Article a : li) {
            System.out.println("编号："+a.id+"  价格:"+a.price+" 商品名："+a.name);
        }
        System.out.println("------删除后-----");
        //删除 百世可乐
        li.remove(a1);
        for (Article a : li) {
            System.out.println("编号："+a.id+"  价格:"+a.price+" 商品名："+a.name);
        }
    }
}
//物品类
class Article{
    int id;//编号
    int price;//价格
    String name;//商品名
    private int aa;
    //构造器
    public Article(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
}
