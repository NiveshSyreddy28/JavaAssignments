package com.javaassignments.zemoso.corejava.assignment8;

public class VerifyCard extends Exception{
    public void checkDetails(String cardNumber, String cvv, String expiry)throws InvalidCardNumber, InvalidCvv, InvalidExpiry{
        if (cardNumber.length()!=16){
            throw new InvalidCardNumber("Invalid card number entered");
        }
        else if ((expiry.length()!=4)) {
            throw new InvalidExpiry("Invalid expiry date entered");
        }
        else if (cvv.length()!=3) {
            throw new InvalidCvv("Invalid CVV entered");

        }
    }
}
