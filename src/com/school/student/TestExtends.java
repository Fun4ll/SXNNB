package com.school.student;

public class TestExtends {
	public static void main(String[] args) {
		Undergraduate u=new Undergraduate("����", 15, "����", "�������");
		Graduate g=new Graduate("����", 20, "�о���", "�˹�����");
		Student s=new Student("����", 15, "����");
		u.show();
		g.show();
		s.show();
	}
}
