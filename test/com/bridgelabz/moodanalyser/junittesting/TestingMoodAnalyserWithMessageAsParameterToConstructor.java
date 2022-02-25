package com.bridgelabz.moodanalyser.junittesting;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.exception.MoodAnalysisException;
import com.bridgelabz.userregistration.UserRegistration;

import junit.framework.Assert;

public class TestingMoodAnalyserWithMessageAsParameterToConstructor {
		
	@Test
	public void testSadMoodAnalyserWhenMessagePassedAsParametertoConstructor_ThenAssertionSuccess() throws MoodAnalysisException {
		String mood = new MoodAnalyser("I am in Sad Mood").analyseMood();
		Assert.assertEquals(mood, "SAD");
	}
	
	@Test
	public void testHappyMoodAnalyserWhenMessageisPassedAsParametertoConstructor_ThenAssertionSuccess() throws MoodAnalysisException {
		String mood =new MoodAnalyser("I am in Any Mood").analyseMood();
		Assert.assertEquals(mood, "HAPPY");
	}
		
	@Test
	public void testInvalidNullMoodWhenMessageisPassedAsParametertoConstructor_ThenAssertionSuccess() throws MoodAnalysisException{
		try {	
			String mood = new MoodAnalyser(null).analyseMood();
			Assert.assertEquals(mood,"HAPPY");
		}
		catch (NullPointerException e) {
			System.out.println("Invalid Null Mood"); 
		}
		catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testInvalidEmptyMoodWhenMessageisPassedAsParametertoConstructor_ThenAssertionSuccess() throws MoodAnalysisException{
		try {
			String mood = new MoodAnalyser().analyseMood();
			Assert.assertEquals(mood,"SAD");
		}
		catch (NullPointerException e) {
			System.out.println("Invalid Empty Mood"); 
		}
		catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
}
