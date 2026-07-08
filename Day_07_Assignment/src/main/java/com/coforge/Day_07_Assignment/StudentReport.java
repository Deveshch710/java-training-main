package com.coforge.Day_07_Assignment;

public class StudentReport {
	public static int totalMarks(int[] marks) {

	    try {

	        for (int mark : marks) {
	            if (mark < 0 || mark > 100) {
	                throw new IllegalArgumentException("Marks should be between 0 and 100.");
	            }
	        }
     
	        return marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
//	        3. Array Index Out of Bound Exception
	    } catch (ArrayIndexOutOfBoundsException e) {

	        System.out.println("Marks for all 5 subjects are not available.");
	        return 0;
//			5. Illegal Argument Exception
	    } catch (IllegalArgumentException e) {

	        System.out.println(e.getMessage());
	        return 0;
	    }
	}
	public static int percentage(int[] marks) {
//		1. Arithmetic Exception Handling 
	    try {
	        int sum = 0;

	        for (int mark : marks) {
	            sum += mark;
	        }

	        return sum / marks.length;

	    } catch (ArithmeticException e) {
	        System.out.println("Cannot calculate percentage because no subjects are available.");
	        return 0;
	    }
	}
	public static void generateReport(Student student) {

		try {
		    int id = Integer.parseInt(student.getId());
		    System.out.println("ID         : " + id);
		} catch (NumberFormatException e) {
		    System.out.println("Invalid Student ID.");
		}
	    System.out.println("Name       : " + student.getName());
	    System.out.println("Branch     : " + student.getBranch());
	    System.out.println("Mobile     : " + student.getMobile());
	    try {
	        String branch = student.getBranch();

	        int index = branch.indexOf('-');

	        if (index == -1) {
	            throw new StringIndexOutOfBoundsException();
	        }

	        String subBranch = branch.substring(index + 1);

	        System.out.println("Branch     : " + branch);
	        System.out.println("Sub Branch : " + subBranch);
//        4. String Index Out of Bound Exception
	    } catch (StringIndexOutOfBoundsException e) {
	        System.out.println("Sub Branch is not available.");
	    }
	    // 2.Null Pointer Exception
//	    Note:- without method calling it does not show exception because null is valid 
	    try {
	        System.out.println("Email      : " + student.getEmail().toLowerCase());
	    } catch (NullPointerException e) {
	        System.out.println("Email is not available.");
	    }
	    System.out.println("Percentage  : " + totalMarks(student.getMarks()) + "%");
	    System.out.println("Percentage : " + percentage(student.getMarks()) + "%");
	    System.out.println("------------------------------------");
	}

    public static void main(String[] args) {
    	Student[] students = {

    		    // Arithmetic Exception
    		    new Student("101", "Aarav", new int[]{}, "9876543210", "aarav@gmail.com", "CSE-AI"),

    		    // Null Pointer Exception
    		    new Student("102", "Vivaan", new int[]{78, 82, 80, 76, 84}, "9876543211", null, "IT-DS"),

    		    // ArrayIndexOutOfBoundsException
    		    new Student("103", "Aditya", new int[]{91, 89, 94, 90}, "9876543212", "aditya@gmail.com", "ECE-AI"),

    		    // StringIndexOutOfBoundsException (No sub-branch)
    		    new Student("104", "Ishaan", new int[]{72, 75, 70, 74, 73}, "9876543213", "ishaan@gmail.com", "ECE"),
    		    
    		    // IllegalArgumentException (Marks > 100)
    		    new Student("106", "Ananya", new int[]{95, 96, 94, 97, 101}, "9876543215", "ananya@gmail.com", "IT-AI"),

    		    // Number Format Exception
    		    new Student("105A", "Krishna", new int[]{88, 85, 90, 87, 89}, "9876543214", "krishna@gmail.com", "CSE-DS"),

    		    // Normal Student
    		    new Student("107", "Diya", new int[]{65, 68, 70, 66, 69}, "9876543216", "diya@gmail.com", "EEE-DS")
    		};
    	
    	try {
    	    Object obj = students[6];

    	    String name = (String) obj;   // Wrong casting
    	    System.out.println(name);

    	} catch (ClassCastException e) {
    	    System.out.println("Cannot cast Student to String.");
    	}
//    	for (Student student : students) {
//    	    System.out.println(student);
//    	}
//    	generateReport(students[0]);  // 1.Show Arithmetic Exception
//    	generateReport(students[1]);  // 2.Null Pointer Exception 
//    	generateReport(students[2]);  // 3.ArrayIndexOutOfBound
//    	generateReport(students[3]);  // 4.StringIndexOutOfBound
//    	generateReport(students[4);   // 5.IllegalArguementException
//    	generateReport(students[5]);  // 6.NumberFormatException
    	
    	
    }
}