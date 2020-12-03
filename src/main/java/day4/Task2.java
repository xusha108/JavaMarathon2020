//2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Затем, используя циклы for each вывести:
//наибольший элемент массива
//наименьший элемент массива
//количество элементов массива, оканчивающихся на 0
//сумму элементов массива, оканчивающихся на 0
//
//Использовать сортировку запрещено.


package day4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);

        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Наименьший элемент массива: " + min);

        int count = 0;
        for (int num : numbers) {
            int last = num % 10;
            if (last == 0) {
                count++;
            }
        }
        System.out.println("количество элементов массива, оканчивающихся на 0: " + count);

        int sum = 0;
        for (int num : numbers) {
            int last = num % 10;

            if (last == 0) {
                sum = sum + num;
            }

        }
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + sum);

        scanner.close();
    }
}




