package com.stu.zuoye.computecar;

import com.stu.zuoye.inter.ComputeWeight;
/*
 * ������
 * godes �����б�
 * num �����ϵĻ�����Ŀ
 * */
public class Car {
	private ComputeWeight[] godes=new ComputeWeight[10];
	private int num;
	public Car()
	{
		num=0;
	}
	/*
	 * ���������ӻ���
	 * ��ӳɹ�  return "��ӻ���ɹ���"
	 * ���ʧ�� return "��ӻ���ʧ�ܣ�����������"
	 * */
	public String addGodes(ComputeWeight g) {
		if(num<10) {
			godes[num]=g;
			num+=1;
			return "��ӻ���ɹ���";
		}
		return "��ӻ���ʧ�ܣ�����������";
	}
	/*
	 * ��ʾ�����ϵĻ�������
	 * */
	public void displayWeight() {
		double weight=0.0;
		for(int i=0;i<num;i++)
		{
			weight+=godes[i].computeWeight();
		}
		System.out.println("����������Ϊ��"+weight+"ǧ��");
	}
}
