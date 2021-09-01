package com.bridgelabz.moodanalizertest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.moodanalizer.MoodAnalizer;




public class MoodAnalizerTest {

	
	
	@Test
	public void givenMood_whenhappy_shouldReturnHappy() {
		MoodAnalizer moodAnalizer=new MoodAnalizer();
		
		String mood=moodAnalizer.analyseMood(null);
		
			assertEquals("happy",mood);
		
			
	}
}
