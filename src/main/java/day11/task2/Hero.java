package day11.task2;

public abstract class Hero {
    private double health = 100;
    private double physAtt;
    private double physDef;
    private double magicDef;

    public void setHealth(double health) {
        this.health = health;
    }

    public void setPhysAtt(double physAtt) {
        this.physAtt = physAtt;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public double getHealth() {
        return health;
    }

    public double getPhysAtt(Hero paladin) {
        return physAtt;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }
    public abstract void physicalAttack(Hero hero);

    @Override
    public String toString() {
        System.out.println(getClass()+" Здоровье " + health );
        return "Здоровье " + health;
    }
}
