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
				{"�Ƹ޸�ī��", "1500"},
				{"�Ƹ޸�ī��", "1500"},
				{"�Ƹ޸�ī��", "1500"},
				{"�Ƹ޸�ī��", "1500"},
		};
		String[] columnNames = {"Coffee Name", "Price"};
		
		// JTable�� ScrollPane�� �ٿ��� ����� ���´�
		JTable table = new JTable(rowData, columnNames);
		JButton south = new JButton("print console!");
		
		// ���̺� ���� ����
		//table.setEnabled(false);
		
		// ���̺� ���� �̺�Ʈ / ���� ������ �޼������ ����Ե� �� �𸣽ð� �׳� �̷��� ã�ư��鼭 �ؾߵǴ°� �˷��ֽ÷��� �غ��� ��
		
		// ListSelectionModel : ���̺� ���ÿ� ���õ� ������ �� �� �ִ� ��
		ListSelectionModel selectionModel = table.getSelectionModel();
		
		// setSelectionMode : ���� ��带 ������ �� �ִ� (���̺� ���� � ������ �� �ִ��� �巡���ϸ� �� �巡�� �Ǵ��� �Ѱ����� �Ǵ��� ���)
		selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// ���� ��尡 �������� �� �� �ִ�
		// System.out.println("���� ��� : " + selectionModel.getSelectionMode());
		
		// cellSelection : �� ���� ������ �� �ֵ��� ����
		table.setCellSelectionEnabled(true);

		// ���̺� ���� �̺�Ʈ
		selectionModel.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting()) { // �̰� ������ ���콺 Ŭ���� �ѹ� ������ �ѹ� �ؼ� �ι� ��µȴ�
					System.out.println("selected row  : " + table.getSelectedRow());
					System.out.println("selected column : " + table.getSelectedColumn());
				}else {
					System.out.println("Adjusting...(���콺�� �� ������ ������)");
					
					System.out.println("Adjusting firstIndex : "+e.getFirstIndex());
					System.out.println("Adjusting LastIndex : "+e.getLastIndex());
				}
				
			}
		});
		
		// Ư�� ������Ʈ�� ��ũ�� ������ ���·� �����ֱ� ���� ���ȴ�
		JScrollPane scrollPane = new JScrollPane(table);
		
		add(scrollPane, "Center");
		add(south, "South");

		// ���̺� ������ ������ �ֿܼ��� ����
		south.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���̺� ������ ������ table.getModel()�� ������ �Ѵ�
				TableModel model = table.getModel();
				
				int rowCount = model.getRowCount();
				int colCount = model.getColumnCount();
				
				System.out.println("�÷� ���� : " + colCount);
				System.out.println("�� ���� : "+rowCount);
				
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
