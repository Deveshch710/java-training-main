package com.coforge.Day_04_07_26_prj;

import java.util.*;

public class LinkedListHset{

    public static void main(String[] args) {

        // Create LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // ADD elements
        set.add("Ankush");
        set.add("Rahul");
        set.add("Priya");
        set.add("Amit");
        set.add("Neha");

        System.out.println("Original Set: " + set);

        // Duplicate (ignored)
        set.add("Ankush");
        System.out.println("After duplicate add: " + set);

        // contains
        System.out.println("Contains Rahul? " + set.contains("Rahul"));

        // remove
        set.remove("Amit");
        System.out.println("After removing Amit: " + set);

        // size
        System.out.println("Size: " + set.size());

        // for-each loop
        System.out.println("\nIterating:");
        for (String name : set) {
            System.out.println(name);
        }

        // iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // convert to list
        List<String> list = new ArrayList<>(set);
        System.out.println("\nConverted to List: " + list);

        // clear
        set.clear();
        System.out.println("After clear: " + set);
    }
}
