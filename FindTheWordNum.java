package edu.umass;

public class FindTheWordNum{

	public String getWord(String sentence,int input){

		String[] word = sentence.split(" ");
		return word[input-1]; 
	}
}
