package com.javaassignments.zemoso.corejava.assignment9;
import java.util.Scanner;
import java.util.regex.*;
public class RegexTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexPattern = "[A-Z].*[.]";

        System.out.println("Enter the string");
        String inputString = scanner.nextLine();

        if (Pattern.matches(regexPattern,inputString)){
            System.out.println("The given sentence starts with a capital letter and ends with a period");
        }
        else {
            System.out.println("The given sentence doesn't starts with a capital letter and ends with a period");
        }
    }
}
