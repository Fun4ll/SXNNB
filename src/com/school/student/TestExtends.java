package com.school.student;

public class TestExtends {
	public static void main(String[] args) {
		Undergraduate u=new Undergraduate("张三", 15, "本科", "软件工程");
		Graduate g=new Graduate("李四", 20, "研究生", "人工智能");
		Student s=new Student("王五", 15, "高中");
		u.show();
		g.show();
		s.show();
	}
}
