package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.component.ImageLabel;

// ������Ʈ�� ������ �� ������ �ִ� ��ɵ��� Ȯ���ϰ� �� ��ɵ��� �̿��ؼ� ������ ������ �ؾ��� ��� ������ �� �����ϰ� �ű⿡ �´� ��ɵ��� ã���� �ȵȴ�
public class S08_CardLayout extends JFrame{
	
	public S08_CardLayout() {
		super("Card Layout!!");
		
		JButton btn = new JButton("South Button");
		
		JPanel panel = new JPanel();
		
		
		// ī�� ���̾ƿ� : ī��ó�� ���� ������Ʈ�� �ѱ�� ����� �ִ� ���̾ƿ�
		CardLayout cardLayoutManager = new CardLayout();
		
		panel.setLayout(cardLayoutManager);		
		
//		panel.add("Apple", new JLabel("���")); 	// �󺧿� �̹����� �ְ������ �̷��� �� ���� �ƴ϶� ������ ���� �¾������� ����� �ϴµ� �̷��� 4���� �߰��ϸ�
//		panel.add("Banana", new JLabel("�ٳ���"));// �ʱ�ȭ�� 4���̳� �ؾ��ϹǷ� �̷��� ������ �͵��� ���� �� Ŭ������ ���� ��üȭ�� ���ش�
				
		panel.add("Apple", new ImageLabel("image/���.jpg")); 	
		panel.add("Banana", new ImageLabel("image/�ٳ���.jpg"));
		panel.add("Mango", new ImageLabel("image/����.jpg"));
		panel.add("Peach", new ImageLabel("image/������.jpg"));
		
		add(btn, "South");
		add(panel, "Center");
		
		// �̺�Ʈ ������
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���⼱ �������� �����ִ� �׼� �ϳ��� ����ȴ� ���ʿ� ù���� ī�� ������ ī�� �̵��ϴ°� ���� �����ָ� ��ư�� �Ѱ��ε� �� ����� ������ ���� ����
				// next(parent) : ī�� ���̾ƿ��� �������� �ѱ��
				// ī�� ���̾ƿ��� ������ ���� ��� �����̳ʸ� �����ؾ� �ϴ��� �Ű������� �˷���� �Ѵ�.
				cardLayoutManager.next(panel);
				
				
				// previous(parent) : ī�� ���̾ƿ��� �������� �ѱ��
				//cardLayoutManager.previous(panel);
				// first(parent) : ù ��° ī��� �̵��ϱ�
				cardLayoutManager.first(panel);

				// last(parent) : ������ ī��� �̵��ϱ�
				cardLayoutManager.last(panel);
				
				// show(parent, cardname) : ���ϴ� ī��� �̵��ϱ� / �����̳ʿ� �߰��� �� �ٿ��� �̸��� �ʿ��ϴ�
				cardLayoutManager.show(panel, "Mango"); // ��ҹ��� ���� ö��
				cardLayoutManager.previous(panel);
				cardLayoutManager.next(panel);
				
			}
		});
		
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new S08_CardLayout();
	}
}
