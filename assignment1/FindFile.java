package com.javaassignments.zemoso.corejava.assignment1;

//Importing required packages
import java.io.File;
import java.util.Scanner;
public class FindFile {

    public static void main(String[] args) {
        //Instantiating the scanner
        Scanner scanner = new Scanner(System.in);

        //Create a file stream for the home directory
        File file = new File("/home/zadmin");

        //Storing all the available files in a list
        String[] availableFiles = file.list();

        //While loop is used here to take repaeated inputs and search for the file
        String start = "yes";
        while (start.equalsIgnoreCase("yes")) {
            System.out.print("Enter the file name:\t");
            String fileToSearch = scanner.nextLine();
            boolean flag = false;

            //Iterating through all the files to check for the required file
            for (String eachFile : availableFiles) {
                if (eachFile.equals(fileToSearch)) {
                    //Printing the absolute path of the file
                    System.out.println(fileToSearch + " File found at: " + file.getAbsolutePath());
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                //IF file not found
                System.out.println("File not found");
            }
            System.out.println("Do you want to search for another file? enter yes or no");
            start = scanner.nextLine();
        }
    }
}
