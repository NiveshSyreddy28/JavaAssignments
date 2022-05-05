package com.javaassignments.zemoso.corejava.assignment5.Problem1;

public class Hamster extends Rodent{
    public Hamster(){
        System.out.println("Inside Hamster class");
    }

    @Override
    public void eat() {
        System.out.println("The Hamster is eating");
    }

    @Override
    public void run() {
        System.out.println("The Hamster is running");
    }
}
