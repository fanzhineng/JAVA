package com.subject;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-23 14:55
 **/
public class Koa {
    public int id = 101;//公共的
    protected String name = "fan";//保护的
    String email = "1152826742@qq.com";//默认
    private  String password ="123456";//私有

    //方法：目的 别人直接调用password是拿不到，我先别的类调用这个方法 间接使用password
    public String getD(){
        return password;
    }
}
