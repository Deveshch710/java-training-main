package com.coforge.Day_04_07_26_prj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class EmployeeMain {

    public static void main(String[] args) {

    
        // LinkedList
     
        LinkedList<Employee> linkedList = new LinkedList<>();

        linkedList.add(new Employee(101, "Ankush", 65000, "HR", "Delhi"));
        linkedList.add(new Employee(102, "Rahul", 72000, "IT", "Mumbai"));
        linkedList.add(new Employee(103, "Priya", 68000, "HR", "Bangalore"));
        linkedList.add(new Employee(104, "Amit", 75000, "Finance", "Delhi"));
        linkedList.add(new Employee(105, "Sneha", 71000, "IT", "Delhi"));

        System.out.println("===== LinkedList =====");
        linkedList.forEach(System.out::println);

        Collections.sort(linkedList,
                new CityComparator()
                        .thenComparing(new DepartmentComparator())
                        .thenComparing(new SalaryComparator()));

        System.out.println("\n===== Sorted LinkedList =====");
        linkedList.forEach(System.out::println);

       
        LinkedHashSet<Employee> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(new Employee(101, "Ankush", 65000, "HR", "Delhi"));
        linkedHashSet.add(new Employee(102, "Rahul", 72000, "IT", "Mumbai"));
        linkedHashSet.add(new Employee(103, "Priya", 68000, "HR", "Bangalore"));
        linkedHashSet.add(new Employee(104, "Amit", 75000, "Finance", "Delhi"));
        linkedHashSet.add(new Employee(105, "Sneha", 71000, "IT", "Delhi"));

        // Duplicate (will be ignored only if equals() & hashCode() are overridden)
        linkedHashSet.add(new Employee(101, "Ankush", 65000, "HR", "Delhi"));

        System.out.println("===== LinkedHashSet =====");
        linkedHashSet.forEach(System.out::println);

        // Convert to List
        ArrayList<Employee> list = new ArrayList<>(linkedHashSet);

        // Sort
        Collections.sort(list,
                new CityComparator()
                        .thenComparing(new DepartmentComparator())
                        .thenComparing(new SalaryComparator()));

        System.out.println("\n===== Sorted List =====");
        list.forEach(System.out::println);

        // Convert back to LinkedHashSet (optional)
        LinkedHashSet<Employee> sortedSet = new LinkedHashSet<>(list);

        System.out.println("\n===== Sorted LinkedHashSet =====");
        sortedSet.forEach(System.out::println);
        
    }
}