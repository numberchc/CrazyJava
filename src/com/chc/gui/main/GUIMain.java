package com.chc.gui.main;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextField;

public class GUIMain {

	public static void main(String[] args) {
		Frame f = new Frame("���Դ���");
		
//		Panel p = new Panel();
//		p.add(new TextField(20));
//		p.add(new Button("p������"));
//		f.add(p);
		
//		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
//		sp.add(new TextField(20));
//		sp.add(new Button("sp������"));
//		f.add(sp);
		
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
		for (int i = 0; i < 100; i++) {
			f.add(new Button("��ť"+i));
		}
		//���ô���Ϊ��Ѵ�С
		f.pack();
		f.setVisible(true);
	}

}
