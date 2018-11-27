package com.vidvaan.exception;


public class TestExceptions {
	static void inValidAge(int age) throws InvalidAge {
		if (age<18) {
			throw  new InvalidAge("valid for voting");
		}
				else {
					System.out.println("invalid for voting");
				}
	
			
			
		}
	public static void main(String[] args) {
		try {
			inValidAge(13);
		} catch (InvalidAge e) {
		
			e.printStackTrace();
			System.out.println("Exception occured"+e);
		}
	}
	}


