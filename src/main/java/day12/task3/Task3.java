//Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
//Создать 10 или более экземпляров класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
//которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать список. Создать статический
//метод в классе Task3:
//public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
//Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп, основанных
//после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из
//10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).


package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> bands = new ArrayList<>();

        bands.add(new MusicBand("RHCP", 1999));
        bands.add(new MusicBand("Gorillaz", 2000));
        bands.add(new MusicBand("Cranberries", 1988));
        bands.add(new MusicBand("U2", 2002));
        bands.add(new MusicBand("Linlin Park", 1998));
        bands.add(new MusicBand("Thr Offspring", 2001));
        bands.add(new MusicBand("Modjo", 2003));
        bands.add(new MusicBand("Coldplay", 2005));
        bands.add(new MusicBand("Limp Bizkit", 2000));
        bands.add(new MusicBand("Blink 182", 1999));
        System.out.println(bands);
        List<MusicBand> bandsAfter2000 = groupsAfter2000(bands);
        System.out.println(bandsAfter2000);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }
}
