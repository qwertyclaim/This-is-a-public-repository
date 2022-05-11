/* Из изменений в этом файле: теперь метод "transferMembers" ничего не возвращает в место вызова и очищает список
той группы, участники которой перешли в другую группу. Метод "printMembers" теперь также ничего не возвращает, а просто
печатает список участников каждоый группы */
package Day12.Task4;
import java.util.ArrayList;
import java.util.List;
public class Merge {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("OneRepublic", 2002, new ArrayList<>());
        MusicBand band2 = new MusicBand("Imagine Dragons", 1996, new ArrayList<>());

        band1.getParticipants().add("Первый участник группы OneRepublic");
        band1.getParticipants().add("Второй участник группы OneRepublic");
        band1.getParticipants().add("Третий участник группы OneRepublic");
        band2.getParticipants().add("Первый участник группы Imagine Dragons");
        band2.getParticipants().add("Второй участник группы Imagine Dragons");
        band2.getParticipants().add("Третий участник группы Imagine Dragons");

        transferMembers(band1, band2);
        printMembers(band1);
        printMembers(band2);

    }
    public static void transferMembers (MusicBand band1, MusicBand band2) {
        band2.getParticipants().addAll(band1.getParticipants());
        band1.getParticipants().clear();
    }
    public static void printMembers (MusicBand group) {
        System.out.println(group.getParticipants());
    }
}