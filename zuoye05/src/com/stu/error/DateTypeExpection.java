package com.stu.error;
/*
 * ���������쳣��
 * */
public class DateTypeExpection extends Exception{
	public DateTypeExpection()
	{
		super("���ڸ�ʽ����ȷ�����������ݲ���ȷ����ȷ��ʽ��yy/mm/dd");
	}
}
