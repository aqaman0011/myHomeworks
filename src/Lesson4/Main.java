package Lesson4;

public class Main {

    public static void main(String[] args) {

        String str = "Sentences in upper and lower case with the output of the first and last letter";
        String upperCase = str.toUpperCase();
        String lowerCase = str.toLowerCase();
        int length = str.length();
        int lastIndex = length - 1;
        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(lastIndex);

        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println("The first letter " + firstLetter);
        System.out.println("The last letter " + lastLetter);
    }
}