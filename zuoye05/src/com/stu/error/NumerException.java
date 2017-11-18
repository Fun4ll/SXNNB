package com.stu.error;

/*
 * 16进制异常类
 * */
public class NumerException extends Exception{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7591516116487277731L;

	public NumerException()
	{
		super("输入的数不是16进制！");
	}

}
