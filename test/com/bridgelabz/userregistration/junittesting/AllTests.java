package com.bridgelabz.userregistration.junittesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestUserRegistrationEmail.class, TestUserRegistrationFirstname.class,
		TestUserRegistrationLastName.class, TestUserRegistrationMobileNumber.class,
		TestUserRegistrationPassword.class })
public class AllTests {

}
