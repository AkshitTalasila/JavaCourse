package edu.umass;

public class Panagram{

	public boolean checker(String sentence){

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<alphabet.length();i++){

			if(!sentence.contains(alphabet.substring(i,i+1))){

				return false;
			}
		}

		return true;
	}
}
