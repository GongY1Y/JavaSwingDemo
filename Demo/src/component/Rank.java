package component;

import util.Constant;

public class Rank extends WorkPanel {
    @Override
    public void launch() {
        setLocation(350, Constant.WORK_Y);
        add(new MyLabel("我是排名"));
    }
}
