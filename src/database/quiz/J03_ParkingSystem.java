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
	 	차량이 진입하면 차량 5부제를 적용하여 주차여부를 판별한 후 DB에 기록해보세요
	 */
	
	
	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>();
	private static HashSet<CarType> allowedCarType = new HashSet<>();
	static DayOfWeek todaysDow = LocalDate.now().getDayOfWeek(); // 오늘 2022-05-17 기준 오늘의 요일 TUESDAY 값 저장
	
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
		if(limitNum == null){ // 리밋넘은 오늘 날짜 키 값에 대한 제한 번호 값을 저장한건데 평일 5일치만 넣었으므로 오늘이 주말이면 값이 없다
			System.out.println("오늘은 주말이므로 차량 5부제를 시행하지 않습니다..");
			return;
		}
		
		System.out.printf(" 오늘은 %s이므로 차량 끝번호%c, %c번의 출입이 제한됩니다.\n", 
				todaysDow.getDisplayName(TextStyle.FULL, Locale.KOREAN), limitNum.charAt(0), limitNum.charAt(1));
				// 오늘 기준 화요일 FULL이니까 요일도 붙여줌						//
		if(allowedCarType.contains(car.getCarType())) { // 차량 타입 확인해서 제외차량의 단어를 포함하고 있으면 
			System.out.println("장애인, 경차, 유아동승 차량은 차량 5부제의 대상이 아닙니다.");
			car.setState(1); // Car클래스에 parkState 출력시 주차가능으로 출력
		}else if(limitNum.contains(car.getLastNum())) {
			System.out.println("차량 5부제 대상이므로 출입제한");
			car.setState(2); // 마찬가지로 진입금지로 출력
		}else {
			System.out.println("차량 5부제 대상이 아닙니다");
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
				
				System.out.println("주차정보가 parking DB에 저장되었습니다.");
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	
	
	public static void main(String[] args) {
		
		// 주차 정보 테이블 생성
		//createTable();
		
		D13_ParkingSystem sys = new D13_ParkingSystem();
		
		String today = todaysDow.getDisplayName(TextStyle.FULL, Locale.KOREAN); // 금요일 
		String date = limitNumMap.get(DayOfWeek.FRIDAY); // 50
		//System.out.println(car.getCarNum()); // 차량 번호
		//System.out.println(car.getCarState()); // 차량 상태
		//System.out.println(car.getCarType().getName()); 차량 종류
	
		for(int i=0;i<5;i++) {
			//	Car car = CarFactory.getLimitedTestCar(); // 테스트용 메서드 
			Car car = CarFactory.getRandomTestCar();
			System.out.println(car);
			sys.check(car);
			System.out.println(car);
			insertData(today, date, car.getCarNum(), car.getCarState(), car.getCarType().getName());			
			System.out.println("=======");
		}
	}
}
	
	
	

