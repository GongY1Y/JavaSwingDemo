package component;

import util.Constant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// 导航栏
public class Navigation extends JPanel {

    // 把里面的按钮设置成一个全局变量，随时返回给上级，便于给按钮设置实际功能，因为仅仅是这个类里的变量可能不够实现某个完整的功能
    private NavButton[] buttons;

    // 初始化，因为按钮初始化的代码很短，就直接放里面了，如果里面组件很多，建议单独弄几个
    public Navigation(){

        // 设置大小、背景色和布局，位置可以让上级来调
        setBounds(Constant.NAV_X, Constant.NAV_Y, Constant.NAV_W, Constant.NAV_H);
        setBackground(Constant.NAV_BG);
        setLayout(null);

        // 按钮初始化，别忘了把按钮加到这个panel里面
        buttons = new NavButton[3];
        String[] texts = {"出题", "打分", "排名"};
        for(int i = 0; i < buttons.length; i ++){
            buttons[i] = new NavButton(50 + 110 * i, 10, texts[i]);
            add(buttons[i]);
        }
    }

    // 当我们在给button赋予业务功能时，可能需要传给上级来调用
    public NavButton[] getButtons() {
        return buttons;
    }

    // 设置成私有内部类，防止别的类调用它。如果课设中用到的按钮比较多，可以建个XButton类，设置一些公共的配置，同时多建几个构造方法，便于调用
    private static class NavButton extends JButton {

        // x和y是横纵坐标，text是按钮上的字，由上级在new这个对象时传递
        private NavButton(int x, int y, String text) {

            // 设置位置、大小、文本、字体颜色、背景色、边界
            setBounds(x, y, 70, 40);
            setText(text);
            setColor(Constant.NAV_FG, Constant.NAV_BG);
            setFont(Constant.NAV_FONT);
            setBorder(null);

            // 添加鼠标监听器，当鼠标移入或移出按钮时，改变样式
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    setColor(Constant.NAV_FG_ENTER, Constant.NAV_BG_ENTER);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    setColor(Constant.NAV_FG, Constant.NAV_BG);
                }
            });

            // 当鼠标移入时，鼠标变成小手，如果要设置公共按钮父类的话，建议把这个放进去
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }

        // 同时设置字体颜色和背景色，实际上只有两行，没有必要一定封装起来，看个人习惯
        private void setColor(Color fore, Color back) {
            setForeground(fore);
            setBackground(back);
        }
    }
}
