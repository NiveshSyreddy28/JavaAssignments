package com.javaassignments.zemoso.corejava.assignment7.Problem1;

public class Gebril extends Rodent{
    public Gebril(){
        System.out.println("Inside Gebril class");
    }

    @Override
    public void eat() {
        System.out.println("The Gebril is eating");
    }

    @Override
    public void run() {
        System.out.println("The Gebril is running");
    }
}
