package com.db.demo.fun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FunDemo {

	public static void main(String[] args) {

//		ArrayList<String> myList = new ArrayList<>();
		List<String> myList = new ArrayList<>();
//		myList = new LinkedList<>();

		myList.addAll(Arrays.asList("Sonu", "Monu", "Tonu", "Soni", "Ponu"));

//		System.out.println("Extract list elements with for loop:");
//		for (int i = 0; i < myList.size(); i++)
//			System.out.println(myList.get(i));

		System.out.println("Extract list elements with forEach method:");
//		myList.forEach(() -> {});
//		myList.forEach((elem) -> { System.out.println(elem); });
		myList.forEach(elem ->  System.out.println(elem) );

	}

}
