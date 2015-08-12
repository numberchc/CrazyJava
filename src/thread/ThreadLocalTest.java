package thread;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
class Account5
{
	/* ����һ��ThreadLocal���͵ı������ñ�������һ���ֲ߳̾�����
	ÿ���̶߳��ᱣ���ñ�����һ������ */
	private ThreadLocal<String> name = new ThreadLocal<>();
	// ����һ����ʼ��name���ԵĹ�����
	public Account5(String str)
	{
		this.name.set(str);
		// ����������ڷ��ʵ�ǰ�̵߳�name������ֵ
		System.out.println("---" + this.name.get());
	}
	// name��setter��getter����
	public String getName()
	{
		return name.get();
	}
	public void setName(String str)
	{
		this.name.set(str);
	}
}
class MyTest extends Thread
{
	// ����һ��Account����
	private Account5 Account5;
	public MyTest(Account5 Account5, String name)
	{
		super(name);
		this.Account5 = Account5;
	}
	public void run()
	{
		// ѭ��10��
		for (int i = 0 ; i < 10 ; i++)
		{
			// ��i == 6ʱ������˻����滻�ɵ�ǰ�߳���
			if (i == 6)
			{
				Account5.setName(getName());
			}
			// ���ͬһ���˻����˻�����ѭ������
			System.out.println(Account5.getName()
				+ " �˻���iֵ��" + i);
		}
	}
}
public class ThreadLocalTest
{
	public static void main(String[] args) 
	{
		// ���������̣߳������̹߳���ͬһ��Account
		Account5 at = new Account5("��ʼ��");
		/*
		��Ȼ�����̹߳���ͬһ���˻�����ֻ��һ���˻���
		�������˻�����ThreadLocal���͵ģ�����ÿ���߳�
		����ȫӵ�и��Ե��˻������������Դ�i == 6֮�󣬽���������
		�̷߳���ͬһ���˻�ʱ������ͬ���˻�����
		*/
		new MyTest(at , "�̼߳�").start();
		new MyTest(at , "�߳���").start ();
	}
}
