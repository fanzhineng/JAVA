package com.day03;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-22 15:22
 **/
public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(3,4);
        System.out.println(p1.x);
        System.out.println(p1.y);
        System.out.println(p1.dis());//到圆点的距离.

        Point p2 = new Point(6,8);
        System.out.println(p1.dis(p2));
    }
}
class Point{
    int x;
    int y;
    //构造器
    public   Point(){
    }
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    //计算到圆点距离
    public double dis(){
        return Math.sqrt((x*x)+(y*y));
    }
    //计算点之间的距离
    public double dis(int x2,int y2){
        return Math.sqrt((x2-x)*(x2-x)+(y2-y)*(y2-y));
    }
    //针对方法2 更新
    public double dis(Point p2){
        return this.dis(p2.x,p2.y);//先得到p2中的x y 然后再调用dis
    }

}