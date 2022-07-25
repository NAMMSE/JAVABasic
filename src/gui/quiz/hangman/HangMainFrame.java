package gui.quiz.hangman;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.hangman.event.EnglishButtonEvent;

public class HangMainFrame extends JFrame{

	HangPicturePanel picturePanel = new HangPicturePanel();
	HangEnglishPanel englishPanel = new HangEnglishPanel();
	
	String[] words = {"Programming", "C Language","Python Programmer", "WebDesigner"};

	
	// �̺�Ʈ Ŭ�������� �� ������Ʈ���� ����ؾ��ϴµ� ������Ʈ��� �̺�Ʈ�� �ٸ� ��Ű�� �̹Ƿ� ������Ʈ�鿡 �����Ϸ��� ���������Ʈ Ŭ������ public�� �ٿ����ϴµ�
	// �װͺ��ٴ� ���ο��� ������Ʈ���� �����ؼ� �̺�ƮŬ�������� �ٷ�°��� ȿ�����̶� �̷������� �Ѵ� �� �ٷ�� �޼��尡 �ؿ� �ΰ�
	// �������� ��� ������Ʈ�� ��Ʈ�� �� �� �ִ� �޼���� ����
	public void nextPicture() {
		picturePanel.cardLayoutManager.next(picturePanel);
	}
	
	public void newGame() {
		englishPanel.answerLabel.update(words[(int)(Math.random()*words.length)]);
	}

	public boolean checkAnswer(String cmd) {
		return englishPanel.answerLabel.checkAnswer(cmd);
	}

	////////////////////////////////////////////////////////////////////////////////
	public HangMainFrame() {
		setTitle("Hang Man");
		
		// �����ӿ� ������Ʈ �߰�
		// ��- �׸��� �ٲ�� �г� (ī�� ���̾ƿ� ����)
		add(picturePanel, "Center");
		// ������ �������� ��
		add(englishPanel, "South");
		
		// �����ӿ� ��� �̺�Ʈ �߰� (�ϸ鼭 ������ �ν��Ͻ��� �ѱ�)
		EnglishButtonEvent btnEvent = new EnglishButtonEvent(this); // this�� nextpicture, newgame�� �����Ѥ���
		
		for(JButton btn : englishPanel.getAllkey()) {
			btn.addActionListener(btnEvent);
		}
		
		
		// ������ ���� �ʱ�ȭ ����
		newGame();
		setResizable(false);
		setBounds(100,100,800,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
