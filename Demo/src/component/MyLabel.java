package component;

import util.Constant;

import javax.swing.*;

// 本类实际业务上没啥用，我只是想让它来标识不同的面板，偷懒中。。。
class MyLabel extends JLabel {
    MyLabel(String text){
        setBounds(Constant.LABEL_X, Constant.LABEL_Y, Constant.LABEL_W, Constant.LABEL_H);
        setFont(Constant.LABEL_FONT);
        setText(text);
    }
}
