package com.db.demo.lamb;

public class LambDemo {

	public static void main(String[] args) {

//		MathDemo mathDemo = (int i) -> { return i + 10; };
//		MathDemo mathDemo = (int i) -> i + 10;
		MathDemo mathDemo = i -> i + 10;

		int sum = mathDemo.addNums(10);

		System.out.println(sum);
	}
}

@FunctionalInterface
interface MathDemo {

	public abstract int addNums(int i);

//	public abstract int subNums(int i);
}

