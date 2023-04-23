package Lesson27;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        WorksWithFile fileHandler = new WorksWithFile();
        String filePath = "text.txt";
        String text = "Hello, world!";


        fileHandler.saveToFile(text, filePath);


        String fileContent = fileHandler.readFromFile(filePath);
        System.out.println("File content: " + fileContent);
    }
}
