package com.fzn2021.day11.houserent.service;

import com.fzn.day11.houserent.doman.House;

/**
 * @program: JavaSE
 * 描述：  业务类
 * @author: fzn
 * @create: 2021-12-22 19:27
 **/
public class HouseService {

    // 房屋信息
    private House[] houses;
    // 记录当前有多少个房屋信息
    private int houseNums = 1;
    private int idCounter = 1;


    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1,"jack","112","海淀区",2000,"未出租");
    }

    /**
     * 根据id查找房屋信息
     * @param findId
     * @return
     */
    public House findByid(int findId){
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }

    /**
     * del方法 删除一个房屋信息
     * @param delId
     * @return
     */
    public boolean del(int delId) {
        // 应当先找到要删除的房屋信息对应的下标
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            // 要删除的房屋是数组下标为i的元素
            if (delId == houses[i].getId()){
                // 记录下来
                index = i;
            }
        }
        if (index == -1){
            // 说明在数组中不存在
            return false;
        }
        // 如果找到 那么删除
        for (int i = index; i < houseNums -1; i++) {
            houses[i] = houses[i+1];
        }
        // 把当前存在的房屋的最后一个设置为null
        houses[--houseNums] =null;

        return true;
    }
    /**
     * 添加
     * @param newHouse
     * @return
     */
    public boolean add(House newHouse){
        // 判断是否还可以继续添加
        if (houseNums == houses.length){
            System.out.println("数组已满，不能在添加了");
            return false;
        }
        // id自动生成 自增长
        newHouse.setId(++idCounter);
        // 把新的对象放到最后 再加加
        houses[houseNums++] = newHouse;
        return true;
    }

    public House[] list(){
        return houses;
    }


}