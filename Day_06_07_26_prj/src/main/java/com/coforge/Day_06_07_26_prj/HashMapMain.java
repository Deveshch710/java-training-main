package com.coforge.Day_06_07_26_prj;


import java.util.*;

public class HashMapMain {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        
        // ADD ELEMENTS
        map.put(101, "Ankush");
        map.put(102, "Rahul");
        map.put(103, "Priya");
        map.put(104, "Amit");

        System.out.println("Map : " + map);

        // Add only if key is absent
        map.putIfAbsent(105, "Neha");
        System.out.println("putIfAbsent : " + map);

  
        // GET METHODS
        System.out.println("get(102) : " + map.get(102));

        System.out.println("getOrDefault(200,\"Not Found\") : "
                + map.getOrDefault(200, "Not Found"));

     
        // SEARCH METHOD
        System.out.println("containsKey(103) : "
                + map.containsKey(103));

        System.out.println("containsValue(\"Rahul\") : "
                + map.containsValue("Rahul"));

     
        // SIZE
        System.out.println("Size : " + map.size());

        // UPDATE
        map.replace(101, "Ankit");
        System.out.println("replace : " + map);

        map.replace(102, "Rahul", "Rohit");
        System.out.println("replace(old,new) : " + map);

        // REMOVE
        map.remove(104);
        System.out.println("remove(key) : " + map);

        map.remove(103, "Priya");
        System.out.println("remove(key,value) : " + map);

        // KEY SET
        System.out.println("Keys : " + map.keySet());

        
        // VALUES
        System.out.println("Values : " + map.values());

     
        // ENTRY SET
        System.out.println("Entry Set : " + map.entrySet());

      
        // ITERATE USING forEach
        map.forEach((k, v) ->
                System.out.println(k + " -> " + v));

       
        // ITERATE USING entrySet
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // ITERATE USING keySet
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // ITERATE VALUES ONLY
        for (String value : map.values()) {
            System.out.println(value);
        }


        // COMPUTE METHODS
        map.compute(101, (k, v) -> v + " Sharma");
        System.out.println("compute : " + map);

        map.computeIfAbsent(106, k -> "Sonia");
        System.out.println("computeIfAbsent : " + map);

        map.computeIfPresent(101, (k, v) -> v.toUpperCase());
        System.out.println("computeIfPresent : " + map);

       
        // MERGE 
        map.merge(101, " Kumar", (oldValue, newValue) ->
                oldValue + newValue);

        System.out.println("merge : " + map);

        // REPLACE ALL
        map.replaceAll((k, v) -> v.toLowerCase());
        System.out.println("replaceAll : " + map);

   
        // CLONE
        HashMap<Integer, String> copy =
                (HashMap<Integer, String>) map.clone();

        System.out.println("Clone : " + copy);

   
        // PUT ALL
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(201, "Java");
        map2.put(202, "Python");

        map.putAll(map2);

        System.out.println("putAll : " + map);

        
        // IS EMPTY
        System.out.println("isEmpty : " + map.isEmpty());

    
        // CLEAR
        map.clear();

        System.out.println("After clear : " + map);

        System.out.println("isEmpty : " + map.isEmpty());
    }
}