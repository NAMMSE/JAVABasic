package database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

// 데이터 클래스 하나의 인스턴스가 DB의 한 행을 담을 수 있다
public class Coffee {

	// 데이터 클래스 규칙 1 : 필드의 접근제어자는 private로 설정한다
	private Integer cid; // DB에는 언제든 null값이 나올 수 있으므로 (래퍼클래스는 널값 처리 가능)
	private String kor_name;
	private String eng_name;
	private Integer location_id;
	private Date expiry;
	
	// 데이터 클래스 규칙 2 : 접근이 필요한 필드는 getter 메서드를 달고 수정이 필요한 메서드는 setter 메서드를 달아준다
	// ctrl + space 누르면 get, set 메서드가 알아서 나온다
	// 클래스 내부에서 get 메서드만 구현해놓으면 해당 필드는 수정이 불가능하다는 의미
	
	
	
	public Coffee(ResultSet rs) throws SQLException {
		cid = rs.getInt("cid"); // 이렇게 인덱스 말고 컬럼명으로 가져오는 것도 가능하다
		kor_name = rs.getString("kor_name");
		eng_name = rs.getString("eng_name");
		location_id = rs.getInt("location_id");
		expiry = rs.getDate("expiry");	
	}
	
	public Coffee(Integer cid, String kor_name, String eng_name, Integer location_id, Date expiry ) {
	
		this.cid = cid;
		this.kor_name =kor_name;
		this.eng_name = eng_name;
		this.location_id =location_id;
		this.expiry =expiry;
	}
	
	public static boolean add(Connection conn, Coffee coffee) {
		String sql = "insert into coffeefour values(?,?,?,?,?)";
		
		try (PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setInt(1, coffee.cid);
			pstmt.setString(2, coffee.kor_name);
			pstmt.setString(3, coffee.eng_name);
			pstmt.setInt(4, coffee.location_id);
			// java.util.Date를 java.sql.Date로 변환하여 전달해야 함
			pstmt.setDate(5, new java.sql.Date(coffee.expiry.getTime()));
			
			// LocalDate를 java.sql.Date로 변환해야 하는 경우
			// java.sql.Date.valueOf(LocalDate.now());
		
			return pstmt.executeUpdate() > 0;
					
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	public Integer getCid() {
		return cid;
	}
	
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	
	public String getKor_name() {
		return kor_name;
	}

	public void setKor_name(String kor_name) {
		this.kor_name = kor_name;
	}

	public String getEng_name() {
		return eng_name;
	}

	public void setEng_name(String eng_name) {
		this.eng_name = eng_name;
	}

	public Integer getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	@Override
	public String toString() {
		return String.format("%s(%s)", kor_name, eng_name);
	}
}
