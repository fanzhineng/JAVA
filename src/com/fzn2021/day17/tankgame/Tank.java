package com.fzn2021.day17.tankgame;

/**
 * @program: JavaSE
 * 描述：坦克基类
 * @author: fzn
 * @create: 2022-01-14 17:09
 **/
public class Tank {
    private int x;
    private int y;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}