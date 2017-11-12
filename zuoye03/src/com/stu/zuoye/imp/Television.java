package com.stu.zuoye.imp;

import com.stu.zuoye.inter.ComputeWeight;
/*
 * 货物派生类 电视类
 * 实现货物接口
 * */
public class Television extends Godls implements ComputeWeight{
	/*
	 * 电视初始重量为20
	 * */
	public Television() {
		setWeight(40.0);
	}
	/*
	 * 设置电视重量
	 * w  要设置的电视重量
	 * */
	public void setWeight(double w) {
		super.setWeight(w);
	}
	/*
	 * 实现接口ComputeWeight方法
	 * 返回电视的重量
	 * */
	@Override
	public double computeWeight() {
		return getWeight();
	}

}
