package gui.component;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ColorStateButton extends JButton{ // �� ��ư�� ������ �����ֱ� ������ ��ư�� �ν��Ͻ� ȭ�� �ʿ��ϴ�
	
	private static Color[] bg_colors = {Color.WHITE, Color.GREEN, Color.YELLOW, Color.RED, Color.BLACK};
	private int state = 0; // �� �迭�� �ε���
	private int num; // ��ư�� ��ȣ
	
	private static ActionListener eventListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			ColorStateButton performedButton = (ColorStateButton)e.getSource();
			performedButton.change();
		}
	};
	
	public ColorStateButton(int num) {
		this.num = num;
		
		addActionListener(eventListener);
		setText("button"+num);
		setBackground(getBackground());
	
	}
	
	public void change() {
		if(state < bg_colors.length -1)
			setBackground(bg_colors[++state]);
	}
}
