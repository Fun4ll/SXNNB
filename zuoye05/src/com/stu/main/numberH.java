package com.stu.main;

import java.util.Scanner;

import com.stu.error.NumberCheck;
import com.stu.error.NumerException;


/*
 * 实现16进制转10进制输出
 * */
public class numberH {
	
	public static void main(String[] args) {
		System.out.println("请输入一个十六进制数：");
		Scanner in=new Scanner(System.in);
		String num=in.nextLine();
		System.out.println("得到的十六进制数："+num+"H");
		NumberCheck numberCheck=new NumberCheck();
		int num10=0;
		try {
			num10=numberCheck.Number16To10(num);
		} catch (NumerException e) {
			e.printStackTrace();
		}
		System.out.println("转换成十进制数："+num10);
		in.close();
	}

}
