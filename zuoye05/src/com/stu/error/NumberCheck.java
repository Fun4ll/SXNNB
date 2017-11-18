package com.stu.error;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberCheck{
	/*
	 * У���ַ����Ƿ�Ϊ16����
	 * throws �׳�16�����쳣
	 * ��  ����ִ��
	 * ��   �׳��쳣
	 * */
	public void  NumberCheck(String num) throws NumerException{
		Pattern p=Pattern.compile("^([0-9]|[abcdef]|[ABCDEF]){0,}$");
		Matcher m= p.matcher(num);
		boolean result=m.matches();
		if(!result)
			throw new NumerException();
	}
	/*
	 * ��16�����ַ���ת����10��������
	 * throws �׳�16�����쳣
	 * ��  ����ת���ɵ�10������
	 * �� �׳��쳣
	 * */
	public int Number16To10(String number) throws NumerException
	{
		NumberCheck(number);
		Integer in=Integer.valueOf(number, 16);
		return in;
	}
}
