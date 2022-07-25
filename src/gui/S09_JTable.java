package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;

public class S09_JTable extends JFrame{

	public S09_JTable() {
		
		String[][] rowData = {
				{"아메리카노", "1500"},
				{"아메리카노", "1500"},
				{"아메리카노", "1500"},
				{"아메리카노", "1500"},
		};
		String[] columnNames = {"Coffee Name", "Price"};
		
		// JTable은 ScrollPane에 붙여야 제대로 나온다
		JTable table = new JTable(rowData, columnNames);
		JButton south = new JButton("print console!");
		
		// 테이블 수정 막기
		//table.setEnabled(false);
		
		// 테이블 선택 이벤트 / 여기 나오는 메서드들은 강사님도 잘 모르시고 그냥 이렇게 찾아가면서 해야되는거 알려주시려고 해보는 것
		
		// ListSelectionModel : 테이블 선택에 관련된 설정을 할 수 있는 모델
		ListSelectionModel selectionModel = table.getSelectionModel();
		
		// setSelectionMode : 선택 모드를 설정할 수 있다 (테이블 행을 몇개 선택할 수 있는지 드래그하면 다 드래그 되는지 한개씩만 되는지 등등)
		selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// 선택 모드가 무엇인지 알 수 있다
		// System.out.println("선택 모드 : " + selectionModel.getSelectionMode());
		
		// cellSelection : 한 셀만 선택할 수 있도록 설정
		table.setCellSelectionEnabled(true);

		// 테이블 선택 이벤트
		selectionModel.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting()) { // 이게 없으면 마우스 클릭때 한번 놓을때 한번 해서 두번 출력된다
					System.out.println("selected row  : " + table.getSelectedRow());
					System.out.println("selected column : " + table.getSelectedColumn());
				}else {
					System.out.println("Adjusting...(마우스를 꾹 누르고 조정중)");
					
					System.out.println("Adjusting firstIndex : "+e.getFirstIndex());
					System.out.println("Adjusting LastIndex : "+e.getLastIndex());
				}
				
			}
		});
		
		// 특정 컴포넌트를 스크롤 가능한 형태로 보여주기 위해 사용된다
		JScrollPane scrollPane = new JScrollPane(table);
		
		add(scrollPane, "Center");
		add(south, "South");

		// 테이블 내부의 데이터 콘솔에서 보기
		south.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 테이블 데이터 정보는 table.getModel()로 꺼내야 한다
				TableModel model = table.getModel();
				
				int rowCount = model.getRowCount();
				int colCount = model.getColumnCount();
				
				System.out.println("컬럼 개수 : " + colCount);
				System.out.println("행 개수 : "+rowCount);
				
				for(int row = 0;row<rowCount;row++) {
					for(int col = 0;col<colCount;col++) {
						System.out.print(model.getValueAt(row, col) + "\t");
					}
					System.out.println();
				}
				
				
			}
		});
		
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}	
	
	public static void main(String[] args) {
		
		new S09_JTable();
	}

}
