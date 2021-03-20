package container;

import component.*;
import util.Constant;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// 主面板，因为个人在JFrame中直接添加组件时，遇到过bug，所以个人习惯在窗口添加组件时，中间隔一层面板
class MainPanel extends JPanel {

    private WorkPanel[] workPanels;
    private int currentPanelIndex = 0;

    // 初始化主面板
    MainPanel() {

        // 设置大小、宽高、背景色、布局
        setBounds(0, 0, Constant.FRAME_W, Constant.FRAME_H);
        setBackground(Constant.BG);
        setLayout(null);

        // 载入里面的内容，如果方法里面比较短，我们直接写这个构造方法里就行
        launch();
    }

    // 初始化并添加内部组件
    private void launch() {

        // 初始化导航栏
        Navigation navigation = new Navigation();
        add(navigation);

        // 获取导航栏中的三个按钮
        JButton[] buttons = navigation.getButtons();

        // 初始化业务视图
        workPanels = new WorkPanel[3];
        workPanels[0] = new SetQuestion();
        workPanels[1] = new Score();
        workPanels[2] = new Rank();

        // 对三个button和三个panel进行遍历
        for(int i = 0; i < 3; i ++){

            // 设置为不可见
            workPanels[i].setVisible(false);
            add(workPanels[i]);

            // 给按钮添加点击事件，在这种匿名内部类里貌似不能直接用i
            int finalI = i;
            buttons[i].addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {

                    // 把当前的隐藏了，把要显示的给显示了
                     workPanels[currentPanelIndex].setVisible(false);
                     workPanels[finalI].setVisible(true);
                     currentPanelIndex = finalI;
//                     repaint();
                }
            });
        }
    }
}
