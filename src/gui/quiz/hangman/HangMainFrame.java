package gui.quiz.hangman;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.hangman.event.EnglishButtonEvent;

public class HangMainFrame extends JFrame{

	HangPicturePanel picturePanel = new HangPicturePanel();
	HangEnglishPanel englishPanel = new HangEnglishPanel();
	
	String[] words = {"Programming", "C Language","Python Programmer", "WebDesigner"};

	
	// 이벤트 클래스에서 각 컴포넌트들을 사용해야하는데 컴포넌트들과 이벤트가 다른 패키지 이므로 컴포넌트들에 접근하려면 모든컴포넌트 클래스에 public을 붙여야하는데
	// 그것보다는 메인에서 컴포넌트들을 취합해서 이벤트클래스에서 다루는것이 효율적이라 이런식으로 한다 그 다루는 메서드가 밑에 두개
	// 프레임의 모든 컴포넌트를 컨트롤 할 수 있는 메서드들 모음
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
		
		// 프레임에 컴포넌트 추가
		// 위- 그림이 바뀌는 패널 (카드 레이아웃 예정)
		add(picturePanel, "Center");
		// 정답이 보여지는 라벨
		add(englishPanel, "South");
		
		// 프레임에 모든 이벤트 추가 (하면서 메인의 인스턴스를 넘김)
		EnglishButtonEvent btnEvent = new EnglishButtonEvent(this); // this가 nextpicture, newgame을 지정한ㄴ다
		
		for(JButton btn : englishPanel.getAllkey()) {
			btn.addActionListener(btnEvent);
		}
		
		
		// 프레임 관련 초기화 설정
		newGame();
		setResizable(false);
		setBounds(100,100,800,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
