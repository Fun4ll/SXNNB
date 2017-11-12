package com.stu.zuoye.test;


import com.stu.zuoye.imp.Graduate;

public class Test01 {
	public static void main(String[] args) {
		Graduate graduate=new Graduate();
		graduate.setName("zhangsan");
		graduate.setSex("ÄÐ");
		graduate.setFee(20000.0);
		graduate.setPay(2000.0);
		if((graduate.getPay())*12-(graduate.getFee())<2000)
		{
			System.out.println("provide a loan");
		}

		if(graduate.needLoan()) {
			System.out.println("provide a loan");
		}

	}
}
