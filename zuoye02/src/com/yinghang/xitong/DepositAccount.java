package com.yinghang.xitong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yinghang.emple.User;

public class DepositAccount {
	public static double lixi;
	private List<User> da= new ArrayList<>();
	public static void setLiXi(double lixic){
		lixi=lixic;
	}
	public void addUser() {
		Scanner cin=new Scanner(System.in);
		System.out.println("请输入账号：");
		String userId=cin.nextLine();
		System.out.println("请输入用户名：");
		String userName=cin.nextLine();
		System.out.println("请输入存款金额：");
		double userMany=cin.nextDouble();
		if(findUser(userId)==null) {
			User u;
			u=new User(userId,userName,userMany);
			da.add(u);
		}
		else
			System.out.println("该用户已存在！！！");
		cin.close();
	}
	public void addUser(User u) {
		if(findUser(u.getUserId())==null) {
			da.add(u);
		}
		else
			System.out.println("该用户已存在！！！");
	}
	
	public double jisuanLiXi(String userId) {
		double lixi=0.0;
		User u=findUser(userId);
		lixi=u.getUserMany()*DepositAccount.lixi;
		return lixi;
	}
	public double jisuanMonthLiXi(String userId) {
		double lixi=0.0;
		
		lixi=jisuanLiXi(userId); 
		return lixi/12;
	}
	
	public User findUser(String userId) {
		int i;
		if(da==null)
			return null;
		for(i=0;i<da.size();i++)
		{
			if(userId.equals(da.get(i).getUserId()))
				break;
		}
		if(i<da.size())
			return da.get(i);
		else 
			return null;
	}
	
	public void showUser(String userId) {
		User u=findUser(userId);
		if(u!=null)
		 System.out.println(u);
		else
			System.out.println("该用户不存在！！！");
		
	}
}
