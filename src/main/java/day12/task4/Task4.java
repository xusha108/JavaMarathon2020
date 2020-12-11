//Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было
//добавлять и удалять участников. Под участником понимается строка (String) с именем и фамилией.
//Реализовать статический метод слияния групп (в классе MusicBand), т.е. все участники группы А
//переходят в группу B. Название метода: transferMembers. Этот метод принимает в качестве аргументов
//два экземпляра класса MusicBand. В классе MusicBand, реализовать метод printMembers(), печатающий
//список участников в консоль и метод getMembers(), возвращающий список участников.
//Проверить состав групп после слияния.

package day12.task4;

import java.util.ArrayList;
import java.util.List;


public class Task4 {
    public static void main(String[] args) {

        List<String> memberList1 = new ArrayList<>();
        List<String> memberList2 = new ArrayList<>();

        memberList1.add(new String("Anthony Kiedis"));
        memberList1.add(new String("Chad Smith"));
        memberList1.add(new String("John Frusciante"));

        memberList2.add(new String("Noodle"));
        memberList2.add(new String("Murdoc Niccals"));

        MusicBand band1 = new MusicBand("RHCP", 1999, memberList1);
        MusicBand band2 = new MusicBand("Gorillaz", 2000, memberList2);

        MusicBand.transferMembers(band1, band2);

        System.out.println(band1);
        System.out.println(band2);
    }
}
