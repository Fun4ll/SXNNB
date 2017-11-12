package com.yinghang.test;

import com.yinghang.emple.User;
import com.yinghang.xitong.DepositAccount;

public class Text {
	public static void main(String[] args) {
		DepositAccount.setLiXi(0.025);
		DepositAccount saver =new DepositAccount();
//		saver.addUser();
//		saver.showUser("1234567890");
//		double lixi=saver.jisuanLiXi("1234567890");
//		System.out.println(lixi+"￥");
		User u=new User();
		u.setUserId("1234567890");
		u.setUserName("zhangsan");
		u.setUserMany(2000);
		saver.addUser(u);
		saver.showUser(u.getUserId());
		double lixi=saver.jisuanLiXi(u.getUserId());
		System.out.println("年息是："+lixi+"￥");
		lixi=saver.jisuanMonthLiXi(u.getUserId());
		System.out.println("月息是："+lixi+"￥");
	}
}
