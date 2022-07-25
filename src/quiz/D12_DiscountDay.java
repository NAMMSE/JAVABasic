package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class D12_DiscountDay {

	/* 0516 월
	  어떤 가게에서 할인 행사를 홀수번쨰 목요일에만 진행한다고 한다
	  1. 년도와 월을 입력하면 해당 월의 모든 할인 날짜를 출력해주는 메서드
	  2. 년도를 입력하면 해당 년의 모든 할인 날짜를 출력해주는 메서드
	 */
	
/* 내 코드	
	public static void dcDay(int year, int month) {
		
		Calendar dc = Calendar.getInstance();

		dc.set(year, month, 1);

		switch(dc.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			System.out.printf("%d년 %d월의 할인 날짜는 5, 19일입니다.\n", year, month+1);
			break;
		case 2:
			System.out.printf("%d년 %d월의 할인 날짜는 4, 18일입니다.\n", year, month+1);
			break;
		case 3:
			if(month==0||month==2||month==4||month==6||month==7||month==9||month==11) 
				System.out.printf("%d년 %d월의 할인 날짜는 3, 17, 31일입니다.\n", year, month+1);
			else
				System.out.printf("%d년 %d월의 할인 날짜는 3, 17일입니다.\n", year, month+1);
			break;
		case 4:
			System.out.printf("%d년 %d월의 할인 날짜는 2, 16, 30일입니다.\n", year, month+1);
			break;
		case 5:
			if(year%4!=0&&month==1) // 2월이 28일까지인데 1일이 목요일일때
				System.out.printf("%d년 %d월의 할인 날짜는 1, 15일입니다.\n", year, month+1);
			else	
				System.out.printf("%d년 %d월의 할인 날짜는 1, 15, 29일입니다.\n", year, month+1);
			break;
		case 6:
			System.out.printf("%d년 %d월의 할인 날짜는 7, 21일입니다.\n", year, month+1);
			break;
		case 7:
			System.out.printf("%d년 %d월의 할인 날짜는 6, 20일입니다.\n", year, month+1);
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
	여기까지 내 코드 */
	
	public static void printYearEventDays(int year) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E", Locale.US);
		Calendar cal = Calendar.getInstance();

		cal.set(year, 0, 1, 0, 0, 0);
		int thurcnt =1;
		while(cal.get(Calendar.YEAR)== year ) {
		//	System.out.println(sdf.format(cal.getTime()));
			if(cal.get(Calendar.DAY_OF_WEEK)== Calendar.THURSDAY) { // cal의 일과 목요일(5)이 같으면 
				if(thurcnt%2==1){
					System.out.println(sdf.format(cal.getTime())+": "+thurcnt+"번째 목요일이므로 이벤트 날입니다.."); // 목요일 카운트 증가하고 출력
				}
				thurcnt++;
			}
			
			int month = cal.get(Calendar.MONTH); // 몇월인지 확인
			cal.add(Calendar.DATE, 1); // 일수에 1일씩 추가하면서 
			if(month != cal.get(Calendar.MONTH)) { // 해당 월이랑 cal의 일수가 1씩 증가하다가 다음 달로 넘어가면 목요일 카운트를 1로 초기화 
				thurcnt=1;
			}
		}
	}
	public static void printMonthEventDays(int year, int month) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar cal = Calendar.getInstance();
		// 1. 년 월 일 설정
		cal.set(year, month-1, 1);
		
		// 2. 요일 설정
		cal.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		
		// 3. 몇 번째 요일인지 설정
		for( int dowim =  1; dowim<cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);dowim+=2) {
			cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, dowim);
			System.out.println(sdf.format(cal.getTime())+"는 이벤트입니다.");
		}
		cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
		System.out.println(sdf.format(cal.getTime()));
		
		// getActualMaximum() : 현재 상태에서 해당 필드의 최대값을 구해준다
		cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		
	}
	
	public static void main(String[] args) {
		//printYearEventDays(2022);
		printMonthEventDays(2022, 7);
		Scanner sc = new Scanner(System.in);
		System.out.print("확인할 년도를 입력하세요 >>");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요 >>");
		int month = sc.nextInt()-1;
				
		//dcDay(year,month);
		
		System.out.print("모든 할인 날짜를 확인할 년도를 입력하세요 >>");
		int year2 = sc.nextInt();
		
		//dcDay2(year2);
	}
}
