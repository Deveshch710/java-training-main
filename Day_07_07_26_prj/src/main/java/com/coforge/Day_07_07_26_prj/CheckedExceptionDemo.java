package com.coforge.Day_07_07_26_prj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionDemo {

    
    public static void readFile() throws FileNotFoundException {

        File file = new File("data.txt");

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }

    public static void main(String[] args) {

        try {
            readFile();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }

        System.out.println("Program Ended.");
    }
}