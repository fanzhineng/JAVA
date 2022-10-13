package com.fzn2020.day10;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-03 09:39
 **/
import java.util.*;
public class MapTest {
    public static void main (String[] args) {
        List pList = new ArrayList();
        //最好的修改方法 List pList = new ArrayList();
        pList.add("A"); //第五行
        pList.add("B"); //第六行
        for( int i = 0; i < pList.size(); i++){ //第七行
            String str = (String) pList.get(i); //第八行
            System.out.print(str) ;
        }
        System.out.println();
    }
}
