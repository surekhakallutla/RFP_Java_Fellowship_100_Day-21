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
public class TestUserRegistrationLastName {

	private static UserRegistration user;
	private String input;
	private boolean expected;
	
	@BeforeClass
	public static void createUserRegistrationObj() {
		user = new UserRegistration();
	}
	
	@AfterClass
	public static void nullObj() {
		user = null;
	}

	public TestUserRegistrationLastName(String input, boolean expected) {
		super();
		this.input = input;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Collection lastNameInputs() {
		return Arrays.asList(new Object[][] {{"Rekha", true},
			{"Re", false},{"rekha", false},{"rEKHA", false}});
	}
	
	@Test
	public void testLastName_thenAssertionHappyIfPassAndAssertionSadIfFail() {
		try {
			assertTrue(user.validLastName(input));
			System.out.println("Valid Last Name");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}
}


