package com.chc.gui.swing;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//JOptionPaneTest
//����һ��JPanel����չ�࣬����Ķ����������������е�
//JRadioButton�ؼ�,��Panel��չ�����ָ��һ���ַ�����ΪTitledBorder
//JTabbedPaneTest
//����һ��JPanel����չ�࣬����Ķ����������������е�JRadioButton�ؼ�
//��JPanel��չ�����ָ��һ���ַ�����ΪTitledBorder
@SuppressWarnings("serial")
public class ButtonPanel extends JPanel {
	private ButtonGroup group;
	public ButtonPanel(String title, String[] options)
	{  
		setBorder(BorderFactory.createTitledBorder(BorderFactory
			.createEtchedBorder(), title));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		group = new ButtonGroup();
		for (int i = 0; options!= null && i < options.length; i++)
		{  
			JRadioButton b = new JRadioButton(options[i]);
			b.setActionCommand(options[i]);
			add(b);
			group.add(b);
			b.setSelected(i == 0);
		}
	}
	// ����һ�����������ڷ����û�ѡ���ѡ��
	public String getSelection()
	{  
		return group.getSelection().getActionCommand();
	} 
	
	public ButtonPanel(JTabbedPaneTest.ChangeAction action
			, String title, String[] labels)
		{  
			setBorder(BorderFactory.createTitledBorder(BorderFactory
				.createEtchedBorder(), title));
			setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
			group = new ButtonGroup();
			for (int i = 0; labels!= null && i < labels.length; i++)
			{  
				JRadioButton b = new JRadioButton(labels[i]);
				b.setActionCommand(labels[i]);
				add(b);
				// ����¼�������
				b.addActionListener(action);
				group.add(b);
				b.setSelected(i == 0);
			}
		}
}
