package gui.quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class WordBtn extends JButton{
	
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int num;
	
	static ActionListener eventAction = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
			
		}
	};
	
	public WordBtn(int num) {
		this.num=num;
		setText(alphabet.substring(num,num+1));
	}
}
