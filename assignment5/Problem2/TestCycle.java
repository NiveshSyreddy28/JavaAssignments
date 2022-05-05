package com.javaassignments.zemoso.corejava.assignment5.Problem2;

public class TestCycle {
    public static void main(String[] args) {
        Cycle[] cycleObject = new Cycle[3];

        cycleObject[0] = new Unicycle();
        cycleObject[1] = new Bicycle();
        cycleObject[2] = new Tricycle();

        cycleObject[0].balance();
        cycleObject[1].balance();
        cycleObject[2].balance();
    }
}
