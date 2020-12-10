package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {
    private int healHimself;
    private int healTeammate;
    private int magicAtt;

    public Shaman() {
        super();
        super.setPhysDef(0.2);
        super.setMagicDef(0.2);
        this.healHimself = 50;
        this.healTeammate = 30;
        this.magicAtt = 15;
    }


    @Override
    public void healHimself() {
        setHealth(getHealth() + healHimself);
    }

    @Override
    public void healTeammate(Hero hero) {
        double max = hero.getHealth() + healTeammate;
        if ( max > 100) {
            hero.setHealth(100) ;
        } else{
            hero.setHealth(max);
        }

    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (10 - 10 * hero.getPhysDef()));

    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef()));
    }
}
