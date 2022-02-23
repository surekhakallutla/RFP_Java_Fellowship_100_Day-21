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
public class TestUserRegistrationEmail {
	
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

	public TestUserRegistrationEmail(String input, boolean expected) {
		super();
		this.input = input;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Collection testEmailInputs() {
		return Arrays.asList(new Object[][] {{"abc@yahoo.com", true},{"abc-100@yahoo.com", true},
			{"abc", false},{"abc@.com.my", false},{"abc.100@yahoo.com", true},{"abc123@gmail.a", false},
			{"abc()*@gmail.com", false},{"abc..2001@gmail.com", false}});
	}
	
	@Test
	public void testEmail_thenAssertionHappyIfPassAndAssertionSadIfFail() {
		try {
			assertTrue(user.validEmail(input));
			System.out.println("Valid EMail Id");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

}
