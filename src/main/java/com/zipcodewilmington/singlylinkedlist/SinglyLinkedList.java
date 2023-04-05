package com.zipcodewilmington.singlylinkedlist;

import java.lang.reflect.Array;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    public void add(String expected) {
    }

    public boolean contains(String expected) {
    }

    public void remove(String expected) {
    }

    public int find(String value) {
    }

    public int size() {
    }

    public int get(int i) {
    }

    public SinglyLinkedList<String> copy() {
    }

    public void sort() {
    }

//    class Node {
//        int val;
//        Node next;
//        Node(int val) {
//            this.val = val;
//        }
//
//        private Node head;
//        private Node tail;
//
//        public void addFirst(int val) {
//            if(isEmpty()) {
//                head = new Node(val);
//                tail = head;
//                return;
//            }
//            Node newNode = new Node(val);
//            newNode.next = head;
//            head = newNode;
//        }
//
//        public void addLast(int val){
//            if(isEmpty()) {
//                head = new Node(val);
//                tail = head;
//                return;
//            }
//            Node newNode = new Node(val);
//            tail.next = newNode;
//            tail = newNode;
//        }
//
//        public void add(int pos, int val) {
//            if(pos == 1) {
//                addFirst(val);
//                return;
//            }
//            Node current = head;
//            int count = 1;
//            while(count < pos - 1) {
//                count++;
//                current = current.next;
//            }
//            Node newNode = new Node(val);
//            newNode.next = current.next;
//            current.next = newNode;
//        }
//
//        public int deleteFirst() {
//            if(isEmpty()) {
//                throw new RuntimeException("List is Empty");
//            }
//            Node current = head;
//            head = head.next;
//            current.next = null;
//            if(isEmpty()) {
//                tail = null;
//            }
//            return current.val;
//        }
//
//        public int deleteLast() {
//            if(isEmpty()) {
//                throw new RuntimeException("List is Empty");
//            }
//            if (head == tail) {
//                int val = head.val;
//                head = null;
//                tail = null;
//                return val;
//            }
//            Node current = head;
//            Node previous = null;
//
//            while (current.next != null) {
//                previous = current;
//                current = current.next;
//            }
//            previous.next = null;
//            tail = previous;
//            return current.val;
//        }
//
//        public int delete(int pos) {
//            if(isEmpty()) {
//                throw new RuntimeException("List is Empty");
//            }
//            if(pos == 1) {
//                deleteFirst();
//            }
//            Node current = head;
//            Node previous = null;
//            int count = 1;
//
//            while(count < pos){
//                count++;
//                previous = current;
//                current = current.next;
//            }
//            previous.next = current.next;
//            current.next = null;
//            return current.val;
//        }
//
//        public boolean search(int val) {
//            Node current = head;
//            while(current != null) {
//                if(val == current.val) {
//                    return true;
//                }
//                current = current.next;
//            }
//            return false;
//        }
//
//        public boolean isEmpty() {
//            return head == null;
//        }
//        public void print(){
//            Node current = head;
//
//            while(current != null){
//                System.out.println(current.val + " -> ");
//                current = current.next;
//            }
//            System.out.println();
//        }
//    }

//    T[] singlyLinkedList = (T[]) new Object[0];
//
//    public void add(T item){
//        T[] newSinglyLinkedList = (T[]) new Object[singlyLinkedList.length + 1];
//
//        for (int i = 0; i < newSinglyLinkedList.length; i++) {
//            newSinglyLinkedList[i] = item;
//        }
//        this.singlyLinkedList = newSinglyLinkedList;
//    }
//
//    public T get(int index){
//        return this.singlyLinkedList[index];
//    }
}
