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

// 알파벳 버튼은 그리드로 그림은 라벨 최초는 

public class S07_Hangman extends JFrame{

	// 행맨 만들어보기
	//static HashMap<JButton,String> btnName = new HashMap<>();
	//static GridLayout alphabetPanel = new GridLayout(3,9);
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static String[] wordList = {"APPLE","BANANA","GRAPE","PEAR","PEACH","PIZZA", "BOTTLE", "COMPUTER"};
	static String word = wordList[(int)(Math.random()*wordList.length)]; // 랜덤으로 뽑은 문제 단어
	static String blank = wordCount(); // 문제단어의 길이만큼의 빈칸 문자열
	static JLabel image = new JLabel();
	static JLabel printWord = new JLabel(blank); // 단어 글자 수 만큼 빈칸 출력하는 라벨
	static JPanel panel = new JPanel(new GridLayout(2,1)); // 오른쪽 판넬에 들어갈 2개짜리 판넬
	static int deathCount = 0; // 틀릴때마다 ++
	static ArrayList<ImageIcon> images = new ArrayList<>();
	static JButton[] btns = new JButton[26]; // A~Z 버튼 26개
	static boolean gameContinous=true; // 게임이 계속 진행중이면 0 승리시 1 패배시 -1
	static JButton eventBtn; // 해당 버튼이 어느 버튼인지 반환하는 버튼형 변수
	
	
	public static ActionListener btnAction = new ActionListener() { // 생성자 안에서 돌리는 버튼 포문에서 설정해줄 액션리스너
		@Override
		public void actionPerformed(ActionEvent e) {
			if(gameContinous) { // 게임이 진행중이면 버튼 액션이 일어난다
				eventBtn = (JButton) e.getSource(); // 클릭한 버튼 반환
				eventBtn.setBackground(new Color(0x000000));
				btnFunction(eventBtn.getText()); // 해당 버튼의 알파벳을 인자로 문제단어와 비교함과 동시에 이미지 전환까지 하는 메서드
				printWord.setText(blank); // 기존 빈칸이였던 문자열 변수를 클릭 이후 바뀐 문자열 변수로 수정하여 다시 라벨 출력
				gameContinue();
			}
			else {
				printWord.setText("ANSWER : "+word);
			}
		}
	};
	
	public static void btnFunction(String value) { // 단어 비교하여 빈칸 채우거나 이미지 전환할 메서드
		boolean cnt=true; // 단어 비교하여 알파벳 겹치는게 있으면 false, true면 if문 돌려서 다음 이미지로 전환
		char[] arr = blank.toCharArray(); // 빈칸이 문자열이므로 각 자리를 채우려면 배열로 바꿔서 한자리씩 비교해야하기 때문에
		String str = "";
		
		for(int i=0;i<word.length();i++) {
			if(value.equals(String.format("%s", word.charAt(i)))) {
				arr[i]=word.charAt(i);
				eventBtn.setBackground(new Color(0xffff00)); // 겹치는 문자는 배경색 다른걸로 바꾼다
				cnt = false;
			}
		}
		for(int i=0;i<word.length();i++) {
			str=str+arr[i]; // 
		}
		blank=str; // 전역변수로 계속 변하게
		if(blank.equals(word)) { // 최종 비교한 blank와 문제 단어가 같으면 즉시 승리 이미지 출력
			image.setIcon(new ImageIcon("image/9.png"));  //images.get(8)); // 승리이미지로 바꾼다 // 리스트로 뽑아내면 에러나서 그냥 이미지 뽑아낸다
			gameContinous=false;
		}
		else{//if(!blank.equals(word)) {
			if(cnt&&deathCount<7) { // 알파벳이 일치하는게 없으면 true && 기회가 7번이 초과되지 않으면 true
				ImageIcon icon = images.remove(1); // images에 2부터 9까지 파일 들어있는 상태
				images.add(icon); // 2부터 9까지의 파일을 images 리스트에 넣고
				image.setIcon(icon); // 이미지 라벨에 2번부터 그림을 출력한다
				deathCount++; // 7번의 기회를 카운트하여 넘어가면 패배 이미지가 마지막으로 출력되고 이미지가 바뀌지 않는다	
			}
		}
	} // 메서드 끝

	
	public S07_Hangman() {

		JPanel alphapanel = new JPanel(new GridLayout(3,9)); // 오른쪽 판넬의 아래부분 판넬에 넣을 27개 짜리 판넬 /이거 어떻게 해결하지 해결함
		
		JLabel firstBlank = new JLabel(wordCount()); // 처음 빈칸은 글자수만큼 전부 빈칸이므로 따로 변수 만들어준다
		
		image.setIcon(new ImageIcon("image/1.png")); // 초기 행맨 이미지 설정
		image.setHorizontalAlignment(JLabel.CENTER); // 가운데 정렬
		
		printWord.setHorizontalAlignment(JLabel.CENTER); // 가운데 정렬
		printWord.setFont(new Font("바탕체", Font.BOLD, 30));
		panel.add(printWord); // 오른쪽 위 - 문제단어 빈칸 출력하는 라벨 add
		panel.add(alphapanel); // 오른쪽 아래 - 26개 알파벳 그리드로 넣을 27개짜리 판넬 설정
		
		File imageDir = new File("image/");
		for(File image : imageDir.listFiles()) {
			images.add(new ImageIcon(image.getAbsolutePath()));
		}
		
		for(int i=0;i<26;i++) { // 26개 버튼 배열에 각각 알파벳 텍스트로 넣어주고 액션리스너 실행하는 포문
			btns[i]= new JButton(alphabet.substring(i,i+1)); // 어떤식으로 넣는게 효율적인지 모르겠음
			btns[i].setBackground(new Color(0xffffff));
			btns[i].addActionListener(btnAction);
			alphapanel.add(btns[i]);
		}
		
		add(image);
		add(panel);
		
		setTitle("Hang Man");
		setLayout(new GridLayout(1,2)); // 왼쪽 행맨 이미지 , 오른쪽 위 단어, 오른쪽 아래 알파벳 버튼
		setBounds(100, 100, 900, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static String wordCount() { // 랜덤 단어의 글자 수 만큼 빈칸 문자열로 리턴
		String str="";
		for(int i=0;i<word.length();i++) {
			str=str+"□";
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
	
























