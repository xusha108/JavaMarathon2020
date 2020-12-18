//Создайте рекурсивный метод, который принимает на вход единственный аргумент - число, и возвращает количество цифр
// 7 в этом числе. Циклы использовать запрещено, можно использовать только рекурсивные вызовы.
//
//Пример:
//System.out.println(count7(717771237)); // 5


package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));

    }

    public static int count7(int total) {
        String strSum = Integer.toString(total);
        String nums[] = strSum.split("");
       return recursionSum(nums, 0);

    }

    public static int recursionSum(String nums[], int i) {
        if (i == nums.length - 1) {
            if (Integer.parseInt(nums[i]) == 7) {
                return 1;
            }
            return 0;
        }

        if (Integer.parseInt(nums[i]) == 7) {
            return 1 + recursionSum(nums, i + 1);
        }
        return 0 + recursionSum(nums, i + 1);
    }
}
