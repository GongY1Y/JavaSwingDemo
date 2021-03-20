package component;

import util.Constant;

public class Score extends WorkPanel {
    @Override
    public void launch() {
        setLocation(200, Constant.WORK_Y);
        add(new MyLabel("我是打分"));
    }
}
