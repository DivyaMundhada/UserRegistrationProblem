package com.bridgelabz.UserRegistrationUsingRegex;

import java.util.Scanner;

public class UserRegistration {
	Scanner scan = new Scanner(System.in);

	// Checking First Name Using Regex

	public boolean firstName() {
		System.out.println("Enter First Name: ");
		String firstName = scan.next();
		boolean result = firstName.matches(("^[A-Z]{1}[a-z]{2,}$"));
		return result;
	}

	// Checking Last Name Using Regex
	public boolean lastName() {
		System.out.println("Enter Last Name: ");
		String lastName = scan.next();
		boolean result = lastName.matches(("^[A-Z]{1}[a-z]{2,}$"));
		return result;
	}

	// Checking Email Address Using Regex
	public boolean emailAddress() {
		System.out.println("Enter your Email Address: ");
		String emailAddress = scan.next();
		boolean result = emailAddress.matches("[A-Za-z0-9.+_%-]+@[A-Za-z0-9.-]+.[a-zA-Z]{2,4}");
		return result;
	}

	// Checking Mobile Number Using Regex
	public boolean mobileNumber() {
		System.out.println("Enter your Mobile Number: ");
		String mobileNumber = scan.next();
		boolean result = mobileNumber.matches("^[91]{2}[-][0-9]{10}");
		return result;
	}

	// Checking Password with Rule 1 - Minimum 8 Characters
	// Checking Password with Rule 2 - At least 1 Upper Case
	// Checking Password with Rule 3 - At least 1 Numeric Character
	// Checking Password with Rule 4 - Exactly 1 Special Character
	public boolean passWord() {
		System.out.println("Enter your password: ");
		String passWord = scan.next();
		boolean result = passWord.matches(
				"(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=^[^!@#$%^&*]*[!@#$%^&*][^!@#$%^&*]*$)[a-zA-Z0-9!@#$%^&*]{8,}");
		return result;
	}

	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Welcome to User Registration Program.");

	}

}
