package com.example.day0417;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFileManager {
    private String filePath;

    public TextFileManager(String filePath) {
        this.filePath = filePath;
    }

    public void writeToFile(List<String> userInput) {

        try (FileWriter writer = new FileWriter(filePath)) {
            for (String str : userInput) {
                writer.write(str + "\n");
            }
        } catch (Exception e) {

        }
    }

    public List<String> readFromFile() {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
