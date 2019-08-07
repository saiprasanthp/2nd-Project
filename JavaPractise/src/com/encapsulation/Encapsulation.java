package com.encapsulation;

public class Encapsulation {
	private String name;
	public void setString(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	

	public static void main(String[] args) {
		Encapsulation j=new Encapsulation();
		j.setString("sai");
		String name=j.getName();
		System.out.println(name);
	}

}
