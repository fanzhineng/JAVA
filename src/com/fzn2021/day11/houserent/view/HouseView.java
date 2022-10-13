package com.fzn2021.day11.houserent.view;

import com.fzn.day11.houserent.doman.House;
import com.fzn.day11.houserent.service.HouseService;
import com.fzn.day11.houserent.utils.Utility;


/**
 * @program: JavaSE
 * 描述：      主菜单
 *  1.显示界面
 *  2.接收用户的输入
 *  3.调用HouseService完成对房屋信息的各种操作
 * @author: fzn
 * @create: 2021-12-22 19:08
 **/
public class HouseView {
    // 控制显示菜单
    private boolean loop = true;

    private final HouseService houseService = new HouseService(2);

    /**
     * 修改房屋信息
     */
    public void update(){
        System.out.println("------------修改房屋信息-------------");
        System.out.print("请选择待修改房屋编号（-1表示退出）");
        int updateId = Utility.readInt();
        if (updateId == -1){
            System.out.println("------------你放弃修改房屋信息-------------");
            return;
        }
        // 根据输入的id查找对象
        House house = houseService.findByid(updateId);
        if (house ==null){
            System.out.println("------------查找房屋信息编号不存在-------------");
            return;
        }
        System.out.print("姓名("+house.getName()+")：");
        // 如果用户直接回车表示不修改信息 默认""
        String name = Utility.readString(8, "");
        if (!"".equals(name)){
            house.setName(name);
        }
        System.out.print("电话("+house.getPhone()+")：");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)){
            house.setPhone(phone);
        }
        System.out.print("地址("+house.getAddress()+")：");
        String address = Utility.readString(18, "");
        if (!"".equals(address)){
            house.setAddress(address);
        }
        System.out.print("租金("+house.getRent()+")：");
        int rent = Utility.readInt(-1);
        if (rent != -1){
            house.setRent(rent);
        }
        System.out.print("状态("+house.getState()+")：");
        String state = Utility.readString(3, "");
        if (!"".equals(state)){
            house.setState(state);
        }
        System.out.println("------------修改房屋信息成功-------------");
    }


    /**
     * 查找功能
     * 根据id查找
     */
    public void search(){
        System.out.println("------------查找房屋信息-------------");
        System.out.print("请输入要查找的id：");
        int findId = Utility.readInt();
        House house = houseService.findByid(findId);
        if (house!=null){
            System.out.println(house);
        }else {
            System.out.println("------------查找房屋信息编号不存在-------------");
        }
    }
    /**
     * 退出
     */
    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }

    /**
     * 编写delHouse() 接收输入的id 调用service的del方法
     */
    public void delHouse(){
        System.out.println("------------删 除 房 屋-------------");
        System.out.print("请输入待删除房屋的编号（-1退出）：");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("------------放弃删除房屋信息-------------");
            return;
        }
        // 调用方法 必须输入 Y/N
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){
            if (houseService.del(delId)) {
                System.out.println("------------删除房屋信息成功-------------");
            }else {
                System.out.println("------------删除房屋信息不存在-------------");
            }
        }else {
            System.out.println("------------放弃删除房屋信息-------------");
        }

    }

    /**
     * 编写addHouse()方法 接收输入 创建House对象 调用add方法
     */
    public void addHouse(){
        System.out.println("------------添 加 房 屋-------------");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        // 创建一个新的对象 id自动增长 系统分配
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("------------添加房屋成功-------------");
        }else {
            System.out.println("------------添加房屋失败-------------");
        }
    }


    /**
     * 编写listHouse() 显示房屋列表
     */
    public void listHouse(){
        System.out.println("------------房 屋 列 表-------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状 态（未出租/已出租）");
        // 得到所有房屋信息
        House[] houses = houseService.list();
        for (House house : houses) {
            if (house==null){
                break;
            }
            System.out.println(house);
        }
        System.out.println("----------房屋列表显示完毕------------");
    }


    /**
     * 主体菜单
     */
    public void mainMenu(){
        do {
            System.out.println("\n------------房屋出租系统-------------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退 出");
            System.out.print("请输入你的选择（1-6）：");
            // 接收用户输入
            char key = Utility.readChar();
            switch (key){
                case '1':
                    this.addHouse();
                    break;
                case '2':
                    this.search();
                    break;
                case '3':
                    this.delHouse();
                    break;
                case '4':
                    this.update();
                    break;
                case '5':
                    this.listHouse();
                    break;
                case '6':
                    this.exit();
                    break;
                default:
                    System.out.println("你的输入有误 请重新选择");
            }
        }while (loop);
    }
}