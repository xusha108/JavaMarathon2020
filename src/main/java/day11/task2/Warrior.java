package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    public Warrior() {
        super();
        super.setMagicDef(1);
        super.setPhysDef(0.8);
    }

    @Override
    public void physicalAttack(Hero hero) {
        double min = (hero.getHealth() - (30 - (30 * hero.getPhysDef())));
        if (min >= 0) {
            hero.setHealth(min);
        } else {
            hero.setHealth(0);
        }
    }
}
