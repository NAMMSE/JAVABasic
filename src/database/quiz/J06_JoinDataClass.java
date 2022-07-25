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
	 	coffeefour 테이블과 locations2 테이블 조인 결과의 모든 행을 데이터 클래스에 담아 출력해보세요
	 */

	public static void main(String[] args) {
		// 내코드
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
				
//				QuizCoffee.setCoffee(conn, 1004, "에스프레소", "espresso", 2000, null);
				Coffee.add(conn, new Coffee(5, "커피우유", "coffeemilk", 2600, new Date()));
				Location.addLocation(conn, new Location(1100, "test", "12345", "seoul", "guri", "kr" ));
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
