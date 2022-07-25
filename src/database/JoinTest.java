package database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JoinTest {

	private Integer employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private String hire_date;
	private String job_id;
	private Integer salary;
	private Double commission_pct;
	private Integer manager_id;
	private Integer department_id;
	private Integer location_id;
	private String department_name;
	private String job_title;
	private Integer min_salary;
	private Integer max_salary;
	
	public JoinTest(ResultSet rs) throws SQLException{
		employee_id = rs.getInt("employee_id");
		first_name = rs.getString("first_name");
		last_name = rs.getString("last_name");
		email = rs.getString("email");
		phone_number = rs.getString("phone_number");
		hire_date = rs.getString("hire_date");
		job_id = rs.getString("job_id");
		salary = rs.getInt("salary");
		commission_pct = rs.getDouble("commission_pct");
		manager_id = rs.getInt("manager_id");
		department_id = rs.getInt("department_id");
		location_id = rs.getInt("location_id");
		department_name = rs.getString("department_name");
		job_title = rs.getString("job_title");
		min_salary = rs.getInt("min_salary");
		max_salary = rs.getInt("max_salary");
	}
	
	@Override
	public String toString() {
		return String.format("%d\n", employee_id);
	}
}
