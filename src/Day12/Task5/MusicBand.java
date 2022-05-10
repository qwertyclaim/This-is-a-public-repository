package Day12.Task5;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<Participant> participantList;

    public List<Participant> getParticipantList() {
        return participantList;
    }

    public MusicBand(String name, int year, List<Participant> participantList) {
        this.name = name;
        this.year = year;
        this.participantList = participantList;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", participant=" + participantList +
                '}';
    }
}