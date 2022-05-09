package com.javaassignments.zemoso.corejava.assignment10;

class SList {
    Node head = new Node(null);
    public SListIterator iterateList() {
        return new SListIterator(head);
    }
    public String toString() {
        if(head==null) {
            return "list is empty: ";
        }
        SListIterator iterator = this.iterateList();
        StringBuilder s=new StringBuilder();
        while (iterator.hasNext()) {
            s.append(iterator.next() + (iterator.hasNext() ? ", " : ""));
        }
        return ""+s;
    }
}
