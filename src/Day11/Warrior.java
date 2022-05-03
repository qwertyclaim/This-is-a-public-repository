package Day11;
class Warrior extends Hero {
    public Warrior() {
        health = MAXHEALTH;
        physAtt = 30;
        physDef = 0.8;
    }
    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}