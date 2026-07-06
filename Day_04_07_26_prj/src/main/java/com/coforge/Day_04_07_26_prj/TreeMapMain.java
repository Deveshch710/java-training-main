package com.coforge.Day_04_07_26_prj;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {

    public static void main(String[] args) {

        TreeMap<Integer, Employee> map = new TreeMap<>();

        map.put(105, new Employee(105, "Ankush", 65000, "HR", "Delhi"));
        map.put(101, new Employee(101, "Rahul", 72000, "IT", "Mumbai"));
        map.put(103, new Employee(103, "Priya", 68000, "Finance", "Pune"));
        map.put(102, new Employee(102, "Amit", 70000, "Sales", "Noida"));
        map.put(104, new Employee(104, "Neha", 75000, "IT", "Bangalore"));

        System.out.println("Complete TreeMap");
        System.out.println(map);

        System.out.println("\nLine by Line");

        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}