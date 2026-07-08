package com.coforge.Day_06_07_26_prj;

import java.util.*;

public class App {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Ankush");
        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");
        names.add("Null");

        names.addFirst("Swapna");
        names.addLast("Pooja");

        System.out.println("\nLinked List:");

      
        names.offerLast("adding last element using offerLast");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Original List: " + names);

       
        LinkedList<String> clonedList = (LinkedList<String>) names.clone();
        System.out.println("Cloned List: " + clonedList);

      
        System.out.println("Contains Rahul? " + names.contains("Rahul"));
        System.out.println("Contains Mohit? " + names.contains("Mohit"));

       
        System.out.println("Size: " + names.size());

    
        System.out.println("Element at index 2: " + names.get(2));

       
        names.set(1, "Rohan");
        System.out.println("After set(): " + names);

        
        names.remove("Neha");
        System.out.println("After remove(Object): " + names);

        names.remove(2);
        System.out.println("After remove(index): " + names);

       
        System.out.println("Index of Amit: " + names.indexOf("Amit"));

        names.add("Ankush");
        System.out.println("List: " + names);
        System.out.println("Last Index of Ankush: " + names.lastIndexOf("Ankush"));

       
        System.out.println("Is Empty? " + names.isEmpty());

        
        LinkedList<String> temp = new LinkedList<>(names);
        temp.clear();
        System.out.println("After clear(): " + temp);

      
        Object[] arr = names.toArray();
        System.out.println("Array Elements:");
        for (Object s : arr) {
            System.out.println(s);
        }

      
        System.out.println("names equals clonedList? " + names.equals(clonedList));

       
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Karan");
        list2.add("Riya");

        names.addAll(list2);
        System.out.println("After addAll(): " + names);
        Collections.sort(names);

        System.out.println("After Sorting: " + names);
        
    }
}