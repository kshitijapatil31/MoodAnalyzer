package com.bridgelabz.moodanalizer;

public class MoodAnalyzerException extends Exception{

	public ExceptionType exceptionType;

	//public exceptionType;
	public MoodAnalyzerException(String exceptionMsg, ExceptionType exceptionType) {
		super(exceptionMsg);
		this.exceptionType=exceptionType;
	}
}
