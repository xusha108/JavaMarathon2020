//Создать в папке проекта файл people.txt в котором хранятся имена и возраст людей. Реализовать статический метод
//List<String> parseFileToStringList(), который считывает содержимое этого файла и возвращает список, состоящий
// из значений имен и возрастов каждого человека. Получить данный список в методе main() и распечатать его в консоль.
//В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в
// консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно, необходимо выбрасывать
// исключение и выводить в консоль сообщение “Некорректный входной файл”.
//
//Пример ответа: [Mike 24, John 19, Anna 20, Miguel 5]
//
//


package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\comp\\Desktop\\JS\\Java\\JavaMarathon2020\\src\\main\\java\\day14\\people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                String[] strNums = currentLine.split(" ");
                int num = Integer.parseInt(strNums[1]);

                if (num < 1) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                    }
                }
                people.add(currentLine);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return people;
    }
}
