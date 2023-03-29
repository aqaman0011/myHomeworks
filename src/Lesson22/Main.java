package Lesson22;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> ourStudent = Arrays.<Student>asList(
                new Student("Sydorov", 100),
                new Student("Gunko", 80),
                new Student("Petrobv", 90),
                new Student("Taran", 60),
                new Student("Chan", 40),
                new Student("Noris", 70),
                new Student("Jlo", 50),
                new Student("Zelensky", 30),
                new Student("Kluni", 10),
                new Student("mcGregor", 5)
        );
        System.out.println(ourStudent);

        ourStudent.sort(Comparator.comparing(Student :: getSureName));
        System.out.println(ourStudent);

        ourStudent.sort(Comparator.comparing(Student :: getAverageRating));
        System.out.println(ourStudent);


    }
}
