package com.fzn2020.day06;

/**
 * @program: JAVA
 * 描述：
 *      单例模式:
 *          为了解决同一个对象要创建很多次的问题。
 * @author: fzn
 * @create: 2020-07-28 11:18
 **/
public class OneDemo {
    public static void main(String[] args) {
        //先不用单例模式
        One o1 = new One();
        o1.buy();
        One o2 = new One();
        //如果o1 和o2 的地址值不同那就说明创建了两个对象
        System.out.println(o1==o2);//false
        System.out.println(o1);
        System.out.println(o2);
        System.out.println("-----------");
        //使用单例模式
        One o3 = One.getIn();
        o3.buy();
        One o4 = One.getIn();
        System.out.println(o3==o4);//true 说明只创建一个对象
        System.out.println(o3);
        System.out.println(o4);
    }
}
class One{
    int id = 1;
    String name = "sun";
    public void buy(){
        System.out.println("此商品在卖");
    }
    //使用单例模式
    /*
    因为static 只有一份 ，后面可通过判断o这个变量有没有
    就知道One 对象有没有创建
    */
    public static One o =null;
    //一般方法 得到One对象
    public static One getIn(){
        if (o==null){//如果对象无，就创建对象o
            o =new One();
        }
        return o;//如果有就返回对象o
    }
}
