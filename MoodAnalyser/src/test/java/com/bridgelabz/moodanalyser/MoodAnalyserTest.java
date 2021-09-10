package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad(){
		MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a sad message");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("SAD",mood);
	}
	
	
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMessage_WhenPassedNothing_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	
}