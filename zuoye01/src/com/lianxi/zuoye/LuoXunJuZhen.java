package com.lianxi.zuoye;

import java.util.Scanner;

public class LuoXunJuZhen {

	public static void main(String[] args) {
		System.out.println("请输入要输出的矩阵的阶数：");
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		in.close();
		//创建矩阵
		int a[][]=new int[n][n];
		int num=1;
		int i,j;
		//矩阵初始化
		for(int k=0;k<=n/2;k++)
		{
			
			for(i=k,j=k;i<n-k;i++)
			{
				a[i][j]=num;
				num++;
			}
			for(i-=1,j+=1;j<n-k;j++)
			{
				a[i][j]=num;
				num++;
			}
			for(i-=1,j-=1;i>k-1;i--)
			{
				a[i][j]=num;
				num++;
			}
			for(i++,j--;j>k;j--)
			{
				a[i][j]=num;
				num++;
			}
		}
		//遍历矩阵
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
