package io;

import java.io.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Person2
	implements java.io.Serializable
{
	private String name;
	private int age;
	// 注意此处没有提供无参数的构造器!
	public Person2(String name , int age)
	{
		System.out.println("有参数的构造器");
		this.name = name;
		this.age = age;
	}
	// 省略name与age的setter和getter方法

	// name的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	// age的setter和getter方法
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}

	private void writeObject(java.io.ObjectOutputStream out)
		throws IOException
	{
		// 将name Field的值反转后写入二进制流
		out.writeObject(new StringBuffer(name).reverse());
		out.writeInt(age);
	}
	private void readObject(java.io.ObjectInputStream in)
		throws IOException, ClassNotFoundException
	{
		// 将读取的字符串反转后赋给name Field
		this.name = ((StringBuffer)in.readObject()).reverse()
			.toString();
		this.age = in.readInt();
	}
}