package edu.umass;

public class Anagram{

	public boolean checker(String one,String two){

		for(int i=0;i<one.length();i++){

			if(!two.contains(one.substring(i,i+1))){
				
				return false;
			}
		}

		return true;
	}

		
}
