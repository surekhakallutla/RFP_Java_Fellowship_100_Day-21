package com.bridgelabz.moodanalyser.junittesting;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.exception.MoodAnalysisException;

import junit.framework.Assert;

public class TestingMoodAnalyserWithMessageAsParametertoMethod {

	private static MoodAnalyser moodAnalyser;
	
	@BeforeClass
	public static void createMoodAnalyserObj() {
		moodAnalyser = new MoodAnalyser();
	}
	
	@AfterClass
	public static void nullObj() {
		moodAnalyser = null;
	}

	@Test
	public void testHappyMoodAnalyserWhenMessageisPassedAsParameterToMethod_ThenAssertionSucesss() {
		try {
			String mood = moodAnalyser.analyseMood("This is Any Mood");
			Assert.assertEquals(mood, "HAPPY");
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testSadMoodAnalyserWhenMessageisPassedAsParameterToMethod_ThenAssertionSuccess() {
		try {
			String mood = moodAnalyser.analyseMood("This is Sad Mood");
			Assert.assertEquals(mood, "SAD");
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testInvalidNULLMoodWhenMessageIsPassedAsParameterToMethod_ThenAssertionSuccess() {
		try {
			String mood = moodAnalyser.analyseMood(null);
			Assert.assertEquals(mood, "HAPPY");
		}
		catch (NullPointerException e) {
			System.out.println("Invalid Null Mood"); 
		}
		catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testInvalidEmptyMoodWhenMessageIsPassedAsParameterToMethod_ThenAssertionSuccess() {
		try {		
			String mood = moodAnalyser.analyseMood();
			Assert.assertEquals(mood, "SAD");
		}
		catch (NullPointerException e) {
			System.out.println("Invalid Empty Mood"); 
		}
		catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
	
		
}

