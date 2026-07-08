package com.coforge.Day_07_07_26_prj;

public class CustomExceptionDemo {

    public static void main(String[] args) throws AgeNotSufficientException {

        Person p = new Person("Ankush", 22, "Delhi");

        if (p.getAge() < 18) {
            throw new AgeNotSufficientException("Person age is less than 18.");
        } else {
            System.out.println("Person is eligible to cast vote.");
        }

    }

}