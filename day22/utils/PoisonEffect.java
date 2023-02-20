package day22.utils;

public class PoisonEffect extends Effect {
    public PoisonEffect(Entity target) {
        super(target, 6);
    }

    @Override
    public void onTick() {
        super.target.changeHitpointsBy(-3);
        super.timer--;
    }

    @Override
    public void onEnd() {
        // nothing interesting happens
    }
}
