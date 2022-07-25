package gui.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// ���ĺ� ��ư�� �׸���� �׸��� �� ���ʴ� 

public class S07_Hangman extends JFrame{

	// ��� ������
	//static HashMap<JButton,String> btnName = new HashMap<>();
	//static GridLayout alphabetPanel = new GridLayout(3,9);
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static String[] wordList = {"APPLE","BANANA","GRAPE","PEAR","PEACH","PIZZA", "BOTTLE", "COMPUTER"};
	static String word = wordList[(int)(Math.random()*wordList.length)]; // �������� ���� ���� �ܾ�
	static String blank = wordCount(); // �����ܾ��� ���̸�ŭ�� ��ĭ ���ڿ�
	static JLabel image = new JLabel();
	static JLabel printWord = new JLabel(blank); // �ܾ� ���� �� ��ŭ ��ĭ ����ϴ� ��
	static JPanel panel = new JPanel(new GridLayout(2,1)); // ������ �ǳڿ� �� 2��¥�� �ǳ�
	static int deathCount = 0; // Ʋ�������� ++
	static ArrayList<ImageIcon> images = new ArrayList<>();
	static JButton[] btns = new JButton[26]; // A~Z ��ư 26��
	static boolean gameContinous=true; // ������ ��� �������̸� 0 �¸��� 1 �й�� -1
	static JButton eventBtn; // �ش� ��ư�� ��� ��ư���� ��ȯ�ϴ� ��ư�� ����
	
	
	public static ActionListener btnAction = new ActionListener() { // ������ �ȿ��� ������ ��ư �������� �������� �׼Ǹ�����
		@Override
		public void actionPerformed(ActionEvent e) {
			if(gameContinous) { // ������ �������̸� ��ư �׼��� �Ͼ��
				eventBtn = (JButton) e.getSource(); // Ŭ���� ��ư ��ȯ
				eventBtn.setBackground(new Color(0x000000));
				btnFunction(eventBtn.getText()); // �ش� ��ư�� ���ĺ��� ���ڷ� �����ܾ�� ���԰� ���ÿ� �̹��� ��ȯ���� �ϴ� �޼���
				printWord.setText(blank); // ���� ��ĭ�̿��� ���ڿ� ������ Ŭ�� ���� �ٲ� ���ڿ� ������ �����Ͽ� �ٽ� �� ���
				gameContinue();
			}
			else {
				printWord.setText("ANSWER : "+word);
			}
		}
	};
	
	public static void btnFunction(String value) { // �ܾ� ���Ͽ� ��ĭ ä��ų� �̹��� ��ȯ�� �޼���
		boolean cnt=true; // �ܾ� ���Ͽ� ���ĺ� ��ġ�°� ������ false, true�� if�� ������ ���� �̹����� ��ȯ
		char[] arr = blank.toCharArray(); // ��ĭ�� ���ڿ��̹Ƿ� �� �ڸ��� ä����� �迭�� �ٲ㼭 ���ڸ��� ���ؾ��ϱ� ������
		String str = "";
		
		for(int i=0;i<word.length();i++) {
			if(value.equals(String.format("%s", word.charAt(i)))) {
				arr[i]=word.charAt(i);
				eventBtn.setBackground(new Color(0xffff00)); // ��ġ�� ���ڴ� ���� �ٸ��ɷ� �ٲ۴�
				cnt = false;
			}
		}
		for(int i=0;i<word.length();i++) {
			str=str+arr[i]; // 
		}
		blank=str; // ���������� ��� ���ϰ�
		if(blank.equals(word)) { // ���� ���� blank�� ���� �ܾ ������ ��� �¸� �̹��� ���
			image.setIcon(new ImageIcon("image/9.png"));  //images.get(8)); // �¸��̹����� �ٲ۴� // ����Ʈ�� �̾Ƴ��� �������� �׳� �̹��� �̾Ƴ���
			gameContinous=false;
		}
		else{//if(!blank.equals(word)) {
			if(cnt&&deathCount<7) { // ���ĺ��� ��ġ�ϴ°� ������ true && ��ȸ�� 7���� �ʰ����� ������ true
				ImageIcon icon = images.remove(1); // images�� 2���� 9���� ���� ����ִ� ����
				images.add(icon); // 2���� 9������ ������ images ����Ʈ�� �ְ�
				image.setIcon(icon); // �̹��� �󺧿� 2������ �׸��� ����Ѵ�
				deathCount++; // 7���� ��ȸ�� ī��Ʈ�Ͽ� �Ѿ�� �й� �̹����� ���������� ��µǰ� �̹����� �ٲ��� �ʴ´�	
			}
		}
	} // �޼��� ��

	
	public S07_Hangman() {

		JPanel alphapanel = new JPanel(new GridLayout(3,9)); // ������ �ǳ��� �Ʒ��κ� �ǳڿ� ���� 27�� ¥�� �ǳ� /�̰� ��� �ذ����� �ذ���
		
		JLabel firstBlank = new JLabel(wordCount()); // ó�� ��ĭ�� ���ڼ���ŭ ���� ��ĭ�̹Ƿ� ���� ���� ������ش�
		
		image.setIcon(new ImageIcon("image/1.png")); // �ʱ� ��� �̹��� ����
		image.setHorizontalAlignment(JLabel.CENTER); // ��� ����
		
		printWord.setHorizontalAlignment(JLabel.CENTER); // ��� ����
		printWord.setFont(new Font("����ü", Font.BOLD, 30));
		panel.add(printWord); // ������ �� - �����ܾ� ��ĭ ����ϴ� �� add
		panel.add(alphapanel); // ������ �Ʒ� - 26�� ���ĺ� �׸���� ���� 27��¥�� �ǳ� ����
		
		File imageDir = new File("image/");
		for(File image : imageDir.listFiles()) {
			images.add(new ImageIcon(image.getAbsolutePath()));
		}
		
		for(int i=0;i<26;i++) { // 26�� ��ư �迭�� ���� ���ĺ� �ؽ�Ʈ�� �־��ְ� �׼Ǹ����� �����ϴ� ����
			btns[i]= new JButton(alphabet.substring(i,i+1)); // ������� �ִ°� ȿ�������� �𸣰���
			btns[i].setBackground(new Color(0xffffff));
			btns[i].addActionListener(btnAction);
			alphapanel.add(btns[i]);
		}
		
		add(image);
		add(panel);
		
		setTitle("Hang Man");
		setLayout(new GridLayout(1,2)); // ���� ��� �̹��� , ������ �� �ܾ�, ������ �Ʒ� ���ĺ� ��ư
		setBounds(100, 100, 900, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static String wordCount() { // ���� �ܾ��� ���� �� ��ŭ ��ĭ ���ڿ��� ����
		String str="";
		for(int i=0;i<word.length();i++) {
			str=str+"��";
		}
		return str;
	}
	
	public static void gameContinue() {
		if(deathCount>6) {
			gameContinous = false;
		}
	}
	
	public static void main(String[] args) {
		new S07_Hangman();
	}
}
	
























