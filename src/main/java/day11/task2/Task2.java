package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        paladin.toString();

        paladin.physicalAttack(magician);
        magician.toString();

        shaman.healTeammate(magician);
        magician.toString();

        magician.magicalAttack(paladin);
        paladin.toString();

        shaman.physicalAttack(warrior);
        warrior.toString();

        paladin.healHimself();
        paladin.toString();

        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            magician.toString();
        }


    }
}
