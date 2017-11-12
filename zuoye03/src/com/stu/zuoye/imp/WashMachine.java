package com.stu.zuoye.imp;

import com.stu.zuoye.inter.ComputeWeight;
/*
 * 货物派生类 洗衣机类
 * 实现货物接口
 * */
public class WashMachine extends Godls implements ComputeWeight{
	/*
	 * 洗衣机初始重量为20
	 * */
	public WashMachine()
	{
		setWeight(100.0);
	}
	/*
	 * 设置洗衣机重量
	 * w  要设置的洗衣机重量
	 * */
	public void setWeight(double w) {
		super.setWeight(w);
	}
	/*
	 * 实现接口ComputeWeight方法
	 * 返回洗衣机的重量
	 * */
	@Override
	public double computeWeight() {
		return getWeight();
	}

}
