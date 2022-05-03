package Day11;
class Paladin extends Hero implements interHealer {
    private int healHisOwn = 25;
    private int healTeam = 10;

    public Paladin() {
        health = MAXHEALTH;
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    public void healHimself () {
        if (health+healHisOwn>MAXHEALTH) {
            health = MAXHEALTH;
        } else {
            health += healHisOwn;
        }
    }
    public void healTeammate (Hero player) {
        if (player.health+healTeam>MAXHEALTH) {
            player.health = MAXHEALTH;
        } else {
            player.health += healTeam;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}