package day22.utils;

import day21.utils.Inventory;

public class Entity {
    private final int baseHP;
    private int currentHP;

    private final int baseATK;
    private int bonusATK = 0;

    private final int baseDEF;
    private int bonusDEF = 0;

    private int mana = 500;

    public Entity(int hp, int atk, int def) {
        this.baseHP = hp;
        this.baseATK = atk;
        this.baseDEF = def;
    }

    public void setBonusATK(int bonus) {
        this.bonusATK = bonus;
    }

    public void setBonusDEF(int bonus) {
        this.bonusDEF = bonus;
    }

    public int getATK() {
        return this.baseATK + this.bonusATK;
    }

    public int getDEF() {
        return this.baseDEF + this.bonusDEF;
    }

    public int getMana() {
        return this.mana;
    }

    public void changeManaBy(int m) {
        this.mana += m;
    }

    public int getHP() {
        return this.currentHP;
    }

    public void changeHitpointsBy(int hp) {
        this.currentHP += hp;
    }
}
