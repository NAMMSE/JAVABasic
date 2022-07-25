package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class J05_MetaData {

	public static void main(String[] args) {
		
		String sql = "select * from employees";
		
		try (
				Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			// ResultSetMetaData : 해당 쿼리 실행 결과에 대한 여러 정보를 담고 있는 데이터
			ResultSetMetaData meta = rs.getMetaData();
			
			System.out.println("컬럼의 개수 ? "+ meta.getColumnCount());
			
			for(int i=1 ;i<=meta.getColumnCount();i++) { // i= 1부터 해야함
				System.out.printf("%d번째 컬럼의 이름 : %s \n", i, meta.getColumnLabel(i));
				System.out.println("컬럼의 크기 : " + meta.getColumnTypeName(i));
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
