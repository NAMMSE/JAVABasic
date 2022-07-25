package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.model.Coffee;

public class J06_DataModelClass {

	// DB���� ������ �����ʹ� ���̺��� ��� ������ ���� �� �ִ� ������ �� Ŭ������ �־�δ� ���� ����
	
	public static void main(String[] args) {
	
		String sql = "select * from coffeefour";
		
		// �𵨿� ���� �����͸� �÷����� ����� ���ϰ� �ٷ� ���� �ִ�
		ArrayList<Coffee> coffees = new ArrayList<>();
		
		try(Connection conn = OjdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);	
			ResultSet rs = pstmt.executeQuery();
			){
			
			while(rs.next()){
				System.out.println(new Coffee(rs));
				coffees.add(new Coffee(rs));
				System.out.println(coffees);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
