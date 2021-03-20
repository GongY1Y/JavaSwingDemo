package component;

import util.Constant;

import javax.swing.*;

// 这是一个抽象面板类，继承它的子类与它拥有相同的位置和大小，最重要的是便于“多态”的使用
public abstract class WorkPanel extends JPanel {

    // 把通用的属性先设置一下
    WorkPanel(){

        // 设置位置、大小、背景色、布局
        setBounds(Constant.WORK_X, Constant.WORK_Y, Constant.WORK_W, Constant.WORK_H);
        setBackground(Constant.WORK_BG);
        setLayout(null);
        launch();
    }

    public abstract void launch();
}
