package com.bridgelabz.moodanalyser.junittesting;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.exception.MoodAnalysisException;
import com.bridgelabz.userregistration.UserRegistration;

import junit.framework.Assert;

public class TestingMoodAnalyserWithNoParameters {
	
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
	public void testSadMoodAnalyserWhenMessageisNotPassedAsParameter_ThenAssertionSuccess() {
		try {
			String mood = moodAnalyser.analyseMood();
			Assert.assertEquals(mood, "SAD");
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testHappyMoodAnalyserWhenMessageisNotPassedAsParameter_ThenAssertionSuccess() {
		try {
			String mood = moodAnalyser.analyseMood();
			Assert.assertEquals(mood, "HAPPY");
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testHapppyMoodAnalyserWhenNULLMessageisNotPassedAsParameter_ThenAssertionSuccess() {
		try {
			String mood = moodAnalyser.analyseMood();
			Assert.assertEquals(mood, "HAPPY");
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testSadMoodAnalyserWhenEmptyMessageisNotPassedAsParameter_ThenAssertionSuccess() {
		try {
			String mood = moodAnalyser.analyseMood();
			Assert.assertEquals(mood, "SAD");
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
