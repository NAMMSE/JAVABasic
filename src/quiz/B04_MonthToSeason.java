package quiz;

import java.util.Scanner;

public class B04_MonthToSeason {
	
	/*
	 ����ڷκ��� �� ������ �Է¹����� �ش��ϴ� ������ ���
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� >>");
		int month = sc.nextInt();
		
		switch(month) {
		
		case 11: case 12: case 1: case 2: 
			System.out.printf("%d���� �ܿ��Դϴ�.", month);
			break;
			
		case 3: case 4:  
			System.out.printf("%d���� ���Դϴ�.", month);
			break;
			
		case 5: case 6: case 7: case 8: 
			System.out.printf("%d���� �����Դϴ�.", month);
			break;
			
		case 9: case 10: 
			System.out.printf("%d���� �����Դϴ�.", month);
			break;
		default:
			break;
			}		
		
		/*
		 
		 case 11: case 12: case 1: case 2: 
			season = "�ܿ�";
			break;
			
		case 3: case 4:  
			season = "��";
			break;
			
		case 5: case 6: case 7: case 8: 
			season = "����";
			break;
			
		case 9: case 10: 
			season = "����";
			break;
		default:
			season = "��";
			break;
			
				System.out.printf("%d���� %s�Դϴ�.", month, season);
		 */
	}
}
