package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt((Player.MAX_STAMINA - 90) + 1) + 90;
        Player p1 = new Player(randomNum);
        Player p2 = new Player(randomNum);
        Player p3 = new Player(randomNum);
        Player p4 = new Player(randomNum);
        Player p5 = new Player(randomNum);
        Player p6 = new Player(randomNum);
        p1.run();
        p1.run();
        p1.run();
        p2.run();
        p1.info();
    }
}
