package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_BorderLayout {

	/*
	 	컴포넌트를 배치할 수 있는 컨테이너에는 레이아웃(컴포넌트를 배치하는 방식)을 설정할 수 있다
	 	
	 	# BorderLayout
	 	
	 	 - 동서남북과 가운데로 이루어진 레이아웃
	 	 - JFrame의 기본값
	 */
	
	public static void main(String[] args) {
		JFrame f = new JFrame("BorderLayout test");
		
		BorderLayout manager = new BorderLayout();
		
		// 레이아웃의 컴포넌트 사이 거리 설정 / 이 메서드는 생성자에서도 설정할 수 있고 레이아웃에서는 이 값말고 딱히 건드릴게 없다
		manager.setHgap(10); // Horizontal (수평)
		manager.setVgap(10); // Vertical (수직)
		
		f.setLayout(new BorderLayout());
		
		//f.add(new JButton("btn1"), BorderLayout.CENTER);
		f.add(new JButton("btn2"), BorderLayout.EAST);
		f.add(new JButton("btn3"), BorderLayout.WEST);
	//	f.add(new JButton("btn4"), BorderLayout.SOUTH);
	//	f.add(new JButton("btn5"), BorderLayout.NORTH);
		
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
