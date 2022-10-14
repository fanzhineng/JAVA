package com.fzn2022.day03.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @program: JAVA
 * Collection 遍历
 * 描述：  Iterator 迭代器中的常用方法
 *          增强for循环  底层还是迭代器
 * @author: fzn
 * @create: 2022-10-14 15:29
 **/
public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("小李飞刀","古龙",5.1));
        col.add(new Book("红楼梦","曹雪芹",34.1));

        // 遍历集合
        Iterator iterator = col.iterator();
        // 判断是否还有数据  itit 快捷键  ctrl + j
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println("obj"+obj);
        }

        // 增强for循环
        for (Object o : col) {
            System.out.println(o);
        }

    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book() {
    }

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
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}