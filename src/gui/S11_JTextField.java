package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class S11_JTextField extends JFrame{
	
	public S11_JTextField() {
		super("TextField Example");
		
		JTextField tf = new JTextField();
		
		tf.setColumns(30);
		tf.setBounds(50,50,200,20);
		tf.setFont(new Font("궁서체",Font.BOLD,20));
		
		// 텍스트 필드에서 엔터키 누르면 액션 리스너 발동
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(tf.getText());
				tf.setText("");
			}
		});
		
		add(tf);
		
		setLayout(null);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S11_JTextField();
	}
}
