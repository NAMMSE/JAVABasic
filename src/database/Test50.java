package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Test50 {

	public static void main(String[] args) {
		String sql = "select * from (employees inner join departments using(department_id)) inner join jobs using(job_id) order by "
				+ "employee_id asc";
		
		ArrayList<JoinTest> list = new ArrayList<>();
		try(Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
			){
			for(int i=0;i<50;i++) {
				while(rs.next()) {
					list.add(new JoinTest(rs));
				}
				System.out.println(i+"번째 저장 성공");
				System.out.println(list);
			}
			System.out.println("DB불러오기 성공");
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB불러오기 실패");
		}
	}
}
