package com.stu.main;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.stu.error.DateTypeExpection;
import com.stu.error.DateTypetCheck;


/*
 * 实现输入日期转换成Date，输出
 * */

public class dateH {
	public static void main(String[] args) throws ParseException {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个日期：");
		String date=in.nextLine();
		try {
			DateTypetCheck d=new DateTypetCheck();
			d.checkDateTypet(date);
			SimpleDateFormat format=new SimpleDateFormat("yy/mm/dd");
			Date d1=new Date();
			d1=format.parse(date);
			System.out.println(d1.toString());
		} catch (DateTypeExpection e) {
			e.printStackTrace();
		}
		
	}
}
