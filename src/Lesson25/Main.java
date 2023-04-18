package Lesson25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputInfo = new Scanner(System.in);


        int number = 0;
        boolean correctNumber = false;


        while(!correctNumber) {
            try {
                System.out.println("Enter the number: ");
                number = inputInfo.nextInt();
                correctNumber = true;
            } catch (Exception e) {
                System.out.println("Exception: You entered the wrong data type!");
                inputInfo.nextLine();
            } finally {
                System.out.println("Finally!");
            }
        }
        System.out.println("The number entered is " + number);

    }
}
