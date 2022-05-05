package com.javaassignments.zemoso.corejava.assignment3.nivesh.assignment.main;
import com.javaassignments.zemoso.corejava.assignment3.nivesh.assignment.data.ClassOne;
import com.javaassignments.zemoso.corejava.assignment3.nivesh.assignment.singleton.ClassTwo;

public class Test {
    public static void main(String[] args) {

        ClassOne classOneObject = new ClassOne();
        classOneObject.printMemberVariables();

        //This method call will result in an error as local variables are not initialized
        classOneObject.printLocalVariables();

        //This line will result in an error as non static variavbles can't be accessed from static method
        // The object will not be created as the method itself can't be invoked
        ClassTwo classTwoObject = ClassTwo.initializeString("ABCD");
        classTwoObject.printString();
    }
}
