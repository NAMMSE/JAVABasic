package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S05_Image extends JFrame{
	
	public S05_Image() {
		super("Image test frame 이거뭐지"); // JFrame 클래스에 스트링으로 받는 생성자가 타이틀 설정해주는 메서드 상속받아서 프로그램 제목으로 설정된다
	
		JLabel label = new JLabel("Wait for click");
		JButton btn = new JButton("my button");
		
		
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
	
//		btn.addActionListener(new ActionListener() {		
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// label의 이미지 변경
//				label.setIcon(new ImageIcon("image/코카투1.jpg")); // Icon타입의 변수 
//				label.setText("");// 클릭하면 wait for click 글자가 남아있기 때문에 지워주려고
//			}
//		});
		
		ArrayList<ImageIcon> icons = new ArrayList<>();
		
		File imageDir = new File("image/");
		
		for(File image : imageDir.listFiles()) {
			icons.add(new ImageIcon(image.getAbsolutePath()));
		}
				
		// 연습문제 : 버튼을 누르면 여러 그림들이 순차적으로 순환되도록 만들기
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = icons.remove(0);
				icons.add(icon);
				label.setText("");// 클릭하면 wait for click 글자가 남아있기 때문에 지워주려고
				label.setIcon(icon); // Icon타입의 변수
			}
		});
		
	
		add(label, "Center"); // BorderLayout.CENTER랑 같다
		add(btn, "South");
		
		setBounds(1300,200,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new S05_Image();
		
		
	}
	
}
