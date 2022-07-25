package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import database.OjdbcConnection;

public class J05_DisplayEmployeesDetailView {
	
	/*
	 	emp_details_view�� �ڹ� �ֿܼ� ���� ���� ����غ�����
	 */
	
	public static void main(String[] args) {
		
		// �� �ڵ�
//		String sql = "select * from emp_details_view";
//		
//		try (Connection conn = OjdbcConnection.getConnection();
//				PreparedStatement pstmt = conn.prepareStatement(sql);
//				ResultSet rs = pstmt.executeQuery();
//			){
//			ResultSetMetaData meta = rs.getMetaData();
//			
//			for(int i=1 ;i<=meta.getColumnCount();i++) { // i= 1���� �ؾ���
//				if(i>=13) System.out.print("\t");
//				System.out.printf("%s\t\t", meta.getColumnLabel(i));
//				
//			}
//			System.out.print("\n=======================================================================================================================================================================================================================================================================================================================================================================================================\n");
//			
//			while(rs.next()) {
//				//System.out.printf("%-8d%15s%-6d%-6d%-6d%15s%15s%15s%-6d%-6f%30s%40s%30s%20s%30s%20s\n",
//				//System.out.printf("%-5d\t\t\t%-10s\t\t%d\t\t\t%d\t\t\t%-5d\t\t\t%s\t\t\t%-5s\t\t\t%-10s\t\t\t%-5d\t\t\t%-5f\t\t\t%-10s\t\t\t%-10s\t\t\t%-10s\t\t\t%-10s\t\t\t%-10s\t\t\t%-10s\n",
//				System.out.printf("%-24d%-20s%-26d%-22d%-24d%-20s%-24s%-24s%-23d%-18.2f%-23s%-33s%-25s%-30s%-33s%s\n",
//						rs.getInt("employee_id"),
//						rs.getString("job_id"),
//						rs.getInt("manager_id"),
//						rs.getInt("department_id"),
//						rs.getInt("location_id"),
//						rs.getString("country_id"),
//						rs.getString("first_name"),
//						rs.getString("last_name"),
//						rs.getInt("salary"),
//						rs.getDouble("commission_pct"),
//						rs.getString("department_name"),
//						rs.getString("job_title"),
//						rs.getString("city"),
//						rs.getString("state_province"),
//						rs.getString("country_name"),
//						rs.getString("region_name"));
//			}
//			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
		// ����� �ڵ�
		String sql = "select * from emp_details_view";
		
		try (Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
			){
			ResultSetMetaData meta = rs.getMetaData(); // �ҷ��� ���̺��� ��Ÿ�����͵��� meta�� ����
			
			ArrayList<Integer> columnDisPlaySize = new ArrayList<>(); // �� �÷� �� ����Ҷ� ������ 
			ArrayList<String> columnLabel = new ArrayList<>(); // employee_id, job_id ���
			
			int columnSize = meta.getColumnCount(); // �÷��� �� ����
			
			for(int i=1 ;i<=columnSize;++i) { // i= 1���� �ؾ���
				int size = meta.getColumnDisplaySize(i);
				String label = meta.getColumnLabel(i);
				
				size = size > label.length() ? size : label.length();
				
				columnLabel.add(label);
				
				
//				columnDisPlaySize.add(meta.getColumnDisplaySize(i));
//				columnLabel.add(meta.getColumnLabel(i));
				
				String format = String.format("%%-%ds (%%2d) | ", size);
				//String format = String.format("%%-%ds (%%2d) |", meta.getColumnDisplaySize(i)); // ���ش� �Ǵµ� �ٽ� ����
				System.out.printf(format,meta.getColumnLabel(i),meta.getColumnDisplaySize(i));
				
				columnDisPlaySize.add(size+8);
				
			}
			
			System.out.println();
			
			for(int i = 0;i<columnSize ; ++i) {
				
				int displaySize = columnDisPlaySize.get(i);
				int lastIndex = displaySize - 1;
				
				for(int j=0;j<displaySize ;++j) {
					if(j==lastIndex-1) {
						System.out.print('��');
					}else {
						System.out.print('��');
					}
				}
			}
			System.out.println();
			
			while(rs.next()) {
				
				for(int i = 0;i<columnSize;++i) {
					int size = columnDisPlaySize.get(i);
					String label = columnLabel.get(i);
					
					String format = String.format("%%-%ds", size);
					System.out.printf(format, rs.getObject(label));
				}
				System.out.println();
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
