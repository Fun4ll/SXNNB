package com.stu.error;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberCheck{
	/*
	 * 校验字符串是否为16进制
	 * throws 抛出16进制异常
	 * 是  正常执行
	 * 否   抛出异常
	 * */
	public void  NumberCheck(String num) throws NumerException{
		Pattern p=Pattern.compile("^([0-9]|[abcdef]|[ABCDEF]){0,}$");
		Matcher m= p.matcher(num);
		boolean result=m.matches();
		if(!result)
			throw new NumerException();
	}
	/*
	 * 将16进制字符串转换成10进制数字
	 * throws 抛出16进制异常
	 * 是  返回转换成的10进制数
	 * 否 抛出异常
	 * */
	public int Number16To10(String number) throws NumerException
	{
		NumberCheck(number);
		Integer in=Integer.valueOf(number, 16);
		return in;
	}
}
