package com.example.day0417.실습2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserInputHandler {
    public List<String> getUserInput() throws IOException {
        List<String> userInput = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("텍스트를 입력하세요. ('q'를 입력하면 종료됩니다.)");
            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("q")) {
                userInput.add(line);
            }
        }
        return userInput;
    }
}
