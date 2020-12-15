package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\comp\\Desktop\\JS\\Java\\JavaMarathon2020\\src\\main\\resources\\shoes.csv");
        List<String> missingShoes = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                String[] strNums = currentLine.split(";");
                int num = Integer.parseInt(strNums[2]);
                if (num == 0) {
                    missingShoes.add(strNums[0] + ", " + strNums[1] + ", " + strNums[2]);
                }
            }
            scanner.close();
            try {
                PrintWriter pw = new PrintWriter("C:\\Users\\comp\\Desktop\\JS\\Java\\JavaMarathon2020\\src\\main\\java\\day15\\task1\\missing_shoes.txt");
                for (int i = 0; i < missingShoes.size(); i++) {
                    pw.println(missingShoes.get(i));
                }

                pw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
