package com.bridgelabz.moodanalyser.junittesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestingMoodAnalyserWithMessageAsParameterToConstructor.class,
		TestingMoodAnalyserWithMessageAsParametertoMethod.class })
public class AllTests {

}
