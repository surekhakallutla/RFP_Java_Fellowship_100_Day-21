package com.bridgelabz.moodanalyser;

import java.awt.TrayIcon.MessageType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import com.bridgelabz.moodanalyser.exception.MoodAnalysisException;

public class MoodAnalyser {
	public String message;
		
	public MoodAnalyser() {
		
	}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		if(message.contains("Sad")) {
			System.out.println("SAD");
			return "SAD";
		}
		else {
			System.out.println("HAPPY");
			return "HAPPY";
		}
		
	}
	
	public String analyseMood(String message) throws MoodAnalysisException {
		if(message.contains("Sad")) {
			System.out.println("SAD");
			return "SAD";
		}
		else {
			System.out.println("HAPPY");
			return "HAPPY";
		}
	}

}
