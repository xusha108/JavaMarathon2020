package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private int magicAtt;

    public Magician() {
        super();
        super.setPhysDef(0);
        super.setMagicDef(80);
        this.magicAtt = 20;
    }

    @Override
    public void physicalAttack(Hero hero) {

        double min = (hero.getHealth() - 5);
        if (min >= 0) {
            hero.setHealth(min);
        } else {
            hero.setHealth(0);
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef()));
    }

}
