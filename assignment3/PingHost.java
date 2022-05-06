package com.javaassignments.zemoso.corejava.assignment3;

//Import required packages
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PingHost {
    public static void main(String[] args) {
        //Instantiate scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ip address you want to ping: ");
        String ipAddress =scanner.nextLine();

        //ping command is used to ping a server and -c3 describes send 3 packets of data to the server
        String command = "ping -c3 "+ipAddress;

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s;
            // Printing the output of the command to the console
            //Terminating the loop when the output is null
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
