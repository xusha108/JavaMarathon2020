package day6;

import java.util.Random;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String mark() {
        Random rand = new Random();
        String result = "отлично";

        int x = rand.nextInt(4) + 2;
        if (x == 2) {
            result = "неудовлетворительно";
        }
        if (x == 3) {
            result = "удовлетворительно";
        }
        if (x == 4) {
            result = "хорошо";
        }
        return result;
    }

    public void evaluate(Student student) {
        System.out.println("Преподаватель " + name + "оценил студента с именем " + student.getName() +
                "по предмету " + subject + "на оценку " + mark());
    }
}
