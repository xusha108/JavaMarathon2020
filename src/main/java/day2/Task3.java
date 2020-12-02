
package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        int a = consoleScanner.nextInt();
        int b = consoleScanner.nextInt();
        int i = a + 1;

        while (i > a && i < b) {
            if (i % 5 == 0 && i % 10 != 0)
                System.out.print(i + " ");

            i++;
        }
        if (a >= b) {
            System.out.print("Некорректный ввод");
        }
    }
}
