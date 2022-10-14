package com.fzn2022.day03.list_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @program: JAVA
 * 描述：  练习
 *      对集合中的钱按照从小到大的排序
 * @author: fzn
 * @create: 2022-10-14 16:34
 **/
public class ListExe {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        // List list = new ArrayList();
        // List list = new Vector();
        List list = new LinkedList();
        list.add(new Book("三国演义","罗贯中",10.1));
        list.add(new Book("小李飞刀","古龙",5.1));
        list.add(new Book("红楼梦","曹雪芹",34.1));

        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("---------------");
        sort(list);
        for (Object o : list) {
            System.out.println(o);
        }
    }

    @SuppressWarnings({"all"})
    public static void sort(List list){
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            for (int j = 0; j < listSize - 1 - j; j++) {
                // 比较 取出对象
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if (book1.getPrice() > book2.getPrice()){
                    // 交换
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称：" + name + "\t\t价格：" + price + "\t\t作者：" + author+"\n";
    }
}