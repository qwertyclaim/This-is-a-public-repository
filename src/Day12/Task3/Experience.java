package Day12.Task3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Experience {
    public static void main(String[] args) {
        List<MusicBand> listBands = new ArrayList<>();
        MusicBand band1 = new MusicBand("Green Day", 1987);
        MusicBand band2 = new MusicBand("Coldplay", 1996);
        MusicBand band3 = new MusicBand("Linkin Park", 1996);
        MusicBand band4 = new MusicBand("Outkast", 1991);
        MusicBand band5 = new MusicBand("Arctic Monkeys", 2002);
        MusicBand band6 = new MusicBand("Fall Out Boy", 2001);
        MusicBand band7 = new MusicBand("Paramore", 2004);
        MusicBand band8 = new MusicBand("Of Monsters And Men", 2010);
        MusicBand band9 = new MusicBand("The Killers", 2001);
        MusicBand band10 = new MusicBand("OneRepublic", 2002);
        listBands.add(band1);
        listBands.add(band2);
        listBands.add(band3);
        listBands.add(band4);
        listBands.add(band5);
        listBands.add(band6);
        listBands.add(band7);
        listBands.add(band8);
        listBands.add(band9);
        listBands.add(band10);

        System.out.println(listBands);

        Collections.shuffle(listBands);

        System.out.println(listBands);

        System.out.println(groupsAfter2000(listBands));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> roster = new ArrayList<>();
        for (int i = 0; i<bands.size(); i++) {
            if (bands.get(i).getYear()>2000) {
                roster.add(bands.get(i));
            }
        }
        return roster;
    }
}