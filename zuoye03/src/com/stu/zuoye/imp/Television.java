package com.stu.zuoye.imp;

import com.stu.zuoye.inter.ComputeWeight;
/*
 * ���������� ������
 * ʵ�ֻ���ӿ�
 * */
public class Television extends Godls implements ComputeWeight{
	/*
	 * ���ӳ�ʼ����Ϊ20
	 * */
	public Television() {
		setWeight(40.0);
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
	 * ���ص��ӵ�����
	 * */
	@Override
	public double computeWeight() {
		return getWeight();
	}

}
