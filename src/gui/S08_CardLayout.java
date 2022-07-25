package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.component.ImageLabel;

// 컴포넌트를 구현할 때 스윙에 있는 기능들을 확인하고 이 기능들을 이용해서 구현할 생각을 해야지 어떻게 구현할 지 생각하고 거기에 맞는 기능들을 찾으면 안된다
public class S08_CardLayout extends JFrame{
	
	public S08_CardLayout() {
		super("Card Layout!!");
		
		JButton btn = new JButton("South Button");
		
		JPanel panel = new JPanel();
		
		
		// 카드 레이아웃 : 카드처럼 다음 컴포넌트로 넘기는 기능이 있는 레이아웃
		CardLayout cardLayoutManager = new CardLayout();
		
		panel.setLayout(cardLayoutManager);		
		
//		panel.add("Apple", new JLabel("사과")); 	// 라벨에 이미지를 넣고싶으면 이렇게 뉴 라벨이 아니라 변수로 만들어서 셋아이콘을 해줘야 하는데 이렇게 4개를 추가하면
//		panel.add("Banana", new JLabel("바나나"));// 초기화를 4번이나 해야하므로 이렇게 공통인 것들이 있을 때 클래스를 만들어서 객체화를 해준다
				
		panel.add("Apple", new ImageLabel("image/사과.jpg")); 	
		panel.add("Banana", new ImageLabel("image/바나나.jpg"));
		panel.add("Mango", new ImageLabel("image/망고.jpg"));
		panel.add("Peach", new ImageLabel("image/복숭아.jpg"));
		
		add(btn, "South");
		add(panel, "Center");
		
		// 이벤트 리스너
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 여기선 마지막에 적어주는 액션 하나만 적용된다 애초에 첫번쨰 카드 마지막 카드 이동하는걸 같이 적어주면 버튼은 한개인데 두 기능을 적용할 수가 없다
				// next(parent) : 카드 레이아웃을 다음으로 넘기기
				// 카드 레이아웃을 조작할 때는 어느 컨테이너를 조작해야 하는지 매개변수로 알려줘야 한다.
				cardLayoutManager.next(panel);
				
				
				// previous(parent) : 카드 레이아웃을 이전으로 넘기기
				//cardLayoutManager.previous(panel);
				// first(parent) : 첫 번째 카드로 이동하기
				cardLayoutManager.first(panel);

				// last(parent) : 마지막 카드로 이동하기
				cardLayoutManager.last(panel);
				
				// show(parent, cardname) : 원하는 카드로 이동하기 / 컨테이너에 추가할 때 붙였던 이름이 필요하다
				cardLayoutManager.show(panel, "Mango"); // 대소문자 구분 철저
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
