package Lesson20;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {

        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Map<String, String[]> translations = new HashMap<>();
        Scanner enterWord = new Scanner(System.in);


        translations.put("привіт", new String[]{"hello", "こんにちは", "hallo"});
        translations.put("дякую", new String[]{"thank you", "ありがとうございました", "danke"});
        translations.put("перемога", new String[]{"victory", "勝利", "Sieg"});
        translations.put("колір", new String[]{"color", "色", "Farbe"});
        translations.put("магніт", new String[]{"magnet", "磁石", "magnet"});
        translations.put("пригода", new String[]{"adventure", "冒険", "abenteuer"});
        translations.put("килим", new String[]{"carpet", "カーペット", "teppich"});
        translations.put("склянка", new String[]{"glass", "ガラス", "склянка"});
        translations.put("телефон", new String[]{"phone", "電話", "Telefon"});
        translations.put("пес", new String[]{"dog", "犬", "Hund"});

        System.out.print("Введіть слово на українській: ");
        String word = enterWord.nextLine();

        if (translations.containsKey(word)) {
            String[] translated = translations.get(word);
            System.out.println("Англійська: " + translated[0]);
            System.out.println("Японська: " + translated[1]);
            System.out.println("Німецька: " + translated[2]);
        } else {
            System.out.println("Переклад для цього слова не знайдено.");
        }
    }
}
