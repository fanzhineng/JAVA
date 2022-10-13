package com.fzn2020.day11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-04 09:38
 **/
public class LinkDemo {
    public static void main(String[] args) {
        System.out.println("Welcome KTV SYS");
        System.out.println("0显示目前列表");
        System.out.println("1增加歌曲");
        System.out.println("2将歌置顶");
        System.out.println("3将歌前移");
        System.out.println("4退出系统");
        //默认情况下，我先放一首歌
        LinkedList li = new LinkedList();
        li.add("听妈妈的话");
        li.add("青花瓷");
        li.add("告白气球");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("请输入你要进行的操作：");
            int n = sc.nextInt();
            switch (n){
                case 0:
                    listMu(li);
                    break;
                case 1:
                    add(li);
                    break;
                case 2:
                    setTop(li);
                    break;
                case 3:
                    setBef(li);
                    break;
                case 4:
                    close();
                    break;
            }
        }
    }
    //0显示列表
    public static void listMu(LinkedList li){
        System.out.println("目前共有"+li.size()+"首");
        Iterator it = li.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    //1.增加歌曲
    public static void add(LinkedList li){
        System.out.println("请输入你要增加歌曲名");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if (li.contains(name)){
            System.out.println("此歌已在列表中");
        }else {
            li.add(name);
        }
        System.out.println("目前共有"+li.size()+"首");
        for (Object o : li) {
            System.out.println(o);
        }
    }
    //2将歌置顶     先找到这首歌的下标 删除，再增加到第一位
    public static void setTop(LinkedList li){
        System.out.println("请输入需要置顶歌曲名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        //先找到位置
        int pos = li.indexOf(name);
        if (pos==0){
            System.out.println("此歌已在第一位");
        }else if (pos<0){
            System.out.println("没有此歌，请重写输入");
        }else {
            li.remove(name);//先删除
            li.addFirst(name);//放在第一首
            System.out.println("操作成功");
        }
        System.out.println("目前共有"+li.size()+"首");
        for (Object o : li) {
            System.out.println(o);
        }
    }
    //3将歌前移
    public static void setBef(LinkedList li){
        System.out.println("请输入需要前移歌曲名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        //先找到位置
        int pos = li.indexOf(name);
        if (pos==0){
            System.out.println("此歌已在第一位");
        }else if (pos<0){
            System.out.println("没有此歌，请重写输入");
        }else {
            li.remove(name);//先删除
            li.add(pos-1,name);//放在前一个歌曲
            System.out.println("操作成功");
        }
        System.out.println("目前共有"+li.size()+"首");
        for (Object o : li) {
            System.out.println(o);
        }
    }
    //4关闭
    public static void close(){
        System.out.println("马上关闭系统");
        System.exit(0);
    }
}
