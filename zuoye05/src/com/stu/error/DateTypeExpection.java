package com.stu.error;
/*
 * 日期数据异常类
 * */
public class DateTypeExpection extends Exception{
	public DateTypeExpection()
	{
		super("日期格式不正确！或日期数据不正确！正确格式：yy/mm/dd");
	}
}
