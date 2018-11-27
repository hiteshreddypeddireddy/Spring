package com.vidvaan.exception;

public class StudentManager {
	public static String StudentId(String studentId) throws StudentNotFoundException {
		if (studentId.equals("1234")) {

			System.out.println("find with id " + studentId);
		} else {
			throw new StudentNotFoundException("Could Not Find With Id " + studentId);
		}

		return studentId;

	}

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		try {
			manager.StudentId("324643");
		} catch (StudentNotFoundException e) {
			e.getCause();
		}
	}

}
