package com.fzn2020.java0703.day0921;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-21 15:39
 **/
class Super {
   public Integer getLength(){
       return new Integer(6);
   }

}
public class Sub extends Super{
    @Override
    public Integer getLength() {
        return new Integer(5);
    }

    public static void main(String[] args) {
        Super sooper = new Super();
        Sub sub = new Sub();
    }
}
