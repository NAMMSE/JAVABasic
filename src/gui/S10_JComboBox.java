package gui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class S10_JComboBox extends JFrame{
	public S10_JComboBox() {
		
		setTitle("ComboBox Example");
		
		JComboBox<String> combo = new JComboBox<>();
		
		combo.setBounds(50,50,100,20);
		combo.addItem("apple");
		combo.addItem("banana");
		combo.addItem("mango");
		combo.addItem("peach");
		add(combo);
		
		combo.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				// 아이템 선택이 바뀔때마다 선택된 아이템과 선택 해제된 아이템이 이벤트로 도착한다
				switch(e.getStateChange()) {
				case ItemEvent.SELECTED:
					System.out.println("selected : "+e.getItem());
					break;
				case ItemEvent.DESELECTED:
					System.out.println("deselcted : "+e.getItem());
					break;
				}
				
				//System.out.println(e.getItem()); // 이것도 선택하면 두개씩 출력되는데 해결방법 위에
				
			}
		});
		
		
		setLayout(null);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new S10_JComboBox();
	}

}
