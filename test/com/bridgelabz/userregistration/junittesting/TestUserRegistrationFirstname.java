package com.bridgelabz.userregistration.junittesting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.bridgelabz.userregistration.UserRegistration;
import com.bridgelabz.userregistration.exceptions.UserRegistrationException;

@RunWith(Parameterized.class)
public class TestUserRegistrationFirstname {

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

	public TestUserRegistrationFirstname(String input, boolean expected) {
		super();
		this.input = input;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Collection firstNameInputs() {
		return Arrays.asList(new Object[][] {{"Rekha", true},
			{"Re", false},{"rekha", false},{"rEKHA", false}});
	}
	
	@Test
	public void testFirstName_thenAssertionHappyIfPassAndAssertionSadIfFail() {
		try {
			assertTrue(user.validFirstName(input));
			System.out.println("Valid First Name");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}
}

