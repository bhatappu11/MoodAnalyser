package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad(){
		MoodAnalyser moodAnalyzer = new MoodAnalyser();
		String mood = moodAnalyzer.analyseMood("This is a sad message");
		Assert.assertEquals("SAD",mood);
	}
	
}