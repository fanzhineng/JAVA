package java0703.day0921;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-23 09:45
 **/
public class Example {
    public static void main(String[] args) {
        int x =11;
        x+=3+(x++)%3;
        System.out.println(x);
        System.out.println(foo(0xAABBCCDD));
    }

    private static int foo(int x) {
        int a = x;
        a = a | 0x05050505;
        return (a & 0x000000FF)>>4;
    }


}
