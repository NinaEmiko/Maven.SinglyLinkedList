package com.zipcodewilmington.singlylinkedlist;

public class Node {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
}
