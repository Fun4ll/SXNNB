package com.school.student;

public class Undergraduate extends Student {
	private String specialty;
	public Undergraduate() {}
	public Undergraduate(String name, int age,String education,String specialty) {
		super(name, age, education);
		this.specialty=specialty;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	@Override
	public String toString() {
		return "本科生  ["+super.toString()+",专业：" + specialty + "]";
	}
	public void show() {
		System.out.println(toString());
	}
}
