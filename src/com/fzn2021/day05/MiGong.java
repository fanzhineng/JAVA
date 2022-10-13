package com.fzn2021.day05;

/**
 * @program: JavaSE
 * 描述：      迷宫问题
 * @author: fzn
 * @create: 2021-12-11 17:47
 **/
public class MiGong {
    public static void main(String[] args) {
        //思路
        //1. 先创建迷宫，用二维数组表示int[][] map = new int[8][7];
        //2. 先规定map 数组的元素值: 0 表示可以走1 表示障碍物
        int[][] map = new int[8][7];
        //3. 将最上面的一行和最下面的一行，全部设置为1
        for(int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //4.将最右面的一列和最左面的一列，全部设置为1
        for(int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        //测试回溯
        // map[2][2] = 1;


        //输出当前的地图
        System.out.println("=====当前地图情况======");
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");//输出一行
            }
            System.out.println();
        }
        //使用findWay 给老鼠找路
        M m = new M();
        //下右上左
        m.findWay(map, 1, 1);

        System.out.println("\n====找路的情况如下=====");
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");//输出一行
            }
            System.out.println();
        }
    }
}

class M {
    // 使用递归回溯的思想来解决老鼠出迷宫
    // 如果找到，就返回true ,否则返回false
    // map就是二维数组
    // i,j 就是老鼠的位置，初始化的位置为(1,1)
    // 0 表示可以走1 表示障碍物2 表示可以走3 表示走过，但是走不通是死路
    // 当map[6][5] =2 就说明找到通路,就可以结束，否则就继续找.
    // 先确定老鼠找路策略下->右->上->左
    public boolean findWay(int[][] map,int i, int j){
        if(map[6][5] == 2) {//说明已经找到
            return true;
        } else {

            // 当前这个位置0,说明表示可以走
            if (map[i][j]==0){
                // 假设我们可以走通
                map[i][j] = 2;
                if (findWay(map,i+1,j)){
                    // 下
                    return true;
                }else if (findWay(map,i,j+1)) {
                    // 右
                    return true;
                }else if (findWay(map,i-1,j)) {
                    // 上
                    return true;
                }else if (findWay(map,i,j-1)) {
                    // 左
                    return true;
                }else {
                    // 死路 不通
                    map[i][j] = 3;
                    return false;
                }
            }else { //map[i][j] = 1 , 2, 3
                return false;
            }

        }
    }
}