package com.javaassignments.zemoso.corejava.assignment5.Problem4;

public class Bicycle implements Cycle{
    @Override
    public void code() {
        factories();
    }

    @Override
    public void factories() {
        System.out.println("I'm inside the factory of Bicycle");
    }
}
