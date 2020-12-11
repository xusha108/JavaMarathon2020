package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
      band2.getMembers().addAll(band1.getMembers());
      band1.getMembers().removeAll(band1.getMembers());
    }

    public void printMembers(List<String> members) {
        System.out.println(members);
    }

    public List<String> getMembers() {
        return members;
    }
}
