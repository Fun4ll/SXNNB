package com.stu.main;

import java.util.Scanner;

import com.stu.error.NumberCheck;
import com.stu.error.NumerException;


/*
 * ʵ��16����ת10�������
 * */
public class numberH {
	
	public static void main(String[] args) {
		System.out.println("������һ��ʮ����������");
		Scanner in=new Scanner(System.in);
		String num=in.nextLine();
		System.out.println("�õ���ʮ����������"+num+"H");
		NumberCheck numberCheck=new NumberCheck();
		int num10=0;
		try {
			num10=numberCheck.Number16To10(num);
		} catch (NumerException e) {
			e.printStackTrace();
		}
		System.out.println("ת����ʮ��������"+num10);
		in.close();
	}

}
