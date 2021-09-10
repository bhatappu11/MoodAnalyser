package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad(){
		MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in sad mood");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("SAD",mood);
	}
	
	
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMessage_WhenPassedNothing_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMessage_WhenPassedNull_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	
}