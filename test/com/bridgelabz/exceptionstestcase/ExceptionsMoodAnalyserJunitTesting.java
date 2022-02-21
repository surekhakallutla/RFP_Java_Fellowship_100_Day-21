package com.bridgelabz.exceptionstestcase;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExceptionsMoodAnalyserJunitTesting {

	@Test
	public void testMoodAnalyser() {
		MoodAnalyser analyser = new MoodAnalyser();
		
		assertEquals("happy", analyser.analyseMood("happy"));
		assertEquals("sad", analyser.analyseMood("sad"));
		assertEquals("happy", analyser.analyseMood(null));
		assertEquals("happy", analyser.analyseMood(""));
	}

}
