package Day12.Task4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MusicBand {
    private String name;
    private int year;
    private List<String> participant;

    public List<String> getParticipant() {
        return participant;
    }

    public MusicBand(String name, int year, List<String> participant) {
        this.name = name;
        this.year = year;
        this.participant = participant;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", participant=" + participant +
                '}';
    }
}