//Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя,
//но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
//Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом,
//чтобы участники были - объекты класса MusicArtist. После этого, надо сделать то же самое, что и требовалось
//в 4 задании - слить две группы и проверить состав групп после слияния. Методы для слияния и для вывода
//участников в консоль необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.

package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> memberList1 = new ArrayList<>();
        List<MusicArtist> memberList2 = new ArrayList<>();

        memberList1.add(new MusicArtist("Anthony Kiedis", 48));
        memberList1.add(new MusicArtist("Chad Smith", 47));
        memberList1.add(new MusicArtist("John Frusciante", 39));

        memberList2.add(new MusicArtist("Noodle", 35));
        memberList2.add(new MusicArtist("Murdoc Niccals", 46));

        MusicBand band1 = new MusicBand("RHCP", 1999, memberList1);
        MusicBand band2 = new MusicBand("Gorillaz", 2000, memberList2);

        MusicBand.transferMembers(band1, band2);

        System.out.println(band1);
        System.out.println(band2);
    }
}
