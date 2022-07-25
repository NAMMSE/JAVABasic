package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 패키지에 프레임은 프레임끼리 버튼은 버튼끼리 묶어놓을 수가 있다 (플젝할 때 이렇게 하는걸 권장하시는듯)
public class S03_JButton extends JFrame{ // Jframe 상속
	
	// JButton mainBtn = new JButton("main"); // 이것도 되고
	JButton mainBtn = new JButton();
	JButton subBtn = new JButton("click!");
	
	public S03_JButton() {
		
		// 텍스트 설정
		mainBtn.setText("main"); // 이것도 된다
		
		// 글꼴 설정
		mainBtn.setFont(new Font("궁서체", Font.PLAIN, 50)); // C: windows에 Fonts 폴더안에 있는 글꼴들을 가져오는 것
		subBtn.setFont(new Font("궁서체", Font.ITALIC, 50));
		
		// 색상 설정
		mainBtn.setForeground(new Color(0xffff00)); // 글자 색
		mainBtn.setBackground(new Color(0x000000)); // 배경 색
		
		// 버튼 이벤트 설정 (액션 리스너)
		subBtn.addActionListener(new ActionListener(){ // 액션리스너는 인터페이스임
			@Override
			public void actionPerformed(ActionEvent e) { // 꼭 만들어줘야하는 메서드
				mainBtn.setText(Integer.toString(((int)Math.random()+1*100)));
			}
			
		});
		
		add(mainBtn, BorderLayout.CENTER);
		add(subBtn, BorderLayout.NORTH);
		
		setTitle("JButton Practice!!");
		setLocation(100, 100);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S03_JButton();
	}

}
