package gui.quiz.hangman;

import javax.swing.JButton;

public class HangEnglishButton extends JButton{
	 // 눌렀는지 안눌렀는지 확인하기 위한 클래스
	boolean checked = false;
	
	public HangEnglishButton(String title) {
		super(title);
	}

}
