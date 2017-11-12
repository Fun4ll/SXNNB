package com.lianxi.zuoye;

import java.util.Scanner;

public class DiGuiZuoYe {
	public static void DiGui(int n)
	{
		if(n>5000)
		{
			System.out.println(n);
		    System.out.println(n);
			return;
		}
		else 
		{
			System.out.println(n);
			DiGui(2*n);
			System.out.println(n);
		}
		
	}

	public static void main(String[] args) {
		System.out.println("«Î ‰»În£∫");
		Scanner in=new Scanner(System.in);
		DiGui((int)in.nextInt());
		in.close();
	}

}
