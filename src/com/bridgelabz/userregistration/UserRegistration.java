package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

import com.bridgelabz.userregistration.exceptions.UserRegistrationException;
import com.bridgelabz.userregistration.regularexpressions.ConstantRegEx;

public class UserRegistration {

	public boolean validFirstName(String fName)throws UserRegistrationException {
		if(Pattern.matches(ConstantRegEx.FIRST_NAME_REGEX, fName)) 
			return true;
		else
			throw new UserRegistrationException("Invalid First Name");
	}

	public boolean validLastName(String lName)throws UserRegistrationException {
		if(Pattern.matches(ConstantRegEx.LAST_NAME_REGEX, lName))
			return true;
		else
			throw new UserRegistrationException("Invalid Last Name");
	}

	public boolean validEmail(String eMail)throws UserRegistrationException {
		if(Pattern.matches(ConstantRegEx.USER_EMAIL_REGEX, eMail))
			return true;
		else
			throw new UserRegistrationException("Invalid Email Id");
	}

	public boolean validMobileNumber(String mobileNumber) throws UserRegistrationException {
		if(Pattern.matches(ConstantRegEx.MOBILE_NUMBER_REGEX, mobileNumber))
			return true;
		else
			throw new UserRegistrationException("Invalid Mobile Number");
	}

	public boolean validPassword(String password)throws UserRegistrationException {
		if(Pattern.matches(ConstantRegEx.PASSWORD_REGEX, password))
			return true;
		else
			throw new UserRegistrationException("Invalid Password");
	}
	
}
