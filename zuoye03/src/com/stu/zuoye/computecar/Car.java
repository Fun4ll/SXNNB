package com.stu.zuoye.computecar;

import com.stu.zuoye.inter.ComputeWeight;
/*
 * 货车类
 * godes 货物列表
 * num 货车上的货物数目
 * */
public class Car {
	private ComputeWeight[] godes=new ComputeWeight[10];
	private int num;
	public Car()
	{
		num=0;
	}
	/*
	 * 向货车中添加货物
	 * 添加成功  return "添加货物成功！"
	 * 添加失败 return "添加货物失败！货仓已满！"
	 * */
	public String addGodes(ComputeWeight g) {
		if(num<10) {
			godes[num]=g;
			num+=1;
			return "添加货物成功！";
		}
		return "添加货物失败！货仓已满！";
	}
	/*
	 * 显示货车上的货物总重
	 * */
	public void displayWeight() {
		double weight=0.0;
		for(int i=0;i<num;i++)
		{
			weight+=godes[i].computeWeight();
		}
		System.out.println("货物总重量为："+weight+"千克");
	}
}
