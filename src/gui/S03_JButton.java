package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// ��Ű���� �������� �����ӳ��� ��ư�� ��ư���� ������� ���� �ִ� (������ �� �̷��� �ϴ°� �����Ͻôµ�)
public class S03_JButton extends JFrame{ // Jframe ���
	
	// JButton mainBtn = new JButton("main"); // �̰͵� �ǰ�
	JButton mainBtn = new JButton();
	JButton subBtn = new JButton("click!");
	
	public S03_JButton() {
		
		// �ؽ�Ʈ ����
		mainBtn.setText("main"); // �̰͵� �ȴ�
		
		// �۲� ����
		mainBtn.setFont(new Font("�ü�ü", Font.PLAIN, 50)); // C: windows�� Fonts �����ȿ� �ִ� �۲õ��� �������� ��
		subBtn.setFont(new Font("�ü�ü", Font.ITALIC, 50));
		
		// ���� ����
		mainBtn.setForeground(new Color(0xffff00)); // ���� ��
		mainBtn.setBackground(new Color(0x000000)); // ��� ��
		
		// ��ư �̺�Ʈ ���� (�׼� ������)
		subBtn.addActionListener(new ActionListener(){ // �׼Ǹ����ʴ� �������̽���
			@Override
			public void actionPerformed(ActionEvent e) { // �� ���������ϴ� �޼���
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
