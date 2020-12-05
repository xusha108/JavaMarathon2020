package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иван Иваныч ", "География ");
        Student student1 = new Student("Коля ");
        teacher1.evaluate(student1);
    }
}
