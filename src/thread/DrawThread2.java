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
public class DrawThread2 extends Thread
{
	// ģ���û��˻�
	private Account2 account;
	// ��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
	private double drawAmount;
	public DrawThread2(String name , Account2 account 
		, double drawAmount)
	{
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	// �������߳��޸�ͬһ����������ʱ�����漰���ݰ�ȫ���⡣
	public void run()
	{
		// ֱ�ӵ���account�����draw������ִ��ȡǮ
		// ͬ��������ͬ����������this��this�������draw()�����Ķ���
		// Ҳ����˵���߳̽���draw()����֮ǰ�������ȶ�account����ļ�����
		account.draw(drawAmount);
	}
}
