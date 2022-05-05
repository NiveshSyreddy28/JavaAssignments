package com.javaassignments.zemoso.corejava.assignment7.Problem5;

public class OuterClassTwo extends OuterClassOne {
    public void OuterClassTwo(){
        System.out.println("Inside OuterClassTwo constructor");
    }

     class InnerClassTwo{
        public void InnerClassTwo(){
            System.out.println("Inside InnerClassTwo constructor");
        }
    }
}
