package day7;

public class Player {
    int stamina;
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {
        if (stamina > 0) {
            stamina--;
        }
        if (stamina == MIN_STAMINA && countPlayers > 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}
