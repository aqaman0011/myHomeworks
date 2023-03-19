package Lesson18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> listNumberInt = new ArrayList<>();
        List<Long> listNimberLong = new LinkedList<>();
        List<Studens> studens = new ArrayList<>();

        //Task 1
        for (int i = 0; i < 10; i++) {
            listNumberInt.add(i);
        }

        for (long i = 0; i < 2000000; i++) {
            listNimberLong.add(i);
        }

        //Task 2
        studens.add( new Studens("Ivan", "Ivanov"));
        studens.add( new Studens("Sergey", "Gunko"));
        studens.add( new Studens("Dimon", "Filipov"));
        studens.add( new Studens("Pavel", "Buch"));

        //Task 3
        for (Studens students : studens) {
            System.out.println(students);
        }
    }

}
