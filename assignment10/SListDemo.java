package com.javaassignments.zemoso.corejava.assignment10;

public class SListDemo {
    public static void main(String[] args) {
        SList sList1 = new SList();
        SListIterator sListIterator1 = sList1.iterateList();
        System.out.print(sList1);

        sListIterator1.insertNode("Hello");
        sListIterator1.insertNode("World");
        System.out.println(sList1);

        SListIterator sListIterator2 = sList1.iterateList();
        sListIterator2.removeNode();
        System.out.println(sList1);

        sListIterator2.insertNode("Hello");
        sListIterator2.insertNode("Zemoso");
        sListIterator2.removeNode();
        System.out.println(sList1);
    }
}
