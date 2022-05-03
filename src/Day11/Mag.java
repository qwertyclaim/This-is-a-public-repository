package Day11;
class Mag extends Hero implements interMagicAtt {
    private int magicAtt;

    public Mag() {
        health = MAXHEALTH;
        physAtt = 5;
        magicDef = 0.8;
        magicAtt = 20;
    }

    @Override
    public void magicAtt(Hero player) {
        double attackSum = magicAtt*(1-player.magicDef);
        if (player.health+attackSum<MINHEALTH) {
            player.health = MINHEALTH;
        } else {
            player.health -= attackSum;
        }
    }

    @Override
    public String toString() {
        return "Mag{" +
                "health=" + health +
                '}';
    }
}