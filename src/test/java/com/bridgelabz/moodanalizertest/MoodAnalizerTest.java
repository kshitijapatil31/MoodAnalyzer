package com.bridgelabz.moodanalizertest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.moodanalizer.ExceptionType;
import com.bridgelabz.moodanalizer.MoodAnalizer;
import com.bridgelabz.moodanalizer.MoodAnalyzerException;

public class MoodAnalizerTest {


	@Test
	public void givenMobile_whenEmpty_shouldThrowException() {
		MoodAnalizer moodAnalizer=new MoodAnalizer();
		String mood;
		try {
			mood=moodAnalizer.analyseMood("");
		}catch(MoodAnalyzerException e) {
			assertEquals(ExceptionType.NOT_EMPTY,e.exceptionType);
			
		}
	}
	
	@Test
	public void givenMobile_whenNull_shouldThrowException() {
		MoodAnalizer moodAnalizer=new MoodAnalizer();
		String mood;
		try {
			mood=moodAnalizer.analyseMood(null);
		}catch(MoodAnalyzerException e) {
			assertEquals(ExceptionType.NOT_NULL,e.exceptionType);
			
		}
	}
}
