package com.stu.zuoye.imp;

import com.stu.zuoye.inter.ComputeWeight;
/*
 * ���������� ������
 * ʵ�ֻ���ӿ�
 * */
public class Computer extends Godls implements ComputeWeight{
	/*
	 * ���Գ�ʼ����Ϊ20
	 * */
	public Computer()
	{
		setWeight(20.0);
	}
	/*
	 * ���õ�������
	 * w  Ҫ���õĵ�������
	 * */
	public void setWeight(double w) {
		super.setWeight(w);
	}
	/*
	 * ʵ�ֽӿ�ComputeWeight����
	 * ���ص��Ե�����
	 * */
	
	public double computeWeight() {

		return getWeight();
	}

}
