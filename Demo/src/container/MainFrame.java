package container;

import util.Constant;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame {

    // 初始化 Frame
    public MainFrame(){

        // 设置标题、位置、宽高
        setTitle(Constant.FRAME_TITLE);
        setBounds(Constant.FRAME_X, Constant.FRAME_Y, Constant.FRAME_W, Constant.FRAME_H);
        setVisible(true);

        // 退出验证
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null,
                        "是否要退出" + Constant.FRAME_TITLE + "?", "退出", JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE) == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        });

        // 加载内部面板
        add(new MainPanel());

        repaint();
    }
}
