package com.fzn2021.day11.houserent;

import com.fzn2021.day11.houserent.view.HouseView;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2021-12-22 18:51
 **/
public class HouseRentApp {
    public static void main(String[] args) {
        // 创建HouseView 对象 创建视图
        new HouseView().mainMenu();
        System.out.println("你退出了房屋出租系统");
    }
}