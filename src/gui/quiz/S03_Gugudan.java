package gui.quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.action.GugudanButtonAction;

public class S03_Gugudan extends JFrame{

	/*
	 	�����ϸ� �������� ��µǴ� GUI ���α׷� 
	 	
	 	1. �����ϸ� 2���� ��µǾ� �ִ� ���·� �����Ѵ�
	 	2. + ��ư�� ������ ���� ������ �������� ��µȴ� (�ִ� 19�� ����)
	 	3. - ��ư�� ������ ���� ������ �������� ��µȴ� (�ּ� 2�� ����)
	 */
	
	// �� �ڵ�
//	static int START_NUM = 2;
//	
//	JButton plus = new JButton("+");
//	JButton minus = new JButton("-");
//	JButton gugu = new JButton();
//	
//	public S03_Gugudan() {
//		add(plus, BorderLayout.WEST);
//		add(minus, BorderLayout.EAST);
//		add(gugu, BorderLayout.CENTER);
//		
//		plus.setFont(new Font("����ü", Font.BOLD,80));
//		minus.setFont(new Font("����ü", Font.BOLD,80));
//		gugu.setFont(new Font("����ü", Font.BOLD,12));
//		
//		plus.setForeground(new Color(0xffff00));
//		minus.setForeground(new Color(0xffff00));
//		plus.setBackground(new Color(0x000000));
//		minus.setBackground(new Color(0x000000));
//		
//		gugu.setForeground(new Color(0xffff00)); // ���� ��
//		gugu.setBackground(new Color(0x000000)); // ��� ��
//		
//		gugu.setText(allgugu(gugudan(START_NUM))); // �ʱ� 2�� ���
//		
//		
//		plus.addActionListener(new ActionListener(){ // �׼Ǹ����ʴ� �������̽���
//			@Override
//			public void actionPerformed(ActionEvent e) { // �� ���������ϴ� �޼���
//				if(START_NUM>1&&START_NUM<20) {
//					if(START_NUM==19) {
//						gugu.setText(Arrays.toString(gugudan(START_NUM)));
//						return;
//					}						
//					START_NUM++;
//					gugu.setText(Arrays.toString(gugudan(START_NUM)));
//				}				
//			}
//		});
//		
//		minus.addActionListener(new ActionListener(){ // �׼Ǹ����ʴ� �������̽���
//			@Override
//			public void actionPerformed(ActionEvent e) { // �� ���������ϴ� �޼���
//				if(START_NUM>1&&START_NUM<20) {
//					if(START_NUM==2) {
//						gugu.setText(Arrays.toString(gugudan(START_NUM)));
//						return;
//					}						
//					START_NUM--;
//					gugu.setText(Arrays.toString(gugudan(START_NUM)));
//				}
//			}
//		});
//		
//		setLocation(100, 100);
//		setSize(1000, 500);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setVisible(true);
//	}
//	
//	public static String[] gugudan(int num) {
//		String[] gugu = new String[9];
//		
//		if(num>19||num<2) return null;
//		for(int i=2;i<=num;i++) {
//			for(int j=1, k=0;j<10;j++) {
//				gugu[k++]=String.format("%d * %d = %d\n", i,j,i*j);
//			}
//		}
//		return gugu;
//	}
//	
//	public static String allgugu(String[] gugu) {
//		String str = String.format("%s\n %s\n %s\n %s\n %s\n %s\n %s\n %s\n %s", gugu[0],gugu[1],gugu[2],gugu[3],gugu[4],gugu[5],gugu[6],gugu[7],gugu[8]);
//		return str;
//		
//	}
//	
//	public static void main(String[] args) {
//		new S03_Gugudan();
//	}
	
	// ����� �ڵ�
	public static void main(String[] args) {
		JFrame gugudan = new JFrame("������");
		
		JButton[] guBtn = new JButton[9];
		
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		
		
		for(int i=0;i<9;i++) {
			guBtn[i] = new JButton(String.format("%d x %d = %d", 2, i+1, 2*(i+1)));
			guBtn[i].setBounds(0, 40*i, 300, 40);
			gugudan.add(guBtn[i]);
		}
		
		ActionListener gugudanAction = new GugudanButtonAction(guBtn);
		
		plus.setBounds(300, 0, 60, 200);
		minus.setBounds(300, 200, 60, 200);
		plus.addActionListener(gugudanAction);
		minus.addActionListener(gugudanAction);
		
		gugudan.add(plus);
		gugudan.add(minus);
		
		
		gugudan.setResizable(false); // �ڹ� ����â ������� ���콺�� ũ�� ������ �ȵ�
		gugudan.setLayout(null); // ���̾ƿ��� �����ʰ� ���� ũ�⸦ �����߱� ������ ���̾ƿ����� ���� �־�����Ѵ�
		gugudan.setBounds(100, 100, 370, 400); // ������ ũ�� ��ġ �ѹ��� �������ִ� �޼���
		gugudan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gugudan.setVisible(true);
	}
}


