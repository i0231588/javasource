package io;

import java.io.Serializable;

public class Person implements Serializable{

	
	
	private String name;
	private String job;
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [ name =" + name + ", jab= " + job + "]";
	}
}
