package Lesson5;

import java.util.Scanner;

public class FirstProgram {

    public static void main(String[] args) {

        //The first program

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int first = scr.nextInt();

        System.out.println("Enter the second number: ");
        int second = scr.nextInt();

        boolean findLargeNumber = first > second;
        boolean findEqual = first == second;


        if (findLargeNumber) {
            System.out.println("This number " + first + " is the largest");
        } else if (findEqual) {
            System.out.println("These numbers are equal, try again!");
        } else {
            System.out.println("This number " + second + " is the largest");
        }

    }
}
