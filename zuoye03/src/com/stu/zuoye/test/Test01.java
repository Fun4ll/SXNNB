package com.stu.zuoye.test;

import com.stu.zuoye.computecar.Car;
import com.stu.zuoye.imp.Computer;
import com.stu.zuoye.imp.Television;
import com.stu.zuoye.imp.WashMachine;

public class Test01 {
	public static void main(String[] args) {
		Car c=new Car();
		Computer c01=new Computer();
		Television c02=new Television();
		WashMachine c03=new WashMachine();
		System.out.println(c.addGodes(c01));
		System.out.println(c.addGodes(c02));
		System.out.println(c.addGodes(c03));
		c.displayWeight();
	}
}
