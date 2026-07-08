package com.coforge.Day_07_07_26_prj;

public class ClassNotFoundExceptionDemo {

    public static void main(String[] args) {

        try {
           
            Class.forName("com.coforge.Day_07_07_26_prj.Employee");

            System.out.println("Class Found");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class Not Found!");
            e.printStackTrace();
        }

        System.out.println("Program Ended");
    }
}