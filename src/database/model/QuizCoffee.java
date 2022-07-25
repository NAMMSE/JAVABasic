package database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuizCoffee {

//	private Integer location_id;
//	private String street_address;
//	private Integer postal_code;
//	private String city;
//	private String state_province;
//	private String country_id;
//	private Integer cid;
//	private String kor_name;
//	private String eng_name;
//	private Date expiry;
	
	Coffee coffee;
	Location location;
	
	// DB연결과 ID 값을 전달 받으면 한 행을 조회해 리턴해주는 메서드
	public static QuizCoffee get(Connection conn, int cid) {
		String sql = "select * from coffeefour inner join locations2 using(location_id) where cid = ?";		
		try (PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setInt(1, cid);
			
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			return new QuizCoffee(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;	
		}
	}
	
	// DB연결(Connection)을 전달 받으면 모든 커피목록을 만들어 리턴하는 메서드
	public static List<QuizCoffee> getAll(Connection conn)  {
		List<QuizCoffee> list = new ArrayList<>();
		String sql = "select * from coffeefour inner join locations2 using (location_id)";
		
		
		try(
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				) {
		
			while(rs.next()) {
				list.add(new QuizCoffee(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static void setCoffee(Connection conn, Integer cid, String kor_name, String eng_name, Integer location_id, Date expiry ) {
		String sql = "insert into coffeefour values(?,?,?,?,?)";
		
		try (PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setInt(1, cid);
			pstmt.setString(2, kor_name);
			pstmt.setString(3, eng_name);
			pstmt.setInt(4, location_id);
			pstmt.setDate(5, (java.sql.Date) expiry);
			
			pstmt.executeUpdate();
			
			System.out.println("업데이트 되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
public static void setLocation(Connection conn, Integer loc_id, String str_addr, String postal, String city, String state, String c_id ) {
		String sql = "insert into coffeefour values(?,?,?,?,?,?)";
		
		try (PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setInt(1, loc_id);
			pstmt.setString(2, str_addr);
			pstmt.setString(3, postal);
			pstmt.setString(4, city);
			pstmt.setString(5, state);
			pstmt.setString(6, c_id);
			
			pstmt.executeUpdate();
			
			System.out.println("업데이트 되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public QuizCoffee(ResultSet rs) throws SQLException{
		this.coffee = new Coffee(rs);
		this.location = new Location(rs);
	}
	
	@Override
	public String toString() {
		return String.format("coffee : %s, location : %d",coffee.getKor_name(), location.getLocation_id());
	}
	
	
//	public QuizCoffee(ResultSet rs) throws SQLException {
//		location_id		= rs.getInt(1);
//		street_address 	= rs.getString(2);
//		postal_code 	= rs.getInt(3);
//		city			= rs.getString(4);
//		state_province	= rs.getString(5);
//		country_id		= rs.getString(6);
//		cid 			= rs.getInt(7);
//		kor_name		= rs.getString(8);
//		eng_name		= rs.getString(9);
//		expiry 			= rs.getDate(10);
//	}
	
//	@Override
//	public String toString() {
//		return String.format("(%d) %s",location_id, kor_name);
//	}
	
}
