package com.db.demo.col;

import java.util.ArrayList;

// Collection Framework 

public class ColDemo {

	public static void main(String[] args) {

		ArrayList myFriends = new ArrayList();
		
		System.out.println(myFriends);
		System.out.println(myFriends.size());
		myFriends.add("Sonu");
		myFriends.add("Monu");
		myFriends.add("Tonu");
		System.out.println(myFriends);
		System.out.println(myFriends.size());
		myFriends.remove(1);
		System.out.println(myFriends);
		System.out.println(myFriends.size());
//		myFriends.

//		String[] myFriends2 = { "Sonu", "Monu", "Tonu" }; // "Ponu"
//		myFriends2.

//		System.out.println("Extract array elements using for loop:");
//		System.out.println("Extract array elements using for-each loop:");

	}

}

//package com.db.demo.col;
//
//// Collection Framework 
//
//public class ColDemo {
//
//	public static void main(String[] args) {
//
//		String[] myFrields = { "Sonu", "Monu", "Tonu" }; // "Ponu"
//
//		System.out.println("Extract array elements using for loop:");
//		for (int i = 0; i < myFrields.length; i++) {
//			System.out.println(myFrields[i]);
//		}
//
//		System.out.println("Extract array elements using for-each loop:");
//		for (String frind : myFrields) {
//			System.out.println(frind);
//		}
//	}
//
//}
//
////package com.db.demo.col;
////
////import com.db.demo.model.Employee;
////
////// Collection Framework 
////
////public class ColDemo {
////
////	public static void main(String[] args) {
////
////		int num = 10;
////		long phone = 9876543210L;
//////		phone.
////
////		Employee employee = new Employee();
//////		employee.
////
////	}
////
////}
