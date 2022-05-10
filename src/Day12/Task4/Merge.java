package Day12.Task4;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Merge {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("OneRepublic", 2002, new ArrayList<>());
        MusicBand band2 = new MusicBand("Imagine Dragons", 1996, new ArrayList<>());

        band1.getParticipant().add("Первый участник группы OneRepublic");
        band1.getParticipant().add("Второй участник группы OneRepublic");
        band1.getParticipant().add("Третий участник группы OneRepublic");
        band2.getParticipant().add("Первый участник группы Imagine Dragons");
        band2.getParticipant().add("Второй участник группы Imagine Dragons");
        band2.getParticipant().add("Третий участник группы Imagine Dragons");

        transferMembers(band1, band2);
        System.out.println(printMembers(band1));
        System.out.println(printMembers(band2));

    }
    public static List<String> transferMembers (MusicBand band1, MusicBand band2) {
        band2.getParticipant().addAll(band1.getParticipant());
        return band2.getParticipant();
    }
    public static List<String> printMembers (MusicBand group) {
        return group.getParticipant();
    }
}