package com.bridgelabz.UserRegistrationUsingRegex;

import java.util.Scanner;

public class UserRegistration {
	Scanner scan = new Scanner(System.in);

	// Checking First Name Using Regex
	public void firstName() {
		System.out.println("Enter First Name: ");
		String firstName = scan.next();
		System.out.println(firstName.matches(("^[A-Z]{1}[a-z]{2,}$")));
	}

	// Checking Last Name Using Regex
	public void lastName() {
		System.out.println("Enter Last Name: ");
		String lastName = scan.next();
		System.out.println(lastName.matches(("^[A-Z]{1}[a-z]{2,}$")));
	}

	// Checking Email Address Using Regex
	public void emailAddress() {
		System.out.println("Enter your Email Address: ");
		String emailAddress = scan.next();
		System.out.println(emailAddress.matches("[A-Za-z0-9.+_%-]+@[A-Za-z0-9.-]+.[a-zA-Z]{2,4}"));
	}

	// Checking Mobile Number Using Regex
	public void mobileNumber() {
		System.out.println("Enter your Mobile Number: ");
		String mobileNumber = scan.next();
		System.out.println(mobileNumber.matches("^[0-9]{2}[-][0-9]{10}"));
	}

	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Welcome to User Registration Program.");
		UserRegistration object = new UserRegistration();
		object.firstName();
		object.lastName();
		object.emailAddress();
		object.mobileNumber();

	}

}
