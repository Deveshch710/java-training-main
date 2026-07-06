package com.coforge.Day_04_07_26_prj;

import java.util.*;

public class VectorMain {

    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

        // ADD Elements
        names.add("Ankush");
        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");
        names.add("Neha");

        System.out.println("Original Vector: " + names);

        // ADD AT INDEX
        names.add(2, "Vikas");
        System.out.println("After add at index 2: " + names);

        // GET ELEMENT
        System.out.println("Element at index 3: " + names.get(3));

        // UPDATE ELEMENT (set)
        names.set(1, "Rohit");
        System.out.println("After update index 1: " + names);

        // REMOVE ELEMENT (by index)
        names.remove(4);
        System.out.println("After removing index 4: " + names);

        // REMOVE ELEMENT (by value)
        names.remove("Priya");
        System.out.println("After removing 'Priya': " + names);

        // SIZE
        System.out.println("Size of vector: " + names.size());

        // CAPACITY
        System.out.println("Capacity of vector: " + names.capacity());

        // CONTAINS
        System.out.println("Contains Amit? " + names.contains("Amit"));

        // INDEX OF
        System.out.println("Index of Neha: " + names.indexOf("Neha"));

        // SORT VECTOR
        Collections.sort(names);
        System.out.println("After sorting: " + names);

        // ITERATOR
        System.out.println("\nIterator Traversal:");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // LISTITERATOR (forward)
        System.out.println("\n\nListIterator Forward:");
        ListIterator<String> lit = names.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }

        // LISTITERATOR (backward)
        System.out.println("\n\nListIterator Backward:");
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }

        // ENUMERATION (legacy)
        System.out.println("\n\nEnumeration Traversal:");
        Enumeration<String> en = names.elements();
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }

        // FIRST & LAST ELEMENT
        System.out.println("\n\nFirst Element: " + names.firstElement());
        System.out.println("Last Element: " + names.lastElement());

        // CLEAR VECTOR
        names.clear();
        System.out.println("\nAfter clear: " + names);
    }
}