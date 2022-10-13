package com.fzn2021.day17.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2022-01-14 17:10
 **/
public class MyPanel extends JPanel {
    // 定义我的坦克
    Hero hero = null;

    public MyPanel() {
        hero = new Hero(100,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);
    }
}