package com.vidvaan.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ArthematicExceptionEx {
	public void m1() {
		System.out.println("i am method m1 ");
	}
	public void m2() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("d:\\");
		m1();
		System.out.println("i am method m2 ");
	}
	
}
