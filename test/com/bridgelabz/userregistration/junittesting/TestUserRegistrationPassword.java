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
public class TestUserRegistrationPassword {
	
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

	public TestUserRegistrationPassword(String input, Boolean expected) {
		this.input = input;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Collection passwordInputs() {
		return Arrays.asList(new Object[][] {{"Surekha@7", true},{"surekha@Sai7", true},{"surekha@7", false},{"SUREKHA@7", true},
			{"SuRekha@7sai", true},{"Surekha7", false}});
	}

	@Test
	public void testMobileNumber_thenAssertionHappyIfPassAndAssertionSadIfFail() {
		try {
			assertTrue(user.validPassword(input));
			System.out.println("Valid Password");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

}
