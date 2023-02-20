package Lesson7;

import java.util.Scanner;

public class SecondMethod {


    public static void main(String[] args) {

        //Enter the required number of stars in method "printStars"
         printStars(11);

    }

    // Second method
    static void printStars(int number) {
        for (int i = 0; i<number; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

}
