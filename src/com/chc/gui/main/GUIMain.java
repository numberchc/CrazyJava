package com.chc.gui.main;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextField;

public class GUIMain {

	public static void main(String[] args) {
		Frame f = new Frame("���Դ���");
		
//		Panel p = new Panel();
//		p.add(new TextField(20));
//		p.add(new Button("p���Դ���"));
//		f.add(p);
		
//		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
//		sp.add(new TextField(20));
//		sp.add(new Button("sp���Դ���"));
//		f.add(sp);
		
//		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
//		for (int i = 0; i < 100; i++) {
//			f.add(new Button("��ť" + i));
//		}
		
//		f.setLayout(new BorderLayout(30, 5));
//		f.add(new Button("��"), BorderLayout.SOUTH);
//		f.add(new Button("��"), BorderLayout.NORTH);
//		f.add(new Button("��"), BorderLayout.CENTER);
//		f.add(new Button("��"), BorderLayout.EAST);
//		f.add(new Button("��"), BorderLayout.WEST);
		
		//������
		Panel p1 = new Panel();
		p1.add(new TextField(30));
		f.setLayout(new BorderLayout());
		f.add(p1, BorderLayout.NORTH);
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(3, 5, 4, 4));
		String[] name = {"0","1","2","3","4","5","6","7","8","9","+","-","*","/","."};
		//��Panel�����15����ť
		for (int i = 0; i < name.length; i++) {
			p2.add(new Button(name[i]));
		}
		f.add(p2);
		
		//���ô���Ϊ��Ѵ�С
		f.pack();
		f.setVisible(true);
	}

}
