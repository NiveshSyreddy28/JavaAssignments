package com.javaassignments.zemoso.corejava.assignment10;

class Node {
    String data;
    Node next;
    Node(String data, Node next){
        this.data=data;
        this.next=next;
    }
    Node(String data){
        this(data, null);
    }
    public String toString() {
        if (data == null)
            return "null";
        return data;
    }
}
