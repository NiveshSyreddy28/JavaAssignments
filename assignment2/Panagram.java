package com.javaassignments.zemoso.corejava.assignment2;
import java.util.Scanner;
public class Panagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String inputString = scanner.nextLine();

        inputString = inputString.toUpperCase();
        boolean [] alphaList = new boolean[26];
        int index = 0;
        boolean flag = true;

        for(int iter = 0;iter < inputString.length();iter++){
            if (inputString.charAt(iter) >= 'A' && inputString.charAt(iter) <= 'Z'){
                index = inputString.charAt(iter) - 'A';
                alphaList[index] = true;
            }
        }

        for (int iter = 0;iter <= 25;iter++){
            if(!alphaList[iter]){
                flag = false;
            }
        }
        if (flag){
            System.out.println("Given string contains all letters of alphabet");
        }
        else{
            System.out.println("Given string do not contain all letters of alphabet");
        }

    }
}

// The time complexity of this solution is O(n) as we are iterating over the length of the input string.
// The space complexity of this solution is also O(n) as the size depends on the length of the input string.

// The time and space complexities of the array AlphaList can be ignored as they are constant irrespective of the
// length of given string.
