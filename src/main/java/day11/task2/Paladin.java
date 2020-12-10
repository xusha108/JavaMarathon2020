package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private double healHimself;
    private double healTeammate;

    public Paladin() {
        super();
        super.setPhysDef(0.5);
        super.setMagicDef(0.2);
        this.healHimself = 25;
        this.healTeammate = 10;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double min = (hero.getHealth() - 15);
        if (min >= 0) {
            hero.setHealth(min);
        } else {
            hero.setHealth(0);
        }
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + healHimself);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + healTeammate);
    }
}
