package Lesson28;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WorksWithFilePartTwo {

    private Path filePath;

    public WorksWithFilePartTwo(String filePath) {
        this.filePath = Path.of(filePath);
    }

    public void saveToFile(String text) throws IOException {
        Files.writeString(filePath, text, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
    }

    public String readFromFile() throws IOException {
        return Files.readString(filePath, StandardCharsets.UTF_8);
    }

}
