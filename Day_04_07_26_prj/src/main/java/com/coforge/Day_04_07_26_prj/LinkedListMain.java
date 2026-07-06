package com.coforge.Day_04_07_26_prj;

import java.util.*;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        
        //  ADD OPERATIONS
      
        list.add("Ankush");
        list.add("Rahul");
        list.add("Priya");
        list.add("Amit");

        System.out.println("After add(): " + list);

        list.addFirst("FirstUser");     // add at beginning
        list.addLast("LastUser");       // add at end

        System.out.println("After addFirst & addLast: " + list);

        list.add(2, "MiddleUser");      // add at index
        System.out.println("After add at index 2: " + list);

  
        // 2. ACCESS OPERATIONS
      
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at index 3: " + list.get(3));

       
        // UPDATE OPERATION
       
        list.set(2, "UpdatedUser");
        System.out.println("After update: " + list);

        // REMOVE OPERATIONS
       
        list.remove("Rahul");       // remove by value
        list.remove(3);             // remove by index
        list.removeFirst();         // remove first
        list.removeLast();          // remove last

        System.out.println("After removals: " + list);

        
        // 5. SEARCH OPERATION
       
        System.out.println("Contains Ankush? " + list.contains("Ankush"));
        System.out.println("Index of Priya: " + list.indexOf("Priya"));

       
        // 6. ITERATION METHODS
     
        System.out.println("\n--- For loop ---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\n--- Enhanced for loop ---");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("\n--- Iterator ---");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n--- ListIterator (forward & backward) ---");
        ListIterator<String> lit = list.listIterator();

        while (lit.hasNext()) {
            System.out.println("Forward: " + lit.next());
        }

        while (lit.hasPrevious()) {
            System.out.println("Backward: " + lit.previous());
        }

        // OTHER OPERATIONS
        LinkedList<String> copy = new LinkedList<>(list);
        System.out.println("Copied List: " + copy);

        list.clear();
        System.out.println("After clear(): " + list);
    }
}