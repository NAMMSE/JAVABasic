package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J03_ExecuteUpdate {

//	public static void main(String[] args) {
//		
//		// select�� ���� ����� ResultSet�� �޾ƿ���
//		// insert, update, delete�� ���� ����� �ٲ� �� ���� �����Ѵ� / developer���� ������ �μ�Ʈ�� ����Ʈ ������ ���� ����� 1���� ����, �����Ǿ����ϴ� �� ���� ����
//		
//		String sql = "update coffeefour set cid=cid+1 where eng_name=?"; // �̰� �����ϸ� �ȵǴµ� �Ƹ� ��� ���� ���¿��� �߰��ϰ� �ѰŶ� �ȵǴµ� // Ŀ���ϸ��
//		//String sql = "update coffee set price=price+100 where coffee_name=?"; // ������ �ִ� ���̺��� ��
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
		
		// select�� ���� ����� ResultSet�� �޾ƿ���
		// insert, update, delete�� ���� ����� �ٲ� �� ���� �����Ѵ� / developer���� ������ �μ�Ʈ�� ����Ʈ ������ ���� ����� 1���� ����, �����Ǿ����ϴ� �� ���� ����
		
	//	String sql = "insert into coffee2 values (?, ?, ?, ?) ";
				//+ "\r\n";
			//	+ "delete from artist where artist_name = ?;"; 
		//"insert into coffee2 values(?, ?, ?, ?); ";
//		
//		try(Connection conn = OjdbcConnection.getConnection();
//			PreparedStatement pstmt = conn.prepareStatement(sql);	
//			) {
//			pstmt.setString(1,  "Ŀ��");
//			pstmt.setInt(2,  1);
//			pstmt.setInt(3,  1);
//			pstmt.setString(4,  "t");
//			//pstmt.setString(1, "��Ǹ�" );
//			
//			int row = pstmt.executeUpdate();
//			
//			System.out.println(row + " row(s) update");
//			
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
		String sql = "insert into bus_reservation values (br_id_sq.nextval, ?, ?, ?,?,?) "; // ���� 1 ���� 1000 �¼� 1
		
		String sql2 = "update bus_seat set bu_is_reservated = 1 where bs_id = ?";

		try(Connection conn = OjdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		){		// execute() ������Ʈ�� executeUpdate() int������ ��ȯ, executeQuery() resultset�� ���� �� �ִ�
			System.out.println("db ���� ����");
			//for(int i=0;i<user.getSeatSize();i++) {
			int i=0;
				System.out.println("���� ����");
				pstmt.setString(1, "�Ｚ");
				pstmt.setString(2, "����"); //user.getAgeBySeat().get(user.getSeatKeys().get(i)));
				pstmt.setString(3, "1");
				pstmt.setInt(4, 1000);
				pstmt.setInt(5, 1);//user.getSeatKeys().get(i));
				pstmt.execute();
				System.out.println("sql1 ���� ��");
				
//				pstmt2.setInt(1, user.getSeatKeys().get(i));
//				pstmt2.execute();
				System.out.println("���� ��");
		//	}
			
			System.out.println("DB���� ����");
				
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB���� ����");
		}
	}
}
