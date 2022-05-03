package Day11;
abstract class Hero implements interPhysAtt {
    static final int MAXHEALTH = 100;
    static final int MINHEALTH = 0;
    int health;
    int physAtt;
    double physDef;
    double magicDef;

    public void physicalAtt (Hero player) {
        double attackSum = physAtt*(1 - player.physDef);
        if (player.health-attackSum<MINHEALTH) {
            player.health = MINHEALTH;
        } else {
            player.health -= attackSum;
        }
    }
}