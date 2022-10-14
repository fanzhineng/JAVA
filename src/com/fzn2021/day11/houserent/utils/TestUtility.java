package com.fzn2021.day11.houserent.utils;

import com.fzn2021.day11.houserent.doman.House;

/**
 * @program: JavaSE
 * 描述：  测试类
 * @author: fzn
 * @create: 2021-12-22 18:54
 **/
public class TestUtility {
    public static void main(String[] args) {
        // 功能：读取键盘输入的指定长度的字符串
        // String s = Utility.readString(3);
        // System.out.println(s);

        House house = new House();
        house.setId(0);
        house.setName("1");
        house.setPhone("1");
        house.setAddress("1");
        house.setRent(0);
        house.setState("1");

        System.out.println(house);
    }
}