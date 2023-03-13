package Lesson17;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DaysOfWeek daysOfWeek = DaysOfWeek.MONDAY;
        Scanner inputNumberDay = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 7! And you will see the day of the week corresponding to the entered number.");
        int numberScan = inputNumberDay.nextInt();

        daysOfWeek.printDays(numberScan);

    }
}
