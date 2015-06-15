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
		Frame f = new Frame("测试窗口");
		
//		Panel p = new Panel();
//		p.add(new TextField(20));
//		p.add(new Button("p测试窗口"));
//		f.add(p);
		
//		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
//		sp.add(new TextField(20));
//		sp.add(new Button("sp测试窗口"));
//		f.add(sp);
		
//		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
//		for (int i = 0; i < 100; i++) {
//			f.add(new Button("按钮" + i));
//		}
		
//		f.setLayout(new BorderLayout(30, 5));
//		f.add(new Button("南"), BorderLayout.SOUTH);
//		f.add(new Button("北"), BorderLayout.NORTH);
//		f.add(new Button("中"), BorderLayout.CENTER);
//		f.add(new Button("东"), BorderLayout.EAST);
//		f.add(new Button("西"), BorderLayout.WEST);
		
		//计算器
		Panel p1 = new Panel();
		p1.add(new TextField(30));
		f.setLayout(new BorderLayout());
		f.add(p1, BorderLayout.NORTH);
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(3, 5, 4, 4));
		String[] name = {"0","1","2","3","4","5","6","7","8","9","+","-","*","/","."};
		//向Panel中添加15个按钮
		for (int i = 0; i < name.length; i++) {
			p2.add(new Button(name[i]));
		}
		f.add(p2);
		
		//设置窗口为最佳大小
		f.pack();
		f.setVisible(true);
	}

}
