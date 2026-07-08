package com.coforge.Day_07_07_26_prj;

public class App {
	public static void div(int a , int  b) {
		if(b==0) {
			throw new ArithmeticException();
		}
		else {
			System.out.print(a/b);
		}
	}
    public static void main(String[] args) {
    	  div(5,0);
    	

//        int a = 71;
//        int[] b = null;   
//        int c = 0;
//
//        try {
//            c = a / b[0];  
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Arithmetic Exception");
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array Index Out Of Bounds Exception");
//        }
//        catch (NullPointerException e) {
//            System.out.println("Null Pointer Exception");
//            e.printStackTrace();
//        }
//        catch (RuntimeException e) {
//            System.out.println("Runtime Exception");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        finally {
//        	System.out.println("After try Catch");
//        }
    	
    }
}