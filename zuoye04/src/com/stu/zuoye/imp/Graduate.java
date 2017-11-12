package com.stu.zuoye.imp;

import com.stu.zuoye.inter.StudentManageInterface;
import com.stu.zuoye.inter.TeacherManageInterface;
/*
 * �о�����
 * ʵ��StudentManageInterface,TeacherManageInterface�ӿ�
 * name;����
 * sex;�Ա�
 * pay;�¹���
 * fee;ѧ��
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
	 * �ж��Ƿ���Ҫ����
	 * return true�� ��Ҫ����
	 * return false; ����Ҫ����
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
