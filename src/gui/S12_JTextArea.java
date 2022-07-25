package gui;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class S12_JTextArea extends JFrame {

	public S12_JTextArea() {
		super("JTextArea Sample");
		
		JTextArea area = new JTextArea(10, 10);
		JLabel areaState = new JLabel();
		
		// 자동 줄바꿈 설정 / 기본 값이 false다
		area.setLineWrap(true);
		area.setFont(new Font("Consolas", Font.PLAIN,15));
		
		// 탭 크기 변경
		area.setTabSize(4);
		
		// setCursor : 해당 컴포넌트 위에 마우스가 올라갔을때 마우스 커서를 설정
		area.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		// 키보드 커서가 움직일 때마다 발생하는 이벤트
		area.addCaretListener(new CaretListener() {
			@Override
			public void caretUpdate(CaretEvent e) {
				//areaState.setText(""+area.getCaretPosition());
				areaState.setText(""+area.getCaret());
			}
		});
		
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				String text = area.getText();
				
				areaState.setText(String.format("characters : %d", text.length()));
				
			}
		});
		
		add(areaState, "North");
		add(area, "Center");
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new S12_JTextArea();
	}
}
