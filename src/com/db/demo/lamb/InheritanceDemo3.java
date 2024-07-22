package com.db.demo.lamb;

//How to "use" abstract methods from an interface? 

//solution 3 - use lambda method / lamba expression - 
// - applicable to interface with only one abstract method 
// -- == functional interface 

public class InheritanceDemo3 {

	public static void main(String[] args) {

		Maths maths = (int i, int j) -> {
			return i + j;
		};

		int sum = maths.addNums(10, 20);

		System.out.println(sum);
	}
}

interface Maths {

	public abstract int addNums(int i, int j);
}

//// How to "use" abstract methods from an interface? 
//
//// solution 2 - create anonymous inner class 
//
//public class InheritanceDemo3 {
//
//	public static void main(String[] args) {
//
////		Maths maths = new Maths();
////		Maths maths = new Maths { } ();
//		Maths maths = new Maths() {
//			@Override
//			public int subNums(int i, int j) {
//				return i + j;
//			}
//			@Override
//			public int addNums(int i, int j) {
//				return i - j;
//			}
//		};
//
//		maths.addNums(10, 20);
//		maths.subNums(10, 20);
//
////		System.out.println(calc.addNums(10, 20));
////		System.out.println(calc.subNums(10, 20));
//	}
//}
//
//interface Maths {
//
//	public abstract int addNums(int i, int j);
//
//	public abstract int subNums(int i, int j);
//}

//package com.db.demo.lamb;
//
//// How to "use" abstract methods from an interface? 
//
//// solution 1 - let a concrete class implement it , 
//// and then create object of that class and call those methods 
//
//public class InheritanceDemo3 {
//
//	public static void main(String[] args) {
//
//		Calc calc = new Calc();
//		System.out.println(calc.addNums(10, 20));
//		System.out.println(calc.subNums(10, 20));
//	}
//}
//
//interface Maths {
//
//	public abstract int addNums(int i, int j);
//
//	public abstract int subNums(int i, int j);
//}
//
//class Calc implements Maths {
//
//	@Override
//	public int addNums(int i, int j) {
//		return i + j;
//	}
//
//	@Override
//	public int subNums(int i, int j) {
//		return i - j;
//	}
//}