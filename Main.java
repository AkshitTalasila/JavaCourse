package edu.umass;
import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();

		boolean running = true;

		while(running){

			try{
				System.out.println("Please enter the operation(add,sub,mul,or div)");
                        	String ops = scanner.nextLine();
                        	System.out.println("Please enter the first number");
                        	double a = scanner.nextDouble();
                        	System.out.println("Please enter the second number");
                        	double b = scanner.nextDouble();
                        	scanner.nextLine();
				System.out.println(calc.doStuff(a,b,ops));	
			}catch(ArithmeticException e){
	
				System.out.println("Cannot divide by 0");
			}catch(IllegalArgumentException e){

				System.out.println("Invalid operation");
			}catch(Exception e){

				System.out.println("Something went wrong");
			}
		
			System.out.println("Do you want to continuou(y/n)");
			String cont = scanner.nextLine();
			if(cont.equalsIgnoreCase("n")){

				running = false;
			}
	
		}			
	}
}
