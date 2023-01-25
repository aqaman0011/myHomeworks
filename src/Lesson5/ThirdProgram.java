package Lesson5;

import java.util.Scanner;

public class ThirdProgram {

    public static void main(String[] args) {

        //The third program
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scr.nextInt();

        boolean thirdOption = number % 2 == 0;

        if (thirdOption) {
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered number is not even");
        }

    }
}
