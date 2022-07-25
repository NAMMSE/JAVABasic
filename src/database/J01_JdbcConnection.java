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
	 	 - DB에 쿼리문을 전달해 실행한 후 결과를 받아올 수 있는 Java API
	 	 - 다양한 종류의 DB와 연결될 수 있도록 설계되어 있다
	 	 - Java쪽 소스 코드는 어떤 종류의 DB와 연결하더라도 항상 동일하다
	 	 
	 	# OJDBC
	 	
	 	 - 오라클 데이터베이스가 JDBC API와 소통하기 위해 만들어놓은 라이브러리
	 	 - 오라클 DB가 설치된 폴더에 포함되어 있다
	 	 - SQL Developer 내부에도 포함되어 있다
	 	 
	 	javabasic 우클릭 - build path - configure build path - classpath 클릭 - add external JARs - sqldeveloper 폴더 - jdbc - ojdbc8 추가
	 	Referenced Libraries에 추가된다
	 */
	public static void main(String[] args) {
		
		// 1. Class.forName()으로 jdbc 드라이버를 로드한다
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 중 에러발생");
		}
		
		// 2. DriverManager 클래스를 통해 DB에 연결한다
		try {// DB 접속 경로 sqldeveloper에서 속성 추가 시 포트랑 SID / localhost 자리에 pc ip 입력해도 된다
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr", "1234"); 
			System.out.println("연결 생성 완료 : " + conn);
			
			// 3. 생성된 연결 객체를 통해 쿼리문을 전달한다
			
			// 3-1. 구문 준비하기 (세미콜론은 생략한다)
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees"
					+ " INNER JOIN departments USING (department_id) ORDER BY employee_id");
			
			// 3-2. 구문 실행하기 
			ResultSet rs = pstmt.executeQuery();
			
			// 4. 받아온 결과를 실행한다
			while( rs.next()) { // next : 커서를 옮기면서 다음행이 있으면 true 없으면 false
				System.out.printf("%-8d%15s%15s%10s%20s%8d\n", 
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("job_id"),
						rs.getString("department_name"),
						rs.getInt("salary"));
			}
			
			// 5. 다 사용한 연결은 닫아줘야 한다. 나중에 생성한 순서대로 닫아줘야한다
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("연결 생성 실패");
		}
	}
}
