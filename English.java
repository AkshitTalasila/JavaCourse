package edu.umass;

public class English{

	public String counter(String sentence){

		String vowels ="aeiou";
		String consonants = "bcdfghjklmnpqrstvwxyz";
		int vowelCounter=0;
		int consonantCounter=0;
		sentence = sentence.toLowerCase();
		for(int i=0;i<sentence.length();i++){

			if(vowels.contains(sentence.substring(i,i+1))){
				
				vowelCounter++;
			}
			
			if(consonants.contains(sentence.substring(i,i+1))){

				consonantCounter++;
			}
		}


		return("Vowels: "+vowelCounter+" ,Consonants: "+consonantCounter);
		
	}
}
