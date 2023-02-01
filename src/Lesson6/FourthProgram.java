package Lesson6;

public class FourthProgram {

    public static void main(String[] args) {

        //The program output fibonacci numbers up to 100;
         int numberFirst = 0;
         int numberSecond = 1;
         int i = 0;
        System.out.print("Fibonacci numbers up to 100 numbers: " + numberFirst + " " + numberSecond + " ");


         while (i < 10) {

             int sumOfPrevTwo = numberFirst + numberSecond;
             numberFirst = numberSecond;
             numberSecond = sumOfPrevTwo;
             i++;
             System.out.print(" " + sumOfPrevTwo + " ");

         }

    }
}
