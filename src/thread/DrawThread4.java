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
public class DrawThread4 extends Thread
{
	// ģ���û��˻�
	private Account4 account;
	// ��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
	private double drawAmount;
	public DrawThread4(String name , Account4 account 
		, double drawAmount)
	{
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	// �ظ�100��ִ��ȡǮ����
	public void run()
	{
		for (int i = 0 ; i < 100 ; i++ )
		{
			account.draw(drawAmount);
		}
	}
}
