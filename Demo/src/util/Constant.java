package util;

import java.awt.*;

// 设置一些常量，有些常量需要在多个地方使用，这样如果后期需要改某些量比如窗口宽度的时候，我们只要改这个类就行了
public class Constant {

    // 窗口信息
    public static String FRAME_TITLE = "Demo";
    public static int FRAME_X = 400;
    public static int FRAME_Y = 250;
    public static int FRAME_W = 1000;
    public static int FRAME_H = 600;

    // 整体背景色
    public static Color BG = new Color(43, 49, 55);

    // 导航栏
    public static int NAV_X = 0;
    public static int NAV_Y = 0;
    public static int NAV_W = FRAME_W;
    public static int NAV_H = 60;
    public static Color NAV_FG = Color.WHITE;
    public static Color NAV_BG = new Color(36, 41, 46);
    public static Font NAV_FONT = new Font("黑体", Font.PLAIN, 30);
    public static Color NAV_FG_ENTER = Color.BLACK;
    public static Color NAV_BG_ENTER = Color.YELLOW;

    // 业务模块视图的通用属性
    public static int WORK_X = 50;
    public static int WORK_Y = 100;
    public static int WORK_W = (FRAME_W - WORK_X * 2) / 3;
    public static int WORK_H = 400;
    public static Color WORK_BG = Color.WHITE;

    // 大标签
    public static int LABEL_X = 50;
    public static int LABEL_Y = 100;
    public static int LABEL_W = WORK_W - LABEL_X * 2;
    public static int LABEL_H = 100;
    public static Font LABEL_FONT = new Font("黑体", Font.BOLD, 20);
}
