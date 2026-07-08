package com.coforge.Day_07_07_26_prj;
import java.util.*;
//import java.util.function.Consumer;
public class ConsumerApp {
	public static void main(String[] arg) {
		Integer arr[] = {1,2,3,4,5,6};
		List<Integer> list = Arrays.asList(arr);
//		Consumer<Integer> consumer =(ele)->System.out.println(ele);
		list.forEach((ele)->System.out.println(ele));
		
	}

}
