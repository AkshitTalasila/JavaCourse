package edu.umass;
import java.util.*;

public class LoopPractice{


	public static int makeSum(){

		Scanner scanner = new Scanner(System.in);
		int sum=0;
		int input =0;
		while(input>=0){

			System.out.println("Please enter the number you want to add");
			input = scanner.nextInt();
			if(input>=0){

				sum+=input;
			}
		}	

		return sum;
	}

	public static void main(String[] args){


		System.out.println(makeSum());
	}
}
