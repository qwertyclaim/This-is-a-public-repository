package Day12.Task4;
import java.util.List;
public class MusicBand {
    private String name;
    private int year;
    private List<String> participants;

    public List<String> getParticipants() {
        return participants;
    }

    public MusicBand(String name, int year, List<String> participant) {
        this.name = name;
        this.year = year;
        this.participants = participant;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", participant=" + participants +
                '}';
    }
}