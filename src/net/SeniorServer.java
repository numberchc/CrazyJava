package net;


import java.net.*;
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
public class SeniorServer
{
	private static final int SERVER_PORT = 30000;
	// 使用CrazyitMap对象来保存每个客户名字和对应输出流之间的对应关系。
	public static CrazyitMap<String , PrintStream> clients
		= new CrazyitMap<>();
	public void init()
	{
		try(
			// 建立监听的ServerSocket
			ServerSocket ss = new ServerSocket(SERVER_PORT))
		{
			// 采用死循环来不断接受来自客户端的请求
			while(true)
			{
				Socket socket = ss.accept();
				new SeniorServerThread(socket).start();
			}
		}
		// 如果抛出异常
		catch (IOException ex)
		{
			System.out.println("服务器启动失败，是否端口"
				+ SERVER_PORT + "已被占用？");
		}
	}
	public static void main(String[] args)
	{
		SeniorServer server = new SeniorServer();
		server.init();
	}
}

