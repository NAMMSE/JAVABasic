import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Test3 {
	/*
	  ���� 5����
	  �� - 1, 6
	  ȭ - 2, 7
	  �� - 3, 8
	  �� - 4, 9
	  �� - 5, 0
	 */
	public static int checkExceptCarType() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �����, ���Ƶ���, ��� ���� ���� �����̸� 1�� �ƴϸ� �ƹ��ų� �������� >>");
		int checkCar = sc.nextInt();
		return checkCar;
	}
	
	public static int carNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��ȣ 4�ڸ��� �Է��ϼ��� >>");
		int carNum = sc.nextInt();
		return carNum;
	}
	
	public static int parkingMonth() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϴ� ���� ���� �Է��ϼ��� >>");
		int month = sc.nextInt();
		return month;
	}
	
	public static int parkingDay() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϴ� ���� ��ĥ���� �Է��ϼ��� >>");
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
			System.out.printf("������ %s�̹Ƿ� �� ��ȣ�� %d�� ������ ������ �Ұ����մϴ�.\n",today, carNum);
		}else {
			System.out.println("������ ������ �����մϴ�.");
		}
		
	}
	
	public static void printParkingSystem() {
		System.out.println("#### ���� 5���� ####\n"
				+ "    �� - 1, 6\n"
				+ "    ȭ - 2, 7\n"
				+ "    �� - 3, 8\n"
				+ "    �� - 4, 9\n"
				+ "    �� - 5, 0\n"
				+ "*������ �� �޹����� ���� ����*\n");
	}
	
	
	public static void main(String[] args) {
		printParkingSystem();
		if(checkExceptCarType()==1) {
			System.out.println("���������� �׽� ������ �����մϴ�.");
			return;
		}
		int month = parkingMonth();
		int day = parkingDay();
		if(checkHoliday(month, day)==1) {
			System.out.println("������ �������̹Ƿ� ��� ������ ���� �����մϴ�.");
			return;
		}
		int carNum = carNum()%10;
		System.out.printf("���� �� ������ �� ��ȣ : %d\n", carNum);
		
		LocalDate today = LocalDate.of(2022, month, day);
		DayOfWeek dow = today.getDayOfWeek();
		
		String todayCheck = dow.getDisplayName(TextStyle.FULL, Locale.KOREA);
		int getDateNum = dow.getValue();
		System.out.printf("�����ϴ� ��¥ : %d - %d - %d  %s\n",today.getYear(), month, day, todayCheck);
		
		parkingSystem(carNum, getDateNum, todayCheck);
		
	}
}
