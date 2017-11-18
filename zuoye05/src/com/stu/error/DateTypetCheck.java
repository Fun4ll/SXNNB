package com.stu.error;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateTypetCheck {
	/*
	 * �������ݸ�ʽУ��
	 * throws �׳����ڸ�ʽ�쳣
	 * */
	public void checkDateTypet(String date) throws DateTypeExpection{
		
	Pattern p=Pattern.compile("^[0-9]{2}[/](0[1-9]|1[0-2])[/](0[1-9]|1[0-9]|2[0-9]|3[0-1])$");
	Matcher m= p.matcher(date);
	boolean result=m.matches();
	if(!result)
		throw new DateTypeExpection();
	}
}
