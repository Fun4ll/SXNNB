package com.lianxi.zuoye;

import java.util.Scanner;

public class LuoXunJuZhen {

	public static void main(String[] args) {
		System.out.println("������Ҫ����ľ���Ľ�����");
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		in.close();
		//��������
		int a[][]=new int[n][n];
		int num=1;
		int i,j;
		//�����ʼ��
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
		//��������
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
