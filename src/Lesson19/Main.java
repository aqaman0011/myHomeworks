package Lesson19;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Integer> firstSetCollection = new HashSet<>();
        Set<Integer> secondSetCollection = new TreeSet<>();
        Set<Integer> thirdSetCollection = new LinkedHashSet<>();

        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt(50) + 1;
            firstSetCollection.add(randomNumber);
            secondSetCollection.add(randomNumber);
            thirdSetCollection.add(randomNumber);
        }

        System.out.println("Our HashSet collection a have number: " + firstSetCollection);
        System.out.println("Our TreeSet collection a have number: " + secondSetCollection);
        System.out.println("Our LinkedHashSet collection a have number: " + thirdSetCollection);
    }
}
