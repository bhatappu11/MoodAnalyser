package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in sad mood");
		String mood = null ;
		try {
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals("SAD",mood);
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void givenMessage_WhenPassedNull_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void givenMessage_WhenPassedEmpty_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
			System.out.println(e.getMessage());
		}
	}
	
}