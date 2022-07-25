package gui.component;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ColorStateButton extends JButton{ // 각 버튼에 색상이 딸려있기 때문에 버튼의 인스턴스 화가 필요하다
	
	private static Color[] bg_colors = {Color.WHITE, Color.GREEN, Color.YELLOW, Color.RED, Color.BLACK};
	private int state = 0; // 색 배열의 인덱스
	private int num; // 버튼의 번호
	
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
