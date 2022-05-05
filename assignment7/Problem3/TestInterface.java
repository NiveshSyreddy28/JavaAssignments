package com.javaassignments.zemoso.corejava.assignment7.Problem3;

public class TestInterface {
    static void method1(InterfaceOne intrfc) {
    };
    static void method2(InterfaceTwo intrfc) {
    };
    static void method3(InterfaceThree intrfc) {
    };
    static void method4(InterfaceThree intrfc) {
    };
    public static void main(String[] args) {

        DerivedClass newClass = new DerivedClass();
        TestInterface.method1(newClass);
        TestInterface.method2(newClass);
        TestInterface.method3(newClass);
        TestInterface.method4(newClass);
    }
}
