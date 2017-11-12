package com.stu.zuoye.imp;

import com.stu.zuoye.inter.StudentManageInterface;
import com.stu.zuoye.inter.TeacherManageInterface;
/*
 * 研究生类
 * 实现StudentManageInterface,TeacherManageInterface接口
 * name;姓名
 * sex;性别
 * pay;月工资
 * fee;学费
 * */
public class Graduate implements StudentManageInterface,TeacherManageInterface{
	private String name;
	private String sex;
	private double pay;
	private double fee;
	public void setPay(double pay) {
		this.pay=pay;
	}
	public double getPay() {
		return pay;
	}

	public void setFee(double fee) {
		this.fee=fee;
	}

	public double getFee() {
		return fee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/*
	 * 判断是否需要贷款
	 * return true； 需要贷款
	 * return false; 不需要贷款
	 * */
	public boolean needLoan()
	{
		if(pay*12-fee<2000) {
			return true;
		}
		else
			return false;
	}
   
}
