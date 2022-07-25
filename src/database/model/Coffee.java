package database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

// ������ Ŭ���� �ϳ��� �ν��Ͻ��� DB�� �� ���� ���� �� �ִ�
public class Coffee {

	// ������ Ŭ���� ��Ģ 1 : �ʵ��� ���������ڴ� private�� �����Ѵ�
	private Integer cid; // DB���� ������ null���� ���� �� �����Ƿ� (����Ŭ������ �ΰ� ó�� ����)
	private String kor_name;
	private String eng_name;
	private Integer location_id;
	private Date expiry;
	
	// ������ Ŭ���� ��Ģ 2 : ������ �ʿ��� �ʵ�� getter �޼��带 �ް� ������ �ʿ��� �޼���� setter �޼��带 �޾��ش�
	// ctrl + space ������ get, set �޼��尡 �˾Ƽ� ���´�
	// Ŭ���� ���ο��� get �޼��常 �����س����� �ش� �ʵ�� ������ �Ұ����ϴٴ� �ǹ�
	
	
	
	public Coffee(ResultSet rs) throws SQLException {
		cid = rs.getInt("cid"); // �̷��� �ε��� ���� �÷������� �������� �͵� �����ϴ�
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
			// java.util.Date�� java.sql.Date�� ��ȯ�Ͽ� �����ؾ� ��
			pstmt.setDate(5, new java.sql.Date(coffee.expiry.getTime()));
			
			// LocalDate�� java.sql.Date�� ��ȯ�ؾ� �ϴ� ���
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
