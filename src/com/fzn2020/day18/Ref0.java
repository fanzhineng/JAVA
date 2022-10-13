package com.fzn2020.day18;

/**
 * @program: JAVA
 * 描述：      普通的类
 * @author: fzn
 * @create: 2020-08-13 11:43
 **/
public class Ref0 {
    int i=1;
    String name = "jsk";
    public void dos(String addr){
        System.out.println("Ref0中的dos方法"+addr);
    }
    public void eat(){
        System.out.println("Ref0中的eat方法...");
    }

    public Ref0() {
    }
    public Ref0(int i, String name) {
        this.i = i;
        this.name = name;
    }
}
