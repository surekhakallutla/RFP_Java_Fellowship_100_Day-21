package com.bridgelabz.moodanalyser.junittesting;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.exception.MoodAnalysisException;

import junit.framework.Assert;

public class TestingMoodAnalyserWithMessageAsParameter {

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
	public void testHappyMoodAnalyserWhenMessageisPassedAsParameter_ThenAssertionSucesss() {
		try {
			String mood = moodAnalyser.analyseMood("This is Any Mood");
			Assert.assertEquals(mood, "HAPPY");
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testSadMoodAnalyserWhenMessageisPassedAsParameter_ThenAssertionSuccess() {
		try {
			String mood = moodAnalyser.analyseMood("This is Sad Mood");
			Assert.assertEquals(mood, "SAD");
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
		
	@Test
	public void testHapppyMoodAnalyserWhenNULLMessageisPassedAsParameter_ThenAssertionSuccess() {
		try {
			String mood = moodAnalyser.analyseMood("NULL");
			Assert.assertEquals(mood, "HAPPY");
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testSadMoodAnalyserWhenEmptyMessageisPassedAsParameter_ThenAssertionSuccess() {
		try {
			String mood = moodAnalyser.analyseMood("");
			Assert.assertEquals(mood, "SAD");
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.getMessage());
		}
	}
		
}

