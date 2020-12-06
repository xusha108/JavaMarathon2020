package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Аэрофлот ", 2001,20000,5000);
        Airplane airplane2 = new Airplane("Boeing ", 2008,25000,6000);
        airplane1.setLength(28000);
        airplane2.setLength(25000);
        airplane1.compareAirplanes(airplane1, airplane2);
        airplane2.compareAirplanes(airplane1, airplane2);
    }
}