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

	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Welcome to User Registration Program.");
		UserRegistration object = new UserRegistration();
		object.firstName();

	}

}
