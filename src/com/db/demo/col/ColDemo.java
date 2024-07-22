package com.db.demo.col;

// Collection Framework 

public class ColDemo {

	public static void main(String[] args) {

		String[] myFrields = { "Sonu", "Monu", "Tonu" };

		System.out.println("Extract array elements using for loop:");
		for (int i = 0; i < myFrields.length; i++) {
			System.out.println(myFrields[i]);
		}

		System.out.println("Extract array elements using for-each loop:");
		for (String frind : myFrields) {
			System.out.println(frind);
		}
	}

}

//package com.db.demo.col;
//
//import com.db.demo.model.Employee;
//
//// Collection Framework 
//
//public class ColDemo {
//
//	public static void main(String[] args) {
//
//		int num = 10;
//		long phone = 9876543210L;
////		phone.
//
//		Employee employee = new Employee();
////		employee.
//
//	}
//
//}
