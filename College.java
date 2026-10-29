package edu.umass;

public class College{

	public static void main(String[] args){

		Person one = new Person();
		Person two = new Person("Akshit",18,"02/12/2008");
		Student three = new Student();
		Student four = new Student("Akshit",18,"02/12/2008","CS"); 

		System.out.println(one.getName());
		System.out.println(two.getName());
		three.printInfo();
		four.printInfo();
		
	}
}
