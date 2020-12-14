//Создать .text.txt файл в папке проекта, как показано в видео (урок 36, время 15:30). Заполнить его вручную десятью
//произвольными числами. Реализовать статический метод printSumDigits(File file), который считает сумму
//всех чисел в этом файле и выводит ее на экран. Вызвать данный метод в методе main().
//Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в
//консоль сообщение “Файл не найден”. Помимо этого, если чисел в файле меньше или больше 10, необходимо
//выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.

package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\comp\\Desktop\\JS\\Java\\JavaMarathon2020\\src\\main\\java\\day14\\text.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] strNums = line.split(" ");
            List<Integer> nums = new ArrayList<>();

            for (int i = 0; i < strNums.length; i++) {
                nums.add(Integer.parseInt(strNums[i]));
            }

            if (nums.size() != 10) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                }
            }

            int sum = 0;
            for (int i = 0; i < nums.size(); i++) {
                sum += nums.get(i);
            }
            System.out.println(nums);
            System.out.println(sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
