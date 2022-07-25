package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_JdbcConnection {

	/*
	 	# JDBC
	 	
	 	 - Java Database Connectivity
	 	 - DB�� �������� ������ ������ �� ����� �޾ƿ� �� �ִ� Java API
	 	 - �پ��� ������ DB�� ����� �� �ֵ��� ����Ǿ� �ִ�
	 	 - Java�� �ҽ� �ڵ�� � ������ DB�� �����ϴ��� �׻� �����ϴ�
	 	 
	 	# OJDBC
	 	
	 	 - ����Ŭ �����ͺ��̽��� JDBC API�� �����ϱ� ���� �������� ���̺귯��
	 	 - ����Ŭ DB�� ��ġ�� ������ ���ԵǾ� �ִ�
	 	 - SQL Developer ���ο��� ���ԵǾ� �ִ�
	 	 
	 	javabasic ��Ŭ�� - build path - configure build path - classpath Ŭ�� - add external JARs - sqldeveloper ���� - jdbc - ojdbc8 �߰�
	 	Referenced Libraries�� �߰��ȴ�
	 */
	public static void main(String[] args) {
		
		// 1. Class.forName()���� jdbc ����̹��� �ε��Ѵ�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� �Ϸ�.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("����̹� �ε� �� �����߻�");
		}
		
		// 2. DriverManager Ŭ������ ���� DB�� �����Ѵ�
		try {// DB ���� ��� sqldeveloper���� �Ӽ� �߰� �� ��Ʈ�� SID / localhost �ڸ��� pc ip �Է��ص� �ȴ�
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr", "1234"); 
			System.out.println("���� ���� �Ϸ� : " + conn);
			
			// 3. ������ ���� ��ü�� ���� �������� �����Ѵ�
			
			// 3-1. ���� �غ��ϱ� (�����ݷ��� �����Ѵ�)
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees"
					+ " INNER JOIN departments USING (department_id) ORDER BY employee_id");
			
			// 3-2. ���� �����ϱ� 
			ResultSet rs = pstmt.executeQuery();
			
			// 4. �޾ƿ� ����� �����Ѵ�
			while( rs.next()) { // next : Ŀ���� �ű�鼭 �������� ������ true ������ false
				System.out.printf("%-8d%15s%15s%10s%20s%8d\n", 
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("job_id"),
						rs.getString("department_name"),
						rs.getInt("salary"));
			}
			
			// 5. �� ����� ������ �ݾ���� �Ѵ�. ���߿� ������ ������� �ݾ�����Ѵ�
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���� ���� ����");
		}
	}
}
