package component;

public class SetQuestion extends WorkPanel {
    @Override
    public void launch() {
        add(new MyLabel("我是出题"));
    }
}
