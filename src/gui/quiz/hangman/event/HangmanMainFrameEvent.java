package gui.quiz.hangman.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.quiz.hangman.HangMainFrame;

// �� Ŭ������ ��ӹ޴� Ŭ�������� ActionListener�̸鼭 main�� ������� ������ �ְ� �ȴ�
abstract public class HangmanMainFrameEvent implements ActionListener{

	HangMainFrame main;
	
	public HangmanMainFrameEvent(HangMainFrame main) {
		this.main=main;
	}
	

}
