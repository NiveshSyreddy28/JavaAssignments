package com.javaassignments.zemoso.corejava.assignment11;

public class CharacterCountDemo {

    public static void main(String[] args) {
        CharacterCount characterCount = new CharacterCount();
        characterCount.charCount();
        SaveToFile saveToFile = new SaveToFile();
        saveToFile.saveOutputToFile(characterCount);

    }

}
