package Lesson7;

import java.util.Scanner;

public class FirstMethod {

    public static void main(String[] args) {

        //Using first method
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number ");
        int input = scr.nextInt();
        System.out.println("The entered number cube equals: " + getCubeNumber(input));

    }

    //First method
    static int getCubeNumber(int number) {
        int cube = number * number * number;
        return cube;
    }

}
