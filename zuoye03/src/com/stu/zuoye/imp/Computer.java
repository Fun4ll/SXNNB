package com.stu.zuoye.imp;

import com.stu.zuoye.inter.ComputeWeight;
/*
 * 货物派生类 电脑类
 * 实现货物接口
 * */
public class Computer extends Godls implements ComputeWeight{
	/*
	 * 电脑初始重量为20
	 * */
	public Computer()
	{
		setWeight(20.0);
	}
	/*
	 * 设置电脑重量
	 * w  要设置的电脑重量
	 * */
	public void setWeight(double w) {
		super.setWeight(w);
	}
	/*
	 * 实现接口ComputeWeight方法
	 * 返回电脑的重量
	 * */
	
	public double computeWeight() {

		return getWeight();
	}

}
