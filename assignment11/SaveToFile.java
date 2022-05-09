package com.javaassignments.zemoso.corejava.assignment11;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveToFile {
    public void saveOutputToFile(CharacterCount characterCount) {
        try {
            PrintWriter printWriter = new PrintWriter("/home/niveS/count.txt");
            printWriter.println(characterCount.CharMap.toString());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
