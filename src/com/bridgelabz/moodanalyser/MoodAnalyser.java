package com.bridgelabz.moodanalyser;

import java.awt.TrayIcon.MessageType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import com.bridgelabz.moodanalyser.exception.MoodAnalysisException;

public class MoodAnalyser {
	public String message;
	
	enum MessageType {
		NULL, EMPTY;
	}
	
	public MoodAnalyser() {
		
	}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String Message to Check the Mood");
		String message = scn.nextLine();		
//		String message = "I am in Happy Mood";
//		String message = "This is Sad Mood";
		if(message.contains("Sad") || message.isEmpty()) {
			System.out.println("SAD");
			return "SAD";
		}	
		else {
			System.out.println("HAPPY");
			return "HAPPY";
		}
	}
	
	public String analyseMood(String message) throws MoodAnalysisException {
		if(message.contains("Sad") || message.isEmpty()) {
			System.out.println("SAD");
			return "SAD";
		}
		else {
			System.out.println("HAPPY");
			return "HAPPY";
		}
	}

}
