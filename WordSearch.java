package edu.umass;

public class WordSearch{


	public boolean startsWith(String sentence,String input){

		return input.equals(sentence.substring(0,sentence.indexOf(" ")));
	}

	public int noOfTimes(String sentence,String input){

		int counter =0;
		String[] words = sentence.split(" ");
		for(int i=0;i<words.length;i++){

			if(input.equals(words[i])){

				counter++;
			}
		}


		return counter;
	}
}
