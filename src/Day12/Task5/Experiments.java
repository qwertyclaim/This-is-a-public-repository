package Day12.Task5;
import java.util.ArrayList;
import java.util.List;
public class Experiments {
    public static void main(String[] args) {
        Participant memberBandNirvana1 = new Participant("Джон", 22);
        Participant memberBandNirvana2 = new Participant("Виктор", 24);
        Participant memberBandNirvana3 = new Participant("Петя", 26);
        Participant member1 = new Participant("Федя", 20);
        Participant member2 = new Participant("Рома", 21);
        Participant member3 = new Participant("Маша", 23);
        MusicBand band1 = new MusicBand("Нирвана", 2016, new ArrayList<>());
        MusicBand band2 = new MusicBand("Битлс", 2015, new ArrayList<>());
        band1.getParticipantList().add(memberBandNirvana1);
        band1.getParticipantList().add(memberBandNirvana2);
        band1.getParticipantList().add(memberBandNirvana3);
        band2.getParticipantList().add(member1);
        band2.getParticipantList().add(member2);
        band2.getParticipantList().add(member3);

        System.out.println(band1);
        System.out.println(band2);

        groupsList(band1, band2);

        System.out.println(band1);
        System.out.println(band2);
    }
    public static void groupsList (MusicBand band1, MusicBand band2) {
        band2.getParticipantList().addAll(band1.getParticipantList());
    }
}