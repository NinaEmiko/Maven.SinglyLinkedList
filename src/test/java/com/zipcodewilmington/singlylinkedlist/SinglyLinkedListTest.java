package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList singlyLinkedList;
    @Before
    public void before(){
        singlyLinkedList = new SinglyLinkedList<String>();
    }

    @Test
    public void addTest() {
        String expected = "test";
        singlyLinkedList.add(expected);
        Assert.assertTrue(singlyLinkedList.contains(expected));
    }

    @Test
    public void removeTest() {
        String expected = "test";
        singlyLinkedList.add(expected);
        singlyLinkedList.remove(expected);
        Assert.assertFalse(singlyLinkedList.contains(expected));
    }

    @Test
    public void containsTest() {
        singlyLinkedList.add("One");
        boolean expected = true;
        Assert.assertEquals(expected, singlyLinkedList.contains("One"));

    }

    @Test
    public void findTest() {
        int expected = 1;
        String value = "Here";
        singlyLinkedList.add("");
        singlyLinkedList.add(value);
        int actual = singlyLinkedList.find(value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findTest2() {
        int expected = -1;
        String value = "Here";
        singlyLinkedList.add("");
        singlyLinkedList.add(value);
        int actual = singlyLinkedList.find(value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        int expected = 2;
        singlyLinkedList.add("");
        singlyLinkedList.add("Two");
        int actual = singlyLinkedList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        String expected = "Here";

        singlyLinkedList.add("");
        singlyLinkedList.add(expected);

        int actual = singlyLinkedList.get(1);
        Assert.assertEquals(expected, actual);

    }

//    @Test
//    public void copyTest() {
//        singlyLinkedList.add("");
//        singlyLinkedList.add("GOAT");
//        singlyLinkedList.add("Pasadena");
//
//        SinglyLinkedList<String> newList = singlyLinkedList.copy();
//
//        Assert.assertNotEquals(singlyLinkedList.toString(), newList.toString());
//        for (int i = 0; i < singlyLinkedList.size(); i++){
//            Assert.assertEquals(singlyLinkedList.get(i).getData(), newList.get(i).getData());
//        }
//    }

//    @Test
//    public void sortTest() {
//        singlyLinkedList.add("Third");
//        singlyLinkedList.add("Second");
//        singlyLinkedList.add("First");
//
//        singlyLinkedList.sort();
//
//        Assert.assertEquals(singlyLinkedList.get(0).getData(), "First");
//        Assert.assertEquals(singlyLinkedList.get(1).getData(), "Second");
//        Assert.assertEquals(singlyLinkedList.get(2).getData(), "Third");
//    }
}
