package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_JavaSwing {

	/*
	 	# JavaSwing
	 	
	 	 - javax.swing ��Ű���� Ŭ������
	 	 - GUI ���α׷��� ���� �� �ִ�
	 	 
	 	# Container
	 	
	 	 - ���� ������Ʈ���� ��ġ�� �� �ִ� ��
	 	 - JFrame, JPanel, JDialog ... �� �پ��� Ŭ������ �����̳� ������ �� �� �ִ�
	 	 - �����̳ʿ��� ���̾ƿ��� ������ �� �ִ�
	 	 
	 	# Component
	 	
	 	 - �����̳� ���� ��ġ�� �� �ִ� �پ��� �͵�
	 	 - ��ư, ǥ, �����̴�, �޴� ... �� �پ��� Ŭ������ ������Ʈ ������ �� �� �ִ�
	 */
	public static void main(String[] args) {
		
		// ������(����ִ� â) �ν��Ͻ� ����
		JFrame frame = new JFrame();
		frame.setLayout(null);// ������Ʈ ũ�� ���� �����ϱ� ���� ���̾ƿ� �η� ����
		
		// ������ ���� �ٸ� ������Ʈ�� ���� �� �ִ�
		JButton btn = new JButton("This is a button"); // ���⼭ ��ư�̸� �ʱ�ȭ ���൵ �ǰ�
		JButton btn2 = new JButton("2");
		// ������Ʈ�� ũ�⸦ ���� �����ϱ� ���ؼ��� ���̴� ���� ���̾ƿ��� ����� �Ѵ�
//		btn.setLocation(50, 50);
//		btn.setSize(200, 80);
		btn.setText("��ư 1"); // �̷������� �޼��� ������൵ �ȴ�
		btn.setBounds(50, 50, 200, 80); // ��ư�� ��ġ ũ�� �ѹ��� �������ִ� �޼���
		
		btn2.setLocation(300, 50);
		btn2.setSize(100, 300);
		
		frame.add(btn); // �����ӿ� ������Ʈ�� �߰��Ѵ�
		frame.add(btn2);
		
		/* 
		  �������� x��ư�� ������ �� ������ ����
		  ������ �� �ִ� int ���� JFrame�� ����� �����Ǿ� �ִ�
		  
		  EXIT_ON_CLOSE : X��ư�� ������ ���α׷��� �����Ѵ�
		  DISPOSE_ON_CLOSE : ���� ����
		  DO_NOTHING_ON_CLOSE : ���� �����ص� ���α׷��� ������� �ʴ´�
		  HIDE_ON_CLOSE : ���� ����
		*/
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �׳� ���� �� 
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // �Ȳ�����
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // ��ȣ�ȿ� � �� �� �� �ִ��� Ȯ��
		
		// ������ ũ�� ����
		frame.setSize(500, 500);
		
		// ������ ��ġ ����(���� ������� ��� x�� + ����� ũ�� �ؾ���
		frame.setLocation(100, 100);
		
		// �������� ���̰� ����(�� �������� ���ִ� ���� ����)
		frame.setVisible(true);
		
		
	}
	
}
