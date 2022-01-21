package com.mycompany.app;

import java.io.IOException;

import javax.imageio.IIOException;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 0;
		int result = 100;
		
		try {
			// Try this. If works then fine. But if fails, then move to catch clause
			result = a / b;
		} catch (ArithmeticException e) {
			// Caught the exception
			System.out.println("ERROR: Cannot devide");
			// Write into log file
			e.printStackTrace();
		} finally {
			System.out.println("Finally is execeted");
		}
		
		System.out.println(result);
		System.out.println("After the results");

	}

}
