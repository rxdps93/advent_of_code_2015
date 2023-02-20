package day22.utils;

public class RechargeEffect extends Effect {
    public RechargeEffect(Entity target) {
        super(target, 5);
    }

    @Override
    public void onTick() {
        super.target.changeManaBy(101);
        super.timer--;
    }

    @Override
    public void onEnd() {
        // nothing interesting happens
    }
}
