package edu.umass;
import java.util.*;

public class Array{

	public static void main(String[] args){

		int[] one = new int[9];
		String[] words = {"hi","hello"};
		for(int i=0;i<one.length;i++){

			one[i] = i;
			System.out.println(one[i]);
		}
		
		String sentence ="";
		for(int i=0;i<words.length;i++){

			sentence+=", "+words[i];
		}
		
		System.out.println(sentence);

		System.out.println(words[1]);	

		int[][] twoDimensional = new int[3][3];
		int[][] two = {{1,2,3},{2,3,4}};
		System.out.println(Arrays.deepToString(two));	
		for(int i=0;i<twoDimensional.length;i++){

			for(int z=0;z<twoDimensional[i].length;z++){

				twoDimensional[i][z] =z;
				System.out.print(" "+twoDimensional[i][z]);
			}

			System.out.println();
		}
	}
}
