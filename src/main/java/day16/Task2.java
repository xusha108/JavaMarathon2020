package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\comp\\Desktop\\JS\\Java\\JavaMarathon2020\\src\\main\\java\\day16\\file1.txt");
        File file2 = new File("C:\\Users\\comp\\Desktop\\JS\\Java\\JavaMarathon2020\\src\\main\\java\\day16\\file2.txt");
        calcResult(file1);
        printResult(file2);
    }

    public static void calcResult(File file1) {
        try {
            List<Integer> nums = new ArrayList<>();
            List<Double> sums = new ArrayList<>();

            Random rand = new Random();
            PrintWriter pw1 = new PrintWriter("C:\\Users\\comp\\Desktop\\JS\\Java\\JavaMarathon2020\\src\\main\\java\\day16\\file1.txt");
            PrintWriter pw2 = new PrintWriter("C:\\Users\\comp\\Desktop\\JS\\Java\\JavaMarathon2020\\src\\main\\java\\day16\\file2.txt");

            for (int i = 0; i < 1000; i++) {
                nums.add(rand.nextInt(100));
            }
            pw1.print(nums);

            double sum = 0;
            for (int i = 20; i < nums.size(); i = i + 20) {
                for (int j = i - 20; j < i; j++) {
                    sum = (sum + nums.get(j)) /20;
                    sums.add(sum);
                }
            }
            pw2.println(sums + " ");
            pw1.close();
            pw2.close();

            double resultDouble = 0;
            for (int i = 0; i < sums.size(); i++) {
                resultDouble += sums.get(i);
            }
            int result = (int) resultDouble;
            System.out.println(result);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }


    public static void printResult(File file2) {


    }
}
