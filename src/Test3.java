import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Test3 {
	/*
	  차량 5부제
	  월 - 1, 6
	  화 - 2, 7
	  수 - 3, 8
	  목 - 4, 9
	  금 - 5, 0
	 */
	public static int checkExceptCarType() {
		Scanner sc = new Scanner(System.in);
		System.out.print("차량이 장애인, 유아동승, 긴급 등의 제외 차량이면 1을 아니면 아무거나 누르세요 >>");
		int checkCar = sc.nextInt();
		return checkCar;
	}
	
	public static int carNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("차량 번호 4자리를 입력하세요 >>");
		int carNum = sc.nextInt();
		return carNum;
	}
	
	public static int parkingMonth() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주차하는 날의 월을 입력하세요 >>");
		int month = sc.nextInt();
		return month;
	}
	
	public static int parkingDay() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주차하는 날이 며칠인지 입력하세요 >>");
		int day = sc.nextInt();
		return day;
	}
	
	public static int checkHoliday(int month, int day) {
		if((month==1&&day==1)||(month==3&&day==1)||(month==5&&day==5)||(month==5&&day==1)||
			(month==6&&day==8)||(month==1&&day==15)||(month==10&&day==3)||(month==10&&day==9)||
			(month==12&&day==25)) {
			return 1;
		}
		return 0;
		
	}
	
	public static void parkingSystem(int carNum, int value, String today) {
		if(carNum == value || Math.abs(carNum-value)==5) {
			System.out.printf("오늘은 %s이므로 끝 번호가 %d인 차량은 주차가 불가능합니다.\n",today, carNum);
		}else {
			System.out.println("오늘은 주차가 가능합니다.");
		}
		
	}
	
	public static void printParkingSystem() {
		System.out.println("#### 차량 5부제 ####\n"
				+ "    월 - 1, 6\n"
				+ "    화 - 2, 7\n"
				+ "    수 - 3, 8\n"
				+ "    목 - 4, 9\n"
				+ "    금 - 5, 0\n"
				+ "*공휴일 및 휴무일은 적용 제외*\n");
	}
	
	
	public static void main(String[] args) {
		printParkingSystem();
		if(checkExceptCarType()==1) {
			System.out.println("제외차량은 항시 주차가 가능합니다.");
			return;
		}
		int month = parkingMonth();
		int day = parkingDay();
		if(checkHoliday(month, day)==1) {
			System.out.println("오늘은 공휴일이므로 모든 차량이 주차 가능합니다.");
			return;
		}
		int carNum = carNum()%10;
		System.out.printf("주차 할 차량의 끝 번호 : %d\n", carNum);
		
		LocalDate today = LocalDate.of(2022, month, day);
		DayOfWeek dow = today.getDayOfWeek();
		
		String todayCheck = dow.getDisplayName(TextStyle.FULL, Locale.KOREA);
		int getDateNum = dow.getValue();
		System.out.printf("주차하는 날짜 : %d - %d - %d  %s\n",today.getYear(), month, day, todayCheck);
		
		parkingSystem(carNum, getDateNum, todayCheck);
		
	}
}
