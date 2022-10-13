package com.fzn2021.day07;


public class Test {
    public static int a = 1;
    public static void main(String[] args) {
        int a = 10;

        a++;
        Test.a++;
        Test t=new Test();
        System.out.println("a=" + a + " t.a=" + t.a);
        Integer a1=17;
        Integer a2=17;
        Integer b1=2017;
        Integer b2=2017;
        Integer c1 = new Integer(17);
        Integer c2 = new Integer(17);
        Integer d1 = new Integer(2017);
        int d2 = 2017;
        System.out.println(a1==a2);
        System.out.println(b1==b2);
        System.out.println(c1==c2);
        System.out.println(d1==d2);
    }

}