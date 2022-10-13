package com.fzn2021.day17.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2022-01-14 17:12
 **/
public class TankGame extends JFrame {

    // 定义MyPanel
    MyPanel mp = null;


    public static void main(String[] args) {
        new TankGame();
    }

    public TankGame() throws HeadlessException {
        mp = new MyPanel();
        // 面板加入
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}