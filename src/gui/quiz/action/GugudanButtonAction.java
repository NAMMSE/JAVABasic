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
		// ActionEvent : ��ư�� Ŭ���Ҷ�����(�̺�Ʈ�� �߻��Ҷ�����) �Բ� �Ѿ���� �̺�Ʈ ����
		System.out.println(e.getActionCommand()); // +�� ������ + -�� ������ - ���
		
		switch(e.getActionCommand()) {
		case "+":
			// �̺�Ʈ �߻��ø��� ������ ��ư���� �ؽ�Ʈ�� �ٲ��ִ� �׼�
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
