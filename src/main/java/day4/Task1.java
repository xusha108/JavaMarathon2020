//1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера
//        и заполнить его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль,
//        а также вывести в консоль информацию о:
//
//        а) Длине массива
//        б) Количестве чисел больше 8
//        в) Количестве чисел равных 1
//        г) Количестве четных чисел
//        д) Количестве нечетных чисел
//        е) Сумме всех элементов массива
//
//        Пример:
//        Введено число 10. Сгенерирован следующий массив:
//        [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
//
//        Информация о массиве:
//        Длина массива: 10
//        Количество чисел больше 8: 1
//        Количество чисел равных 1: 0
//        Количество четных чисел: 6
//        Количество нечетных чисел: 4
//        Сумма всех элементов массива: 46
package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите число: ");
        int x = scanner.nextInt();

        System.out.println("Введено число " + x);

        int[] numbers = new int[x];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }
        System.out.println("Сгенерирован следующий массив: " + Arrays.toString(numbers));
        System.out.println("Длина массива: " + numbers.length);

        int count8 = 0;
        int count1 = 0;
        int countEven = 0;
        int countOdd = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 8) {
                count8++;
            }
            if (numbers[i] == 1) {
                count1++;
            }
            if (numbers[i] % 2 == 0) {
                countEven++;
            }
            if (numbers[i] % 2 != 0) {
                countOdd++;
            }
            sum = sum + numbers[i];

        }
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println(("Количество чисел равных 1: " + count1));
        System.out.println("Количество чисел больше 8: " + count8);
        System.out.println("Сумма всех элементов массива: " + sum);
        scanner.close();
    }
}
