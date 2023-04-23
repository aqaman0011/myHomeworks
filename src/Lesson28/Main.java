package Lesson28;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String filePath = "example.txt";
        String textToSave = "Hello, world!";

        try {
            WorksWithFilePartTwo fileHandler = new WorksWithFilePartTwo(filePath);

            fileHandler.saveToFile(textToSave);

            String fileContent = fileHandler.readFromFile();
            System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
