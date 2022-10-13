package com.fzntest;
import java.util.*;
/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-01 09:40
 **/
public class MapTest {

        public static void main (String[] args) {
            List pList = new ArrayList();
            //最好的修改方法 List pList = new ArrayList();
            pList.add("a"); //第五行
            pList.add("b"); //第六行
            for( int i = 0; i < pList.size(); i++){ //第七行
                String str = (String) pList.get(i); //第八行
                System.out.print(str) ;
            }
        }

}
class B{
    int a;
    int b;

    public B(int x) {
        a = x;
    }
    public B(int x,int b) {
        new B(a);
    }

}
