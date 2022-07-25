package gui.quiz.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GugudanButtonAction implements ActionListener{

	int dan = 2;
	JButton[] gugudanButton;
	
	public GugudanButtonAction(JButton[] gugudanButton) {
		this.gugudanButton = gugudanButton;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// ActionEvent : 버튼을 클릭할때마다(이벤트가 발생할때마다) 함께 넘어오는 이벤트 정보
		System.out.println(e.getActionCommand()); // +를 누르면 + -를 누르면 - 출력
		
		switch(e.getActionCommand()) {
		case "+":
			// 이벤트 발생시마다 구구단 버튼들의 텍스트를 바꿔주는 액션
			if(dan<19) {
				dan++;
				break;
			}else
				return;
		case "-":
			if(dan>2) {
				dan--;
				break;
			}else
				return;

		}
		for(int i=0;i<9;i++) {
			gugudanButton[i].setText(String.format("%d x %d = %d", dan,i+1,dan*(i+1) ));
		}
	}

}
