package com.bridgelabz.UserRegistrationUsingRegex;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration object = new UserRegistration();

	@Test
	public void validatingFirstName() {
		Assert.assertTrue(object.firstName());
	}

	@Test
	public void validatingLastName() {
		Assert.assertTrue(object.lastName());
	}

	@Test
	public void validatingEmail() {
		Assert.assertTrue(object.emailAddress());
	}

	@Test
	public void validatingMobileNumber() {
		Assert.assertTrue(object.mobileNumber());
	}

	@Test
	public void validatingPassWord() {
		Assert.assertTrue(object.passWord());
	}
}
