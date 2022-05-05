package com.javaassignments.zemoso.corejava.assignment6;

public class ConstructorOverload {

    //no-args constructor
    public ConstructorOverload(){
        //Calling constructor 2 from constructor 1
        this("Nivesh");

        //Print Statement in constructor 1
        System.out.println("I'm contructor 1[no argument constructor]");

    }

    //parameterized constructor
    public ConstructorOverload(String name){
        //Print statement in constructor 2
        System.out.println("I'm constructor 2[argument constructor]");


    }
}
