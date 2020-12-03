//3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12, n=8
// (m - размерность по строкам, n - размерность по колонкам). В консоль вывести индекс строки, сумма чисел
// в которой максимальна. Если таких строк несколько, вывести индекс последней из них.
//Пример сгенерированной матрицы (для простоты m=3, n=5):
//
//3 2 1 5 7 	// сумма - 18
//1 2 5 6 2 	// сумма - 16
//3 4 9 6 4	// сумма - 26
//
//Ответ: 2 (индекс строки, сумма чисел в которой максимальна)

package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr2d = new int[12][8];
        Random rand = new Random();

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = rand.nextInt(50);
            }
        }

        int[] total = new int[arr2d.length];

        for (int i = 0; i < arr2d.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr2d[i].length; j++) {
                sum += arr2d[i][j];
            }
            total[i] = sum;
        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < total.length; i++) {
            if (total[i] > max) {
                max = total[i];
                index = i;
            }
        }
        System.out.println("индекс строки, сумма чисел в которой максимальна: " + index);
    }
}
