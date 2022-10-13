package com.day04;

import java.util.Arrays;
import java.util.Random;

/**
 * @program: JAVA
 * 描述：
 *      新建一个类，共有一副牌，有红桃 梅花 黑桃 红心 王 类别
 *      有三个玩家，玩家1 玩家2 玩家3
 *      每位玩家手上有一把牌，留三张底牌
 * @author: fzn
 * @create: 2020-07-23 18:54
 **/
public class Game {
    public static void main(String[] args) {
        //拿到54张牌
        Brand[]  b = new Brand[54];
        //用来控制前四张都是一样的牌 但是花色不同 保证循环12此之后所有的数字牌都能拿到
        int count = 0;
        //通过循环拿到 2~A 不拿大小王
        for (int i=0;i<=12;i++){
            //拿到花色
            for (int j=0;j<=3;j++){
                b[count++]= new Brand(j,i);
            }
        }
        //拿到大小王
        b[count++]= new Brand(4,13);
        b[count++]= new Brand(4,14);
        //打乱牌的顺序 调用方法
        upset(b);
        System.out.println(Arrays.toString(b));
        System.out.println("-----------");
        //3个玩家
        Person[] p = new Person[4];
        p[0] = new Person(1,"张珊");
        p[1] = new Person(2,"李四");
        p[2] = new Person(3,"王五");
        p[3] = new Person(3,"底牌");

        //分牌
        for (int k=0;k<b.length-3;k++){
            Brand br = b[k];//出来一张牌
            //p[k%3] ->0 1 2这样保证 第一张和第四张是发第一个人
            p[k%3].draw(br);
        }
        //底牌
        for (int i=b.length-3;i<b.length;i++){
            Brand brand =b[i];//拿出剩下的牌
            p[3].draw(brand);//放入底牌中
        }
        System.out.println(p[0]);
        System.out.println(p[1]);
        System.out.println(p[2]);
        System.out.println(p[3]);
    }
    //打乱牌的顺序
    public static void upset(Brand[] b){
        //利用随机数 随便取出其中的下标把值放入i中
        Random r = new Random();
        for(int i =0;i<b.length;i++){
            int j = r.nextInt(54);//拿到随机下标
            Brand t=b[j];//把随机下标的数拿出来放入t中
            b[j] = b[i];
            b[i]= t;
        }
        
    }

}
//父类 牌类
class Brand{
    //定义两个常量数组一个用来表示数字和大小王 一个用来表示花色
    String[] NUM_BRAND = {"2","3","4","5","6","7","8","9","10","J","Q","K","A","小王","大王"};
    String[] COLOR_BRAND = {"♦","♣","♠","♥",""};
    //为了方便拿到数字和花色，我们再定义两个变量，变量控制分别控制两个常量数组的下标
    int num;//控制数字的下标
    int color;//控制花色
    //默认构造器
    public Brand(){

    }
    //有参构造器
    public Brand(int color,int num){
        this.color = color;
        this.num = num;
    }
    //重写toString
    @Override
    public String toString(){
        return COLOR_BRAND[color]+NUM_BRAND[num];
    }
}

//玩家类
class Person{
    //id
    int id;
    //名字
    String name;
    //手中的牌 牌类数组
    Brand[] hand={};
    //默认构造器
    public Person() {

    }
    public Person (int id,String name){
        this.id = id;
        this.name = name;
    }
    //定义一个方法 摸牌
    public void draw(Brand b){
        //先让数组长度加1，才能把牌存入数组中，因为数组一定定义好长度就不能改变。
        hand = Arrays.copyOf(hand,hand.length+1);
        //然后存入手牌中
        hand[hand.length-1]=b;
    }
    //重写toString
    @Override
    public String toString(){
        return name+Arrays.toString(hand);
    }

}

