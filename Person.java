package edu.umass;

public class Person{

	private String name;
	private int age;
	private String birthDate;

	public Person(String name, int age, String birthDate){

		this.name = name;
		this.age = age;
		this.birthDate = birthDate;
	}

	public Person(){

		this("Jhon Doe",0, "0/0/0000");
	}


	public String getName(){

		return this.name;
	}

	public String setName(){

		return this.name;
	}
}
