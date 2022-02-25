package com.bridgelabz.moodanalyser.exception;

public class MoodAnalysisException extends Exception {
	public enum MessageType {
		NULL,EMPTY
	}
	
	public MoodAnalysisException(MessageType message) {
		super(message.name());
	}
		
}
