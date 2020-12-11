//Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
//Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка.
//Распечатать список.

package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Suzuki");
        cars.add("Subaru");
        cars.add("Mazda");
        cars.add("Lexus");
        System.out.println(cars);
        cars.add(2, "BMW");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);

    }
}
