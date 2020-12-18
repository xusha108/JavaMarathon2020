//Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в этом массиве не используя циклы
// (необходимо использовать рекурсивные вызовы).
//
//Пример:
//int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
//System.out.println(recursionSum(...)); // 65346
//
//*recursionSum(...) - это ваш рекурсивный метод, который вернет сумму чисел в массиве numbers.


package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, 0));
    }


    public static int recursionSum(int[] numbers, int i) {
        if (i == (numbers.length - 1))
            return numbers[i];
        return numbers[i] + recursionSum(numbers, i + 1);
    }
}
