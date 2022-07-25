package quiz;

import java.util.Scanner;

public class B04_MonthToSeason {
	
	/*
	 사용자로부터 몇 월인지 입력받으면 해당하는 계절을 출력
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 >>");
		int month = sc.nextInt();
		
		switch(month) {
		
		case 11: case 12: case 1: case 2: 
			System.out.printf("%d월은 겨울입니다.", month);
			break;
			
		case 3: case 4:  
			System.out.printf("%d월은 봄입니다.", month);
			break;
			
		case 5: case 6: case 7: case 8: 
			System.out.printf("%d월은 여름입니다.", month);
			break;
			
		case 9: case 10: 
			System.out.printf("%d월은 가을입니다.", month);
			break;
		default:
			break;
			}		
		
		/*
		 
		 case 11: case 12: case 1: case 2: 
			season = "겨울";
			break;
			
		case 3: case 4:  
			season = "봄";
			break;
			
		case 5: case 6: case 7: case 8: 
			season = "여룸";
			break;
			
		case 9: case 10: 
			season = "가을";
			break;
		default:
			season = "모름";
			break;
			
				System.out.printf("%d월은 %s입니다.", month, season);
		 */
	}
}
