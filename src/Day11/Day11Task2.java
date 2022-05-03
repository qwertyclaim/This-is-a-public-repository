package Day11;
public class Day11Task2 {
    public static void main(String[] args) {
        Warrior war = new Warrior();
        Paladin pal = new Paladin();
        Mag mag = new Mag();
        Shaman sha = new Shaman();

        war.physicalAtt(pal);
        System.out.println(pal);

        pal.physicalAtt(mag);
        System.out.println(mag);

        sha.healTeammate(mag);
        System.out.println(mag);

        mag.magicAtt(pal);
        System.out.println(pal);

        sha.physicalAtt(war);
        System.out.println(war);

        pal.healHimself();
        System.out.println(pal);

        for (int i = 0; i<5; i++) {
            war.physicalAtt(mag);
            System.out.println(mag);
        }
    }
}