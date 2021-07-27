package com.epam.izh.rd.oline;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static String readFileFromResources(String pathToFile) {
        StringBuilder text = new StringBuilder();
        File file = new File(pathToFile);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                text.append("\n").append(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return text.toString();
    }
}