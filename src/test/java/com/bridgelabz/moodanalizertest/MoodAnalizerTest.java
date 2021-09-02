package com.bridgelabz.moodanalizertest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.moodanalizer.MoodAnalizer;
import com.bridgelabz.moodanalizer.MoodAnalyzerException;


public class MoodAnalizerTest {

	@Test
	public void givenMobile_whenNull_shouldThrowException() {
		MoodAnalizer moodAnalizer=new MoodAnalizer();
		String mood;
		try {
			mood=moodAnalizer.analyseMood(null);
		}catch(MoodAnalyzerException e) {
			assertEquals("Mood cannot be null",e.getMessage());
			
		}
	}
}
