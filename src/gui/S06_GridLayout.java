package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.component.ColorStateButton;

public class S06_GridLayout extends JFrame{

	public S06_GridLayout() {

		LayoutManager manager = new GridLayout(5, 10);
		

//		ActionListener eventListener = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// e.getSource() : �̺�Ʈ�� �߻��� ��ü�� ����ִ�. ����Ϸ��� �ٿ�ĳ������ �ʿ��ϴ�(object Ÿ������ �ޱ� ������) / 50�� ��ư�� �� �������� �𸣴ϱ� �߻��� ��ü�� �����Ϸ��� ���
//				// System.out.println(e.getSource());
//				
//				JButton eventbtn = (JButton)e.getSource();
//			}
//		};

//		for(int i=0;i<50;i++) {
//			JButton btn = new JButton("Button"+(i+1));
//			btn.addActionListener(eventListener);
//			add(btn);
//		}

		// �������� : �� ��ư�� ���� ������ ������� �ʷ� ��� ���� �������� ���ϰ� ����� �������� ��������
		for(int i=0; i<50;i++) {
			JButton button = new ColorStateButton(i+1);
			add(button);
		}

		setLayout(manager);
		setBounds(1000,200,1000,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new S06_GridLayout();
	}
}
