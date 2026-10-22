package edu.umass;

public class NumberReversal{

	public int reverse(int number){

		String num = Integer.toString(number);
			
		String reversed ="";
		
		for(int i=num.length();i>0;i--){

			reversed+=num.substring(i-1,i);
		}

		int rev = Integer.parseInt(reversed);

		return rev;
	}

	public double decimalRev(double number){

		String num = Double.toString(number);
		int decIndex = num.indexOf(".");
		num = num.substring(0,decIndex)+num.substring(decIndex+1);
		String reversed = "";
		
		for(int i=num.length();i>0;i--){

			reversed+=num.substring(i-1,i);
		}

		reversed = reversed.substring(0,decIndex)+"."+reversed.substring(decIndex);
		double rev = Double.parseDouble(reversed);
		return rev;
	}
}
