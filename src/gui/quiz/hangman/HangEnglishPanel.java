package gui.quiz.hangman;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangEnglishPanel extends JPanel{
	// 
	HangAnswerLabel answerLabel = new HangAnswerLabel();
	JPanel keyPanel = new JPanel();
	
	ArrayList<JButton> keys = new ArrayList<>();
	
	public ArrayList<JButton> getAllkey(){
		return keys;
	}
	
	public HangEnglishPanel() {
		setLayout(new BorderLayout());
		
		add(answerLabel, "North");
		add(keyPanel, "Center");
		
		// 클래스가 많아서 객체화 하지 않음
		keyPanel.setLayout(new GridLayout(2,13));
		
		for(char ch ='A'; ch<='Z';ch++) {
			JButton btn = new HangEnglishButton(""+ch); 
			keyPanel.add(btn);
			keys.add(btn);
		}
	}

}
