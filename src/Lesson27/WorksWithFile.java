package Lesson27;

import java.io.*;

public class WorksWithFile {

    public void saveToFile(String text, String filePath) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(text);
        writer.close();

    }

    public String readFromFile(String filePath) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder stringBuilder = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        reader.close();
        return stringBuilder.toString();
    }
}
