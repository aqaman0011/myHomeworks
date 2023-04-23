package Lesson26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double number;

        while (true) {
            try {
                System.out.print("Enter a non-negative number: ");
                number = scn.nextDouble();
                double result = squareNumber(number);
                System.out.println("The square of " + number + " is " + result);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scn.nextLine();
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
            }
        }


    }

    public static double squareNumber(double number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException();
        }
        return Math.pow(number, 2);
    }
}
