package Lesson5;

import java.util.Scanner;

public class SecondProgram {

    public static void main(String[] args) {

            //The second program

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int first = scr.nextInt();

        System.out.println("Enter the second number: ");
        int second = scr.nextInt();

        boolean secondOption = first < second;


        if (secondOption) {
            System.out.println("This number " + first + " is the smallest");
        } else {
            System.out.println("This number " + second + " is the smallest");
        }

        }
    }
