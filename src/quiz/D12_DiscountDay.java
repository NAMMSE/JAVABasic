package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class D12_DiscountDay {

	/* 0516 ��
	  � ���Կ��� ���� ��縦 Ȧ������ ����Ͽ��� �����Ѵٰ� �Ѵ�
	  1. �⵵�� ���� �Է��ϸ� �ش� ���� ��� ���� ��¥�� ������ִ� �޼���
	  2. �⵵�� �Է��ϸ� �ش� ���� ��� ���� ��¥�� ������ִ� �޼���
	 */
	
/* �� �ڵ�	
	public static void dcDay(int year, int month) {
		
		Calendar dc = Calendar.getInstance();

		dc.set(year, month, 1);

		switch(dc.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			System.out.printf("%d�� %d���� ���� ��¥�� 5, 19���Դϴ�.\n", year, month+1);
			break;
		case 2:
			System.out.printf("%d�� %d���� ���� ��¥�� 4, 18���Դϴ�.\n", year, month+1);
			break;
		case 3:
			if(month==0||month==2||month==4||month==6||month==7||month==9||month==11) 
				System.out.printf("%d�� %d���� ���� ��¥�� 3, 17, 31���Դϴ�.\n", year, month+1);
			else
				System.out.printf("%d�� %d���� ���� ��¥�� 3, 17���Դϴ�.\n", year, month+1);
			break;
		case 4:
			System.out.printf("%d�� %d���� ���� ��¥�� 2, 16, 30���Դϴ�.\n", year, month+1);
			break;
		case 5:
			if(year%4!=0&&month==1) // 2���� 28�ϱ����ε� 1���� ������϶�
				System.out.printf("%d�� %d���� ���� ��¥�� 1, 15���Դϴ�.\n", year, month+1);
			else	
				System.out.printf("%d�� %d���� ���� ��¥�� 1, 15, 29���Դϴ�.\n", year, month+1);
			break;
		case 6:
			System.out.printf("%d�� %d���� ���� ��¥�� 7, 21���Դϴ�.\n", year, month+1);
			break;
		case 7:
			System.out.printf("%d�� %d���� ���� ��¥�� 6, 20���Դϴ�.\n", year, month+1);
			break;
		default:
			break;
		}
	}
	
	public static void dcDay2(int year2) {
		for(int i=0;i<=11;i++) {
			dcDay(year2,i);
		}
	}
	������� �� �ڵ� */
	
	public static void printYearEventDays(int year) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E", Locale.US);
		Calendar cal = Calendar.getInstance();

		cal.set(year, 0, 1, 0, 0, 0);
		int thurcnt =1;
		while(cal.get(Calendar.YEAR)== year ) {
		//	System.out.println(sdf.format(cal.getTime()));
			if(cal.get(Calendar.DAY_OF_WEEK)== Calendar.THURSDAY) { // cal�� �ϰ� �����(5)�� ������ 
				if(thurcnt%2==1){
					System.out.println(sdf.format(cal.getTime())+": "+thurcnt+"��° ������̹Ƿ� �̺�Ʈ ���Դϴ�.."); // ����� ī��Ʈ �����ϰ� ���
				}
				thurcnt++;
			}
			
			int month = cal.get(Calendar.MONTH); // ������� Ȯ��
			cal.add(Calendar.DATE, 1); // �ϼ��� 1�Ͼ� �߰��ϸ鼭 
			if(month != cal.get(Calendar.MONTH)) { // �ش� ���̶� cal�� �ϼ��� 1�� �����ϴٰ� ���� �޷� �Ѿ�� ����� ī��Ʈ�� 1�� �ʱ�ȭ 
				thurcnt=1;
			}
		}
	}
	public static void printMonthEventDays(int year, int month) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar cal = Calendar.getInstance();
		// 1. �� �� �� ����
		cal.set(year, month-1, 1);
		
		// 2. ���� ����
		cal.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		
		// 3. �� ��° �������� ����
		for( int dowim =  1; dowim<cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);dowim+=2) {
			cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, dowim);
			System.out.println(sdf.format(cal.getTime())+"�� �̺�Ʈ�Դϴ�.");
		}
		cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
		System.out.println(sdf.format(cal.getTime()));
		
		// getActualMaximum() : ���� ���¿��� �ش� �ʵ��� �ִ밪�� �����ش�
		cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		
	}
	
	public static void main(String[] args) {
		//printYearEventDays(2022);
		printMonthEventDays(2022, 7);
		Scanner sc = new Scanner(System.in);
		System.out.print("Ȯ���� �⵵�� �Է��ϼ��� >>");
		int year = sc.nextInt();
		System.out.print("���� �Է��ϼ��� >>");
		int month = sc.nextInt()-1;
				
		//dcDay(year,month);
		
		System.out.print("��� ���� ��¥�� Ȯ���� �⵵�� �Է��ϼ��� >>");
		int year2 = sc.nextInt();
		
		//dcDay2(year2);
	}
}
