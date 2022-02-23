package com.bridgelabz.userregistration.junittesting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.bridgelabz.userregistration.UserRegistration;
import com.bridgelabz.userregistration.exceptions.UserRegistrationException;

@RunWith(Parameterized.class)
public class TestUserRegistrationMobileNumber {

	private static UserRegistration user;
	private String input;
	private Boolean expected;
	
	@BeforeClass
	public static void createUserRegistrationObj() {
		user = new UserRegistration();

	}
	
	@AfterClass
	public static void nullObj() {
		user = null;
	}

	public TestUserRegistrationMobileNumber(String input, Boolean expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection mobileNumberInputs() {
		return Arrays.asList(new Object[][] {{"+91 9108279011", true},{"91 9108279011", true},{"1082790111", false},{"91082790", false},
			{"91082 79011", true},{"516360", false},{"9108279011", true},{"0102348", false}});
	}
	
	@Test
	public void testMobileNumber_thenAssertionHappyIfPassAndAssertionSadIfFail() {
		try {
			assertTrue(user.validMobileNumber(input));
			System.out.println("Valid Mobile Number");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}
}
