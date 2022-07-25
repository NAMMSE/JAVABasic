package gui.quiz.hangman;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import gui.component.ImageLabel;

public class HangPicturePanel extends JPanel{
	
	// 이미지 출력하는 프레임에 카드레이아웃 설정하는 클래스
	
	CardLayout cardLayoutManager = new CardLayout(20,20);
	
	public HangPicturePanel() {
		
		System.out.println("패널 너비 : "+this.getWidth());
		
		
		add(new HangImageLabel("image/사과.jpg"));
		add(new HangImageLabel("image/바나나.jpg"));
		add(new HangImageLabel("image/망고.jpg"));
		add(new HangImageLabel("image/복숭아.jpg"));
		
		setLayout(cardLayoutManager);
		setBackground(Color.BLACK);
	}

}
