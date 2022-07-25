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

	/*0517 ȭ 
	 * #### ������ �ٽ� Ǯ���###
	  ������ ������ ���� ���� 5������ �������� �� ������������ �ƴ��� �Ǻ��ϴ� ���α׷�
	 	    
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
		DayOfWeek todaysDow = LocalDate.now().getDayOfWeek(); // ���� 2022-05-17 ���� ������ ���� TUESDAY �� ����
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
			System.out.println("�ش� ������ �׽� ���� �����մϴ�.");
			return;
		}
		
		int parkmonth = parkMonth();
		int parkday = parkDay();
		
		int carnum=carNum()%10; // ���� ����ȣ�� ������
		System.out.println("���� ����ȣ : "+carnum);

		LocalDate today = LocalDate.of(2022, parkmonth, parkday); //����  ��¥ Ȯ��
		DayOfWeek dow = today.getDayOfWeek(); // �������� ������ ������������ Ȯ���ϴ� �ν��Ͻ� ����
		

		String day = dow.getDisplayName(TextStyle.FULL, Locale.KOREA); // �ش� ������ �ش� ������ ���� ���(ª��) ��ȯ
		int daynum = dow.getValue(); // �ش� ������ ���ڷ� ��ȯ - �� 1 ȭ 2 ...
		System.out.println("������ ��¥ : "+today+" "+day);
		if(parkmonth==1&&parkday==1||parkmonth==3&&parkday==1||parkmonth==5&&parkday==5||
		   parkmonth==5&&parkday==8||parkmonth==6&&parkday==6||parkmonth==8&&parkday==15||
		   parkmonth==10&&parkday==3||parkmonth==10&&parkday==9||parkmonth==12&&parkday==25) { // ��� ������ �����ϴ� if��
				System.out.println("������ �������̹Ƿ� ������ �����մϴ�.");
				return ;
		}
		
		park(daynum, carnum, day);
		
	}
	
	public static int checkExcept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����, ���Ƶ���, ������ �ش��Ͻø� 1��, �ƴϸ� �ƹ��ų� �����ּ���>>");	
		int excar = sc.nextInt();
		return excar;
	}
	
	public static int carNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��ȣ�� �Է��ϼ��� >>");
		int carnum = sc.nextInt();
		return carnum;
	}
	
	public static int parkMonth() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϴ� ���� �Է��ϼ��� >>");
		int parkmonth = sc.nextInt();
		return parkmonth;
	}
	public static int parkDay() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϴ� ���� �Է��ϼ��� >>");
		int parkday = sc.nextInt();
		return parkday;
	}

	public static void park(int daynum, int carnum, String day) {
			System.out.println("#### ���� 5���� ####\n"
					+ "    �� - 1, 6\n"
					+ "    ȭ - 2, 7\n"
					+ "    �� - 3, 8\n"
					+ "    �� - 4, 9\n"
					+ "    �� - 5, 0\n"
					+ "*������ �޹��� ��������*\n");
			if(daynum==carnum||Math.abs(carnum-daynum)==5) { // getValue�̿��Ͽ� ��=1 ���� ����ȣ ��=1,6 �ΰ� �̿� ���ų� ������ ���밪�� 5�϶�
				System.out.printf("������ %s�����̹Ƿ� ����ȣ�� %d�� ������ ������ �Ұ��� �մϴ�.\n", day, carnum);
			}
			else
				System.out.println("������ ������ �����մϴ�.");
	}
}
	
	�������
	
	*/























//	public static void parking(int day, int carnum) {
//		switch(day) {
//		case 1:
//			if(carnum==1||carnum==6) {
//				System.out.printf("������ %s���� �̹Ƿ� ����ȣ�� %d�� ����� ������ ������ �Ұ��� �մϴ�.", day, carnum);
//			}else System.out.println("������ ������ �����մϴ�.");
//			break;
//		case 2:
//			if(carnum==2||carnum==7) {
//				System.out.printf("������ %s���� �̹Ƿ� ����ȣ�� %d�� ����� ������ ������ �Ұ��� �մϴ�.", day, carnum);
//			}else System.out.println("������ ������ �����մϴ�.");
//			break;
//		case 3:
//			if(carnum==3||carnum==8) {
//				System.out.printf("������ %s���� �̹Ƿ� ����ȣ�� %d�� ����� ������ ������ �Ұ��� �մϴ�.", day, carnum);
//			}else System.out.println("������ ������ �����մϴ�.");
//			break;
//		case 4:
//			if(carnum==4||carnum==9) {
//				System.out.printf("������ %s���� �̹Ƿ� ����ȣ�� %d�� ����� ������ ������ �Ұ��� �մϴ�.", day, carnum);
//			}else System.out.println("������ ������ �����մϴ�.");
//			break;
//		case 5:
//			if(carnum==5||carnum==0) {
//				System.out.printf("������ %s���� �̹Ƿ� ����ȣ�� %d�� ����� ������ ������ �Ұ��� �մϴ�.", day, carnum);
//			}else System.out.println("������ ������ �����մϴ�.");
//			break;
//		default:
//			System.out.println("������ �������̹Ƿ� ��� ������ ������ �����մϴ�.");
//			break;
//		}
//	}