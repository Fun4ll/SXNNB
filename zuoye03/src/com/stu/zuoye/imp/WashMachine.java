package com.stu.zuoye.imp;

import com.stu.zuoye.inter.ComputeWeight;
/*
 * ���������� ϴ�»���
 * ʵ�ֻ���ӿ�
 * */
public class WashMachine extends Godls implements ComputeWeight{
	/*
	 * ϴ�»���ʼ����Ϊ20
	 * */
	public WashMachine()
	{
		setWeight(100.0);
	}
	/*
	 * ����ϴ�»�����
	 * w  Ҫ���õ�ϴ�»�����
	 * */
	public void setWeight(double w) {
		super.setWeight(w);
	}
	/*
	 * ʵ�ֽӿ�ComputeWeight����
	 * ����ϴ�»�������
	 * */
	@Override
	public double computeWeight() {
		return getWeight();
	}

}
