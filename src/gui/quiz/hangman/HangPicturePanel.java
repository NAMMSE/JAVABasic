package gui.quiz.hangman;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import gui.component.ImageLabel;

public class HangPicturePanel extends JPanel{
	
	// �̹��� ����ϴ� �����ӿ� ī�巹�̾ƿ� �����ϴ� Ŭ����
	
	CardLayout cardLayoutManager = new CardLayout(20,20);
	
	public HangPicturePanel() {
		
		System.out.println("�г� �ʺ� : "+this.getWidth());
		
		
		add(new HangImageLabel("image/���.jpg"));
		add(new HangImageLabel("image/�ٳ���.jpg"));
		add(new HangImageLabel("image/����.jpg"));
		add(new HangImageLabel("image/������.jpg"));
		
		setLayout(cardLayoutManager);
		setBackground(Color.BLACK);
	}

}
