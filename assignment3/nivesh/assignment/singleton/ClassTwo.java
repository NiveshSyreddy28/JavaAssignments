package com.javaassignments.zemoso.corejava.assignment3.nivesh.assignment.singleton;

public class ClassTwo {
    String memberString ;

    public static ClassTwo initializeString(String str){
        //Accesing a non static variable from a static method is wii show an error
        this.memberString = str;
        ClassTwo classTwoObject = new ClassTwo();
        return classTwoObject;
    }
    public void printString(){
        System.out.println("Printing the string from non static method");
        System.out.println("Value of string: "+memberString);
    }
}
