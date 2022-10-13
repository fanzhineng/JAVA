package com.fzn2020.day04;


import java.util.Arrays;
import java.util.Random;

/**
 * @program: JAVA
 * 描述：
 *      发牌游戏
 * @author: fzn
 * @create: 2020-07-23 15:31
 **/
public class CardDemo {
    public static void main(String[] args) {
        //Card c = new Card();
        //System.out.println(c);
        //先让54张牌出现 打乱
        Card[] cs = new Card[54];//用数组存入54张牌
        int co = 0;
        for (int rank=0;rank<=12;rank++){
            cs[co++]= new Card(0,rank);
            cs[co++]= new Card(1,rank);
            cs[co++]= new Card(2,rank);
            cs[co++]= new Card(3,rank);
        }
        //大小王
        cs[co++]=new Card(4,13);
        cs[co++]=new Card(4,14);
        //打乱牌
        //CardDemo ca = new CardDemo();//如果方法没有使用static就要创建对象
        //cs = ca.upset(cs);
        upset(cs);
        System.out.println(Arrays.toString(cs));
        System.out.println("-------");
        //玩家
        Player[] p = new Player[3];
        p[0] = new Player(101,"张珊");
        p[1] = new Player(102,"李四");
        p[2] = new Player(103,"王五");
        //把牌发下去
        for (int k=0;k<cs.length;k++){
            Card cx = cs[k];//出来一张牌
            //p[k%3] ->0 1 2这样保证 第一张和第四张是发第一个人
            p[k%3].add(cx);
        }
        System.out.println(p[0]);
        System.out.println(p[1]);
        System.out.println(p[2]);
    }
    //打乱牌
    public static Card[] upset(Card[] cs){
        Random rd = new Random();
        for (int i=0;i<cs.length;i++){
            int j=rd.nextInt(54);
            Card t =cs[j];
            cs[j]=cs[i];
            cs[i]=t;
        }
        return cs;
    }
}
//牌类
class Card{
    //先把要显示的内容，全部存起来。
    String[] RANK_NAMES={"3","4","5","6","7","8","9","10","J","Q","K","A","2","小王","大王"};
    //五大类
    String[] SUIT_NAMES ={"♦","♣","♠","♥",""};
    //为了操作方便，再定义两个变量
    int suit;//0 方块 1 梅花 SUIT_NAMES[suit]--方块
    int rank;//0-3 1-4
    //构造器
    public Card(){

    }
    //有参构造器
    //传入0 0 ---方块3
    public Card(int suit,int rank){
        this.suit = suit;
        this.rank = rank;
    }
    //重写toString方法
    public String toString(){
        //♦3
        return SUIT_NAMES[suit]+RANK_NAMES[rank];
    }
}

//玩家类
class Player{
    int id;
    String name;
    Card[] cs = {};//人手一把牌
    public Player(int id,String name){
        this.id = id;
        this.name = name;
    }
    //写一个方法
    public void add(Card c){//传入一张牌
        //数组长度加1 手中的牌的长度加1
        cs = Arrays.copyOf(cs,cs.length+1);
        cs[cs.length-1] = c;//存入
    }
    //重写toString()
    public String toString(){
        return name+Arrays.toString(cs);
    }
}
