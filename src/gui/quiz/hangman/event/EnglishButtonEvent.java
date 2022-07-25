package gui.quiz.hangman.event;

import java.awt.event.ActionEvent;

import gui.quiz.hangman.HangMainFrame;

public class EnglishButtonEvent extends HangmanMainFrameEvent{
	
	public EnglishButtonEvent(HangMainFrame main) {
		super(main);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(e.getActionCommand());
		String cmd = e.getActionCommand();
		if(!main.checkAnswer(cmd)) {
			main.nextPicture();
		}
	}
	
	
}
