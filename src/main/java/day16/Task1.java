//1. Реализовать программу, которая на вход принимает txt файл с целыми числами (можно использовать файл
// из задания 1 дня 14) и в качестве ответа выводит в консоль среднее арифметическое этих чисел.
//Ответ будет являться вещественным числом. В консоль необходимо вывести полную запись вещественного числа
// (со всеми знаками после запятой) и сокращенную запись (с 3 знаками после запятой).
//
//Детали реализации: В классе Task1 создать публичный статический метод printResult(File file), в котором
// реализовать вышеописанную логику. В методе main() класса Task1 вызвать метод printResult(File file),
// передав ему в качестве аргумента объект класса File (txt файл с целыми числами).
//
//Пример:
//Числа в txt файле: 5 2 8 34 1 36 77
//Ответ: 23.285714285714285 --> 23,286

package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\comp\\Desktop\\JS\\Java\\JavaMarathon2020\\src\\main\\java\\day14\\text.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        double average = 0;
        double roundOff = 0;
        try {
            List<Integer> nums = new ArrayList<>();
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] strNums = line.split(" ");
            for (int i = 0; i < strNums.length; i++) {
                nums.add(Integer.parseInt(strNums[i]));
            }
            System.out.println(nums.toString());
            double sum = 0;

            for (int i = 0; i < nums.size(); i++) {
                sum += nums.get(i);
            }
            average = sum / nums.size();
            roundOff = Math.round(average*1000)/1000.00;

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println(average);
        System.out.println(roundOff);

    }
}


