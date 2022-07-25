package quiz;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

import database.myobj.Car;
import database.myobj.CarFactory;
import database.myobj.CarType;

public class D13_ParkingSystem {

	/*0517 화 
	 * #### 무조건 다시 풀어보기###
	  차량의 정보를 보고 차량 5부제를 적용했을 때 출입제한인지 아닌지 판별하는 프로그램
	 	    
	 */
	
	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>();
	private static HashSet<CarType> allowedCarType = new HashSet<>();
	
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
		DayOfWeek todaysDow = LocalDate.now().getDayOfWeek(); // 오늘 2022-05-17 기준 오늘의 요일 TUESDAY 값 저장
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
	
	
	
	public static void main(String[] args) {
		
		D13_ParkingSystem sys = new D13_ParkingSystem();
		
		for(int i=0;i<50;i++) {
			Car car = CarFactory.getRandomTestCar();
		//	Car car = CarFactory.getLimitedTestCar();
			System.out.println(car);
			sys.check(car);
			System.out.println(car);
			System.out.println("=======");
		
			
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
		
		if(checkExcept()==1) {
			System.out.println("해당 차량은 항시 주차 가능합니다.");
			return;
		}
		
		int parkmonth = parkMonth();
		int parkday = parkDay();
		
		int carnum=carNum()%10; // 차량 끝번호만 꺼내기
		System.out.println("차량 끝번호 : "+carnum);

		LocalDate today = LocalDate.of(2022, parkmonth, parkday); //오늘  날짜 확인
		DayOfWeek dow = today.getDayOfWeek(); // 일주일중 오늘이 무슨요일인지 확인하는 인스턴스 생성
		

		String day = dow.getDisplayName(TextStyle.FULL, Locale.KOREA); // 해당 요일을 해당 국가의 언어로 길게(짧게) 반환
		int daynum = dow.getValue(); // 해당 요일을 숫자로 반환 - 월 1 화 2 ...
		System.out.println("오늘의 날짜 : "+today+" "+day);
		if(parkmonth==1&&parkday==1||parkmonth==3&&parkday==1||parkmonth==5&&parkday==5||
		   parkmonth==5&&parkday==8||parkmonth==6&&parkday==6||parkmonth==8&&parkday==15||
		   parkmonth==10&&parkday==3||parkmonth==10&&parkday==9||parkmonth==12&&parkday==25) { // 양력 공휴일 제외하는 if문
				System.out.println("오늘은 공휴일이므로 주차가 가능합니다.");
				return ;
		}
		
		park(daynum, carnum, day);
		
	}
	
	public static int checkExcept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("장애인, 유아동승, 경차에 해당하시면 1을, 아니면 아무거나 눌러주세요>>");	
		int excar = sc.nextInt();
		return excar;
	}
	
	public static int carNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("차량 번호를 입력하세요 >>");
		int carnum = sc.nextInt();
		return carnum;
	}
	
	public static int parkMonth() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주차하는 월을 입력하세요 >>");
		int parkmonth = sc.nextInt();
		return parkmonth;
	}
	public static int parkDay() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주차하는 일을 입력하세요 >>");
		int parkday = sc.nextInt();
		return parkday;
	}

	public static void park(int daynum, int carnum, String day) {
			System.out.println("#### 차량 5부제 ####\n"
					+ "    월 - 1, 6\n"
					+ "    화 - 2, 7\n"
					+ "    수 - 3, 8\n"
					+ "    목 - 4, 9\n"
					+ "    금 - 5, 0\n"
					+ "*공휴일 휴무일 적용제외*\n");
			if(daynum==carnum||Math.abs(carnum-daynum)==5) { // getValue이용하여 월=1 차량 끝번호 월=1,6 인거 이용 같거나 차이의 절대값이 5일때
				System.out.printf("오늘은 %s요일이므로 끝번호가 %d인 차량은 주차가 불가능 합니다.\n", day, carnum);
			}
			else
				System.out.println("오늘은 주차가 가능합니다.");
	}
}
	
	여기까지
	
	*/























//	public static void parking(int day, int carnum) {
//		switch(day) {
//		case 1:
//			if(carnum==1||carnum==6) {
//				System.out.printf("오늘은 %s요일 이므로 끝번호가 %d인 당신의 차량은 주차가 불가능 합니다.", day, carnum);
//			}else System.out.println("오늘은 주차가 가능합니다.");
//			break;
//		case 2:
//			if(carnum==2||carnum==7) {
//				System.out.printf("오늘은 %s요일 이므로 끝번호가 %d인 당신의 차량은 주차가 불가능 합니다.", day, carnum);
//			}else System.out.println("오늘은 주차가 가능합니다.");
//			break;
//		case 3:
//			if(carnum==3||carnum==8) {
//				System.out.printf("오늘은 %s요일 이므로 끝번호가 %d인 당신의 차량은 주차가 불가능 합니다.", day, carnum);
//			}else System.out.println("오늘은 주차가 가능합니다.");
//			break;
//		case 4:
//			if(carnum==4||carnum==9) {
//				System.out.printf("오늘은 %s요일 이므로 끝번호가 %d인 당신의 차량은 주차가 불가능 합니다.", day, carnum);
//			}else System.out.println("오늘은 주차가 가능합니다.");
//			break;
//		case 5:
//			if(carnum==5||carnum==0) {
//				System.out.printf("오늘은 %s요일 이므로 끝번호가 %d인 당신의 차량은 주차가 불가능 합니다.", day, carnum);
//			}else System.out.println("오늘은 주차가 가능합니다.");
//			break;
//		default:
//			System.out.println("오늘은 공휴일이므로 모든 차량이 주차가 가능합니다.");
//			break;
//		}
//	}