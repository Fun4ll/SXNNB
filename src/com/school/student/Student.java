package com.school.student;

public class Student {
	private String name;
	private int age;
	private String education;
	public Student()
	{}
	public Student(String name, int age,String education) {
		this.name=name;
		this.age=age;
		this.education=education;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	@Override
	public String toString() {
		return "������" + name + ", ���䣺=" + age + ", ѧ����" + education + "";
	}
	
	public void show(){
		System.out.println("ѧ��  [������" + name + ", ���䣺=" + age + ", ѧ����" + education + "]");
	}
	
	
}
