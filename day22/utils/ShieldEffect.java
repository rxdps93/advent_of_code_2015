package day22.utils;

public class ShieldEffect extends Effect {
    public ShieldEffect(Entity target) {
        super(target, 6);

        super.target.setBonusDEF(7);
    }

    @Override
    public void onTick() {
        super.timer--;
    }

    @Override
    public void onEnd() {
        super.target.setBonusDEF(0);
    }

}
