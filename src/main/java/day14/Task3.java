//Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический метод
//List<Person> parseFileToObjList(), который считывает содержимое того же файла people.txt,
//создает экземпляры класса “Человек” и возвращает список объектов. Получить данный список в методе main()
//и распечатать его в консоль.
//В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение
//и выводить в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно,
//необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
//
//
//Пример ответа: [{name='Mike', year=24}, {name='John', year=19}, {name='Anna', year=20}, {name='Miguel', year=5}]


package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\comp\\Desktop\\JS\\Java\\JavaMarathon2020\\src\\main\\java\\day14\\people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {

                String currentLine = "";
                currentLine = scanner.nextLine();
                String[] strNums = currentLine.split(" ");
                int age = Integer.parseInt(strNums[1]);

                if (age < 1) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                    }
                }
                people.add(new Person(strNums[0], age));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return people;
    }
}

