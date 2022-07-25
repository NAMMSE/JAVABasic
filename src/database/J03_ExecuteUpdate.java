package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J03_ExecuteUpdate {

//	public static void main(String[] args) {
//		
//		// select는 실행 결과로 ResultSet을 받아오고
//		// insert, update, delete는 실행 결과로 바뀐 행 수를 리턴한다 / developer에서 실제로 인서트나 딜리트 했을때 실행 결과에 1행이 삽입, 삭제되었습니다 랑 같은 원리
//		
//		String sql = "update coffeefour set cid=cid+1 where eng_name=?"; // 이거 실행하면 안되는데 아마 행들 없는 상태에서 추가하고 한거라 안되는듯 // 커밋하면됨
//		//String sql = "update coffee set price=price+100 where coffee_name=?"; // 기존에 있던 테이블은 됨
//		
//		try(Connection conn = OjdbcConnection.getConnection();
//			PreparedStatement pstmt = conn.prepareStatement(sql);	
//			) {
//			pstmt.setString(1,  "latte");
//			
//			int row = pstmt.executeUpdate();
//			
//			System.out.println(row + " row(s) update");
//			
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
	
	public static void main(String[] args) {
		
		// select는 실행 결과로 ResultSet을 받아오고
		// insert, update, delete는 실행 결과로 바뀐 행 수를 리턴한다 / developer에서 실제로 인서트나 딜리트 했을때 실행 결과에 1행이 삽입, 삭제되었습니다 랑 같은 원리
		
	//	String sql = "insert into coffee2 values (?, ?, ?, ?) ";
				//+ "\r\n";
			//	+ "delete from artist where artist_name = ?;"; 
		//"insert into coffee2 values(?, ?, ?, ?); ";
//		
//		try(Connection conn = OjdbcConnection.getConnection();
//			PreparedStatement pstmt = conn.prepareStatement(sql);	
//			) {
//			pstmt.setString(1,  "커피");
//			pstmt.setInt(2,  1);
//			pstmt.setInt(3,  1);
//			pstmt.setString(4,  "t");
//			//pstmt.setString(1, "김건모" );
//			
//			int row = pstmt.executeUpdate();
//			
//			System.out.println(row + " row(s) update");
//			
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
		String sql = "insert into bus_reservation values (br_id_sq.nextval, ?, ?, ?,?,?) "; // 유저 1 버스 1000 좌석 1
		
		String sql2 = "update bus_seat set bu_is_reservated = 1 where bs_id = ?";

		try(Connection conn = OjdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		){		// execute() 업데이트만 executeUpdate() int형으로 반환, executeQuery() resultset에 담을 수 있다
			System.out.println("db 진입 성공");
			//for(int i=0;i<user.getSeatSize();i++) {
			int i=0;
				System.out.println("포문 시작");
				pstmt.setString(1, "삼성");
				pstmt.setString(2, "성인"); //user.getAgeBySeat().get(user.getSeatKeys().get(i)));
				pstmt.setString(3, "1");
				pstmt.setInt(4, 1000);
				pstmt.setInt(5, 1);//user.getSeatKeys().get(i));
				pstmt.execute();
				System.out.println("sql1 실행 끝");
				
//				pstmt2.setInt(1, user.getSeatKeys().get(i));
//				pstmt2.execute();
				System.out.println("포문 끝");
		//	}
			
			System.out.println("DB저장 성공");
				
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB저장 실패");
		}
	}
}
