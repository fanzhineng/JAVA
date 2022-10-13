package java0703.day0921;

import java.util.ArrayList;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-21 15:49
 **/
public class Test {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            l.add(String.valueOf(i));
        }
        l.stream().filter(e->!e.equals("5")).forEach(System.out::print);
        

    }

}
