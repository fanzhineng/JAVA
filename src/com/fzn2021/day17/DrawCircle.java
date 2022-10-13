package com.fzn2021.day17;

import javax.swing.*;
import java.awt.*;

/**
 * @program: JavaSE
 * 描述：
 * @author: fzn
 * @create: 2022-01-14 16:37
 **/
public class DrawCircle extends JFrame{

    // 定义一个面板
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle(){
        // 初始化面板
        mp = new MyPanel();
        this.add(mp);
        // 设置仓库大小
        this.setSize(400,300);
        // 点击窗口的时候程序退出
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // 可以显示
        this.setVisible(true);

    }
}

// 先定义一个画板 继承JPanel 画图形 就在面板上面
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        // 绘图方法
        // 调用父类的方法 完成初始化
        super.paint(g);

        // 画一个圆形
        g.drawOval(10,10, 100,100);

    }
}