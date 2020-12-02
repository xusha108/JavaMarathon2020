//2.Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и делитель.
//Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль. Программа
//останавливает свою работу тогда, когда пользователь вводит 0 в качестве делителя.
//(для этих вещественных чисел необходимо использовать тип double и метод nextDouble() у Scanner’а соответственно).


package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y = 1;

        while (y != 0) {
            double x = scanner.nextDouble();
            y = scanner.nextDouble();
            if( y == 0) {
                break;
            }
            System.out.println( x / y);
            continue;
        }
    }
}
