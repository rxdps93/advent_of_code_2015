package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputParser {

    private final String fileName;

    public InputParser(String fileName) {
        this.fileName = fileName;
    }

    public List<String> readLinesAsList() {

        try {
            BufferedReader input = new BufferedReader(new FileReader(this.fileName));
            List<String> lines = new ArrayList<>();

            String line;
            while ((line = input.readLine()) != null) {
                lines.add(line);
            }

            return lines;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String[] readLinesAsArray() {
        List<String> lines = readLinesAsList();

        return lines.toArray(String[]::new);
    }
}
