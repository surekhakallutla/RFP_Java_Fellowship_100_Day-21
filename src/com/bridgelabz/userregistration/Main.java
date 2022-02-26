package com.bridgelabz.userregistration;

import java.util.Scanner;

import com.bridgelabz.userregistration.exceptions.UserRegistrationException;

public class Main {

	public static void main(String[] args) throws UserRegistrationException {
		UserRegistration userRegistration = new UserRegistration();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter First Name");
		String fName = scn.next();
		userRegistration.validFirstName(fName);
		System.out.println("Enter Last Name");
		String lName = scn.next();
		userRegistration.validLastName(lName);
		System.out.println("Enter Mobile Number Name");
		String mobileNumber = scn.next();
		userRegistration.validMobileNumber(mobileNumber);
		System.out.println("Enter Email ");
		String eMail = scn.next();
		userRegistration.validEmail(eMail);
		System.out.println("Enter Password");
		String password = scn.next();
		userRegistration.validPassword(password);
				

	}

}
