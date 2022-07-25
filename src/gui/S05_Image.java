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
		super("Image test frame �̰Ź���"); // JFrame Ŭ������ ��Ʈ������ �޴� �����ڰ� Ÿ��Ʋ �������ִ� �޼��� ��ӹ޾Ƽ� ���α׷� �������� �����ȴ�
	
		JLabel label = new JLabel("Wait for click");
		JButton btn = new JButton("my button");
		
		
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
	
//		btn.addActionListener(new ActionListener() {		
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// label�� �̹��� ����
//				label.setIcon(new ImageIcon("image/��ī��1.jpg")); // IconŸ���� ���� 
//				label.setText("");// Ŭ���ϸ� wait for click ���ڰ� �����ֱ� ������ �����ַ���
//			}
//		});
		
		ArrayList<ImageIcon> icons = new ArrayList<>();
		
		File imageDir = new File("image/");
		
		for(File image : imageDir.listFiles()) {
			icons.add(new ImageIcon(image.getAbsolutePath()));
		}
				
		// �������� : ��ư�� ������ ���� �׸����� ���������� ��ȯ�ǵ��� �����
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = icons.remove(0);
				icons.add(icon);
				label.setText("");// Ŭ���ϸ� wait for click ���ڰ� �����ֱ� ������ �����ַ���
				label.setIcon(icon); // IconŸ���� ����
			}
		});
		
	
		add(label, "Center"); // BorderLayout.CENTER�� ����
		add(btn, "South");
		
		setBounds(1300,200,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new S05_Image();
		
		
	}
	
}
