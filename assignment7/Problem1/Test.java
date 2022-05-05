package com.javaassignments.zemoso.corejava.assignment7.Problem1;

public class Test {
    public static void main(String[] args) {
        Rodent[] rodentObjects = new Rodent[4];

        rodentObjects[0] = new Mouse();
        rodentObjects[1] = new Gebril();
        rodentObjects[2] = new Hamster();
        rodentObjects[3] = new Mouse();

        rodentObjects[0].eat();
        rodentObjects[1].run();
        rodentObjects[2].eat();
        rodentObjects[3].run();
    }
}
