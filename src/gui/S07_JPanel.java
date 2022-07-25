package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class S07_JPanel extends JFrame{

	/*
	 	# JPanel
	 	
	 	 - 컨테이너 역할을 하는 컴포넌트
	 	 - 각 패널마다 다른 레이아웃을 설정해 사용할 수 있다
	 */
	
	public S07_JPanel() {
		
		JPanel panel = new JPanel(new BorderLayout());
		
		panel.add(new JButton("inner south btn"), "South");
		panel.add(new JButton("inner north btn"), "North");
		panel.add(new JButton("w"), "West");
		panel.add(new JButton("e"), "East");
		panel.add(new JLabel("Center message"), "Center");
		
		
		add(new JButton("btn1"));
		add(new JButton("btn2"));
		//add(new JButton("btn3"));
		add(panel);
		add(new JButton("btn4"));
		
		
		setLayout(new GridLayout(2,2));
		setBounds(1300, 200, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S07_JPanel();
		
	}
}
