package Lesson7;

public class ThirdMethod {

    public static void main(String[] args) {

        //The method output the specified character, the specified number of times
        outputSymbol(5,"$");

    }

    //Third Method
    static void outputSymbol(int number, String symbol) {
        for (int i = 0; i < number; i++ ) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
