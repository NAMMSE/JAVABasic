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
//				// e.getSource() : 이벤트가 발생한 객체를 담고있다. 사용하려면 다운캐스팅이 필요하다(object 타입으로 받기 때문에) / 50개 버튼중 뭘 누르는지 모르니까 발생한 객체를 지정하려고 사용
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

		// 연습문제 : 각 버튼을 누를 때마다 순서대로 초록 노랑 빨강 검정으로 변하게 만들기 검정에서 끝나야함
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
