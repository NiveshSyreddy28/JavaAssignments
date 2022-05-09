package com.javaassignments.zemoso.corejava.assignment8;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            VerifyCard verifyCard = new VerifyCard();

            System.out.println("Enter the card number");
            String cardNumber  = scanner.nextLine();

            System.out.println("Enter the card cvv");
            String cvv = scanner.nextLine();

            System.out.println("Enter the card expiry");
            String expiry = scanner.nextLine();

            verifyCard.checkDetails(cardNumber,cvv,expiry);
        }
        catch (InvalidCardNumber | InvalidCvv | InvalidExpiry e){
            System.out.println(e.getMessage());
        }
    }
}