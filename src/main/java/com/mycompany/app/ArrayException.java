package com.mycompany.app;

public class ArrayException {

	public static void main(String[] args) {
		
		int[] intArr = new int[3];
		
		try {
			System.out.println(intArr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Array failed");
		}
		
		System.out.println("After try catch");
		
		

	}

}
