package com.bridgelabz.moodanalizer;



public class MoodAnalizer {

	public String analyseMood (String msg) throws MoodAnalyzerException {
		try {
			if(msg.length()<=0) {
				throw new MoodAnalyzerException("Mood cannot be empty",ExceptionType.NOT_EMPTY);
				
			}
		if(msg.contains("I am in any mood")) {
			return "happy";
		}
		return "sad";
		}catch(NullPointerException e) {
			throw new MoodAnalyzerException("Mood cannot be null",ExceptionType.NOT_NULL);
		}
	}
	

}
