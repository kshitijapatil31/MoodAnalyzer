package com.bridgelabz.moodanalizer;



public class MoodAnalizer {

	public String analyseMood (String msg) throws MoodAnalyzerException {
		try {
		if(msg.contains("I am in any mood")) {
			return "happy";
		}
		return "sad";
		}catch(NullPointerException e) {
			throw new MoodAnalyzerException("Mood cannot be null");
		}
	}
	

}
