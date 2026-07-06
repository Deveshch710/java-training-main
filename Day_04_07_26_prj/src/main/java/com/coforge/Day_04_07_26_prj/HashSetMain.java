package com.coforge.Day_04_07_26_prj;

import java.util.*;

public class HashSetMain {
    public static void main(String[] args) {

        // Create HashSet
        HashSet<Integer> hset = new HashSet<>();

        // 2. ADD elements
        hset.add(1);
        hset.add(44);
        hset.add(88);
        hset.add(66);
        hset.add(44); // duplicate (ignored)

        System.out.println("Original HashSet: " + hset);

        //SIZE
        System.out.println("Size: " + hset.size());

        // CONTAINS
        System.out.println("Contains 88? " + hset.contains(88));

        // REMOVE
        hset.remove(66);
        System.out.println("After removing 66: " + hset);

        // ITERATION using for-each
        System.out.println("\nFor-each iteration:");
        for (Integer num : hset) {
            System.out.println(num);
        }

        // ITERATION using Iterator
        System.out.println("\nIterator:");
        Iterator<Integer> it = hset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ADD ALL (Union operation)
        HashSet<Integer> hset1 = new HashSet<>();
        hset1.add(100);
        hset1.add(200);
        hset1.add(300);

        hset.addAll(hset1);
        System.out.println("\nAfter addAll (Union): " + hset);

        // REMOVE ALL
        hset.removeAll(hset1);
        System.out.println("After removeAll: " + hset);

        // RETAIN ALL (Intersection)
        HashSet<Integer> hset2 = new HashSet<>();
        hset2.add(1);
        hset2.add(88);

        hset.retainAll(hset2);
        System.out.println("After retainAll (Intersection): " + hset);

        // CLEAR
        hset.clear();
        System.out.println("After clear: " + hset);

        // EMPTY CHECK
        System.out.println("Is empty? " + hset.isEmpty());
    }
}