package com.bridgelabz.moodanalizer;

public class MoodAnalizer {

	public String analyseMood (String msg) {
		try {
		if(msg.contains("I am in any mood")) {
			return "happy";
		}
		return "sad";
		}catch(NullPointerException e) {
			return "happy";
		
		}
	}

}
