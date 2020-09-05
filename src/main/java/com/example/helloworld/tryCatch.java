package com.example.helloworld;

import java.io.IOException;

public class tryCatch {
	public static String testTryCatch(){
		try {

			System.out.println("testTryCatch");
			//throw new Exception();

		} catch (IndexOutOfBoundsException e) {
			System.err.println("IndexOutOfBoundsException: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Caught IOException: " + e.getMessage());
			return "exception";
		} finally {
			return "finally";
		}
	}
}
