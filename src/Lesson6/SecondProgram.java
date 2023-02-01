package Lesson6;

public class SecondProgram {

    public static void main(String[] args) {

        //The program output all paired numbers from 1 to 100;
        for (int i = 1; i <= 100; i++) {
            boolean evenNumber = i % 2 == 0;
            if (evenNumber) {
                System.out.println("Our even number " + i);
            }
        }
    }
}
