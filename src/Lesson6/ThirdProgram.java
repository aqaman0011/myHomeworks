package Lesson6;

public class ThirdProgram {

    public static void main(String[] args) {

        //The program calculates the factorial of the number 7;
        int result = 1;
        for (int i = 1; i <= 7; i++) {
            result *= i;
        }
        System.out.println("The factorial of 7 is " + result);

    }
}
