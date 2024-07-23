package com.db.demo.fun;

import java.util.*;

public class FunDemo {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<>();

		myList.addAll(Arrays.asList("Sonu", "Monu", "Tonu", "Soni", "Ponu"));

//		System.out.println("Extract list elements with forEach method:");
//		myList.forEach(elem ->  System.out.println(elem) );

//		System.out.println("Print names starting with 'S' with for and if:");
//		for (int i = 0; i < myList.size(); i++) {
//			if (myList.get(i).startsWith("S")) {
//				System.out.println(myList.get(i));
//			}
//		}
		System.out.println("Print names starting with 'S' with stream API:");
		myList.stream().filter( name -> name.startsWith("S")).forEach(name -> System.out.println(name));

		System.out.println("Create another list with names starting with 'S' with stream API:");
		List<String> listS =  myList.stream().filter( name -> name.startsWith("S")).toList(); 		
		listS.forEach(name -> System.out.println(name) );
		
		System.out.println("Print only the first three names with stream API:");
		myList.stream().limit(3).forEach(name -> System.out.println(name));

		System.out.println("Skip the first two names with stream API:");
		myList.stream().skip(2).forEach(name -> System.out.println(name));
	}

}

//package com.db.demo.fun;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
//public class FunDemo {
//
//	public static void main(String[] args) {
//
////		ArrayList<String> myList = new ArrayList<>();
//		List<String> myList = new ArrayList<>();
////		myList = new LinkedList<>();
//
//		myList.addAll(Arrays.asList("Sonu", "Monu", "Tonu", "Soni", "Ponu"));
//
////		System.out.println("Extract list elements with for loop:");
////		for (int i = 0; i < myList.size(); i++)
////			System.out.println(myList.get(i));
//
//		System.out.println("Extract list elements with forEach method:");
////		myList.forEach(() -> {});
////		myList.forEach((elem) -> { System.out.println(elem); });
//		myList.forEach(elem ->  System.out.println(elem) );
//
//	}
//
//}
