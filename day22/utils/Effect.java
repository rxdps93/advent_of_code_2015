package day22.utils;

public abstract class Effect {

    protected final Entity target;
    protected int timer;

    public Effect(Entity target, int timer) {
        this.target = target;
        this.timer = timer;
    }

    public abstract void onTick();
    public abstract void onEnd();
}
