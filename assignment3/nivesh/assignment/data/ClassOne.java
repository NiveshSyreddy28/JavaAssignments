package com.javaassignments.zemoso.corejava.assignment3.nivesh.assignment.data;

public class ClassOne {

    //The member variables will be assigned with default values if they are not initialized
    int memberInt;
    char memberChar;

    public void printMemberVariables(){
        System.out.println("Printing Member Variables");
        System.out.println("Value of uninitialized int and char are:\t"+memberInt+" "+memberChar);
    }

    public void printLocalVariables(){

        //The local variables will not be assigned with any value if they are not initialized
        int localInt;
        char localChar;

        System.out.println("Printing Member Variables");

        //This print statement will give error as the local varibles does't contain any value
        System.out.println("Value of uninitialized int and char are:\t"+localInt+" "+localChar);
    }
}
