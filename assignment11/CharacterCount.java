package com.javaassignments.zemoso.corejava.assignment11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CharacterCount {
    HashMap<Character, Integer> CharMap = new HashMap<>();

    public void charCount() {
        try {
            FileReader fileReader = new FileReader("/home/niveS/textfile.txt");
            int index;
            //converts every character to its ascii value
            while ((index = fileReader.read()) != -1) {
                //System.out.println(index);
                if (!Character.isWhitespace((char) index)) {
                    if (CharMap.containsKey((char) index)) {
                        CharMap.put((char) index, CharMap.get((char) index) + 1);
                    } else {
                        CharMap.put((char) index, 1);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}