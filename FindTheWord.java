package edu.umass;

public class FindTheWord{

	public String getWord(String sentence){

		int backIndex = sentence.lastIndexOf(" ");	
		int firstIndex = sentence.substring(0,backIndex).lastIndexOf(" ");
		
		return sentence.substring(firstIndex+1,backIndex);
	}
}
