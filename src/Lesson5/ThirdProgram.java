package Lesson5;

import java.util.Scanner;

public class ThirdProgram {

    public static void main(String[] args) {

        //The third program
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scr.nextInt();

        boolean evenNumber = number % 2 == 0;

        if (evenNumber) {
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered number is not even");
        }

    }
}
