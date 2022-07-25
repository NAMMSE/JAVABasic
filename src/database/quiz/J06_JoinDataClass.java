package database.quiz;

import java.sql.Connection;
import java.util.Date;
import java.sql.SQLException;
import java.util.List;

import database.OjdbcConnection;
import database.model.Coffee;
import database.model.Location;
import database.model.QuizCoffee;

public class J06_JoinDataClass {

	/*
	 	coffeefour ���̺�� locations2 ���̺� ���� ����� ��� ���� ������ Ŭ������ ��� ����غ�����
	 */

	public static void main(String[] args) {
		// ���ڵ�
//		String sql = "select * from locations2 inner join coffeefour using(location_id)";
//		
//		try (
//				Connection conn = OjdbcConnection.getConnection();
//				PreparedStatement pstmt = conn.prepareStatement(sql);
//				ResultSet rs = pstmt.executeQuery();
//			
//				){
//			
//			while(rs.next()) {
//				System.out.println(new QuizCoffee(rs));
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
		
		try (
				Connection conn = OjdbcConnection.getConnection();){
				List<QuizCoffee> coffeeDetails = QuizCoffee.getAll(conn);
				
				for(QuizCoffee detail : coffeeDetails) {
					System.out.println(detail);
				}
				System.out.println("==============================");
				
				//System.out.println(QuizCoffee.get(conn, 1000));
				
//				QuizCoffee.setCoffee(conn, 1004, "����������", "espresso", 2000, null);
				Coffee.add(conn, new Coffee(5, "Ŀ�ǿ���", "coffeemilk", 2600, new Date()));
				Location.addLocation(conn, new Location(1100, "test", "12345", "seoul", "guri", "kr" ));
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
