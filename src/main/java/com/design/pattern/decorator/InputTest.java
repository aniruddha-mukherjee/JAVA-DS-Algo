package com.design.pattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		try{
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("text.txt")));
			while((c=in.read()) >=0)
				System.out.print((char)c);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
