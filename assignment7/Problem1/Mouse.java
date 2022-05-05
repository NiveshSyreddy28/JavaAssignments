package com.javaassignments.zemoso.corejava.assignment7.Problem1;

public class Mouse extends Rodent{
    public Mouse(){
        System.out.println("Inside Mouse class");
    }
    @Override
    public void run() {
        System.out.println("The mouse is running");
    }

    @Override
    public void eat() {
        System.out.println("The mouse is eating");
    }
}
