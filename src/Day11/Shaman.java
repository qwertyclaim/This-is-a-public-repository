package Day11;
class Shaman extends Hero implements interMagicAtt, interHealer {
    private int magicAtt;
    private int healHisOwn;
    private int healTeam;

    public Shaman() {
        health = MAXHEALTH;
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;
        healHisOwn = 50;
        healTeam = 30;
    }

    @Override
    public void healHimself() {
        if (health+healHisOwn>MAXHEALTH) {
            health = MAXHEALTH;
        } else {
            health += healHisOwn;
        }
    }

    @Override
    public void healTeammate(Hero player) {
        if (player.health+healTeam>MAXHEALTH) {
            player.health = MAXHEALTH;
        } else {
            player.health += healTeam;
        }
    }

    @Override
    public void magicAtt(Hero player) {
        double attackSum = magicAtt-(1-player.magicDef);
        if (player.health+attackSum<MINHEALTH) {
            player.health = MINHEALTH;
        } else {
            player.health -= attackSum;
        }
    }
}