package com.coforge.Day_04_07_26_prj;
import java.util.Set;
import java.util.TreeSet;

public class ProductMain {

    public static void main(String[] args) {

        TreeSet<Product> products = new TreeSet<>();

        // Add Products
        products.add(new Product(105, "Laptop", 65000, "Electronics", 10));
        products.add(new Product(101, "Mouse", 799, "Electronics", 50));
        products.add(new Product(110, "Keyboard", 1499, "Electronics", 30));
        products.add(new Product(103, "Shoes", 2999, "Footwear", 20));
        products.add(new Product(107, "Mobile", 25000, "Electronics", 15));
        products.add(new Product(102, "Book", 499, "Education", 100));
        products.add(new Product(108, "Headphones", 1999, "Electronics", 25));
        products.add(new Product(104, "T-Shirt", 899, "Clothing", 40));
        products.add(new Product(106, "Refrigerator", 32000, "Appliances", 5));
        products.add(new Product(109, "Washing Machine", 28000, "Appliances", 8));

        // Display
        System.out.println("Products:");
        products.forEach(System.out::println);
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(11);
        tset.add(16);
        tset.add(99);
        tset.add(88);
        System.out.println(tset);
        Set<Integer> set = tset.descendingSet();
        System.out.println(set);
        
        
        System.out.println(tset.ceiling(15));
        System.out.println(tset.floor(15));
        System.out.println(tset.lower(15));
        System.out.println(tset.higher(15));
        
        
        
        
        
        
    }
}