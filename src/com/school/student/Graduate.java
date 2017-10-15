package com.school.student;

public class Graduate extends Student{
	private String direction;
	public Graduate() {}
	public Graduate(String name, int age,String education,String direction) {
		super(name, age, education);
		this.direction=direction;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	@Override
	public String toString() {
		return "�о���   ["+super.toString()+",�о�����" + direction + "]";
	}
	public void show() {
		System.out.println(toString());
	}
}
