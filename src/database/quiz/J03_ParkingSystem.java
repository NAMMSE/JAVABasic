package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

import database.OjdbcConnection;
import database.myobj.Car;
import database.myobj.CarFactory;
import database.myobj.CarType;
import quiz.D13_ParkingSystem;

public class J03_ParkingSystem {

	/*
	 	������ �����ϸ� ���� 5������ �����Ͽ� �������θ� �Ǻ��� �� DB�� ����غ�����
	 */
	
	
	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>();
	private static HashSet<CarType> allowedCarType = new HashSet<>();
	static DayOfWeek todaysDow = LocalDate.now().getDayOfWeek(); // ���� 2022-05-17 ���� ������ ���� TUESDAY �� ����
	
	static {
		limitNumMap.put(DayOfWeek.MONDAY, "16");
		limitNumMap.put(DayOfWeek.TUESDAY, "27");
		limitNumMap.put(DayOfWeek.WEDNESDAY, "38");
		limitNumMap.put(DayOfWeek.THURSDAY, "49");
		limitNumMap.put(DayOfWeek.FRIDAY, "50");
		
		allowedCarType.add(Car.babyRide);
		allowedCarType.add(Car.disabled);
		allowedCarType.add(Car.lightCar);
	}
	
	
	public void check(Car car) {
		String limitNum = limitNumMap.get(todaysDow);
		if(limitNum == null){ // ���Գ��� ���� ��¥ Ű ���� ���� ���� ��ȣ ���� �����Ѱǵ� ���� 5��ġ�� �־����Ƿ� ������ �ָ��̸� ���� ����
			System.out.println("������ �ָ��̹Ƿ� ���� 5������ �������� �ʽ��ϴ�..");
			return;
		}
		
		System.out.printf(" ������ %s�̹Ƿ� ���� ����ȣ%c, %c���� ������ ���ѵ˴ϴ�.\n", 
				todaysDow.getDisplayName(TextStyle.FULL, Locale.KOREAN), limitNum.charAt(0), limitNum.charAt(1));
				// ���� ���� ȭ���� FULL�̴ϱ� ���ϵ� �ٿ���						//
		if(allowedCarType.contains(car.getCarType())) { // ���� Ÿ�� Ȯ���ؼ� ���������� �ܾ �����ϰ� ������ 
			System.out.println("�����, ����, ���Ƶ��� ������ ���� 5������ ����� �ƴմϴ�.");
			car.setState(1); // CarŬ������ parkState ��½� ������������ ���
		}else if(limitNum.contains(car.getLastNum())) {
			System.out.println("���� 5���� ����̹Ƿ� ��������");
			car.setState(2); // ���������� ���Ա����� ���
		}else {
			System.out.println("���� 5���� ����� �ƴմϴ�");
			car.setState(1);
		}
	}
	
	
	public static void createTable() {
		String sql
			= "create table parking (day_of_week varchar2(10), limit_num varchar2(5), cartype varchar2(10), carnum varchar2(20), carstate varchar2(20))";
		try(Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);	
				) {
			pstmt.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
		
		
	public static void insertData(String date, String limitNum, String carNum, String carState, String carType) {
		
			String sql = "insert into parking values(?,?,?,?,?)";
			
			try(Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);	
				) {
				pstmt.setString(1,  date);
				pstmt.setString(2,  limitNum);
				pstmt.setString(3,  carType);
				pstmt.setString(4,  carNum);
				pstmt.setString(5,  carState);
				
				int row = pstmt.executeUpdate();
				
				System.out.println("���������� parking DB�� ����Ǿ����ϴ�.");
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	
	
	public static void main(String[] args) {
		
		// ���� ���� ���̺� ����
		//createTable();
		
		D13_ParkingSystem sys = new D13_ParkingSystem();
		
		String today = todaysDow.getDisplayName(TextStyle.FULL, Locale.KOREAN); // �ݿ��� 
		String date = limitNumMap.get(DayOfWeek.FRIDAY); // 50
		//System.out.println(car.getCarNum()); // ���� ��ȣ
		//System.out.println(car.getCarState()); // ���� ����
		//System.out.println(car.getCarType().getName()); ���� ����
	
		for(int i=0;i<5;i++) {
			//	Car car = CarFactory.getLimitedTestCar(); // �׽�Ʈ�� �޼��� 
			Car car = CarFactory.getRandomTestCar();
			System.out.println(car);
			sys.check(car);
			System.out.println(car);
			insertData(today, date, car.getCarNum(), car.getCarState(), car.getCarType().getName());			
			System.out.println("=======");
		}
	}
}
	
	
	

