package Day7;
class Player {
    private int stamina;
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    public static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers<6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }
    public static int getCountPlayers() {
        return countPlayers;
    }
    public int run (int stamina) {
        while (stamina>0) {
            stamina--;
        }
        if (stamina==MIN_STAMINA) {
            countPlayers--;
            System.out.println("Игрок уходит с поля");
        }
        return stamina;
    }
    public void info () {
        if (countPlayers<6) {
            System.out.println("Команды не полные! На поле всего "+countPlayers+" игроков.");
        } else {
            System.out.println("На поле нет свободных мест!");
        }
    }
}
