package com.bridgelabz.moodanalizer;

public class MoodAnalizer {

	public String analyseMood (String msg) {
		if(msg.contains("I am in happy mood")) {
			return "happy";
		}
		return "sad";
	}

}
