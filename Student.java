package edu.umass;

public class Student extends Person{


	private String major;

	public Student(String name, int age, String birthDate, String major){

		super(name,age,birthDate);
		this.major = major;
	}

	public Student(){

		super();
		this.major = "Undecided";	
	}


	public void printInfo(){

		System.out.println(this.getName()+" "+this.major);
	}
}
