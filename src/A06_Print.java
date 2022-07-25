
public class A06_Print {

	/*
	 # 콘솔에 출력하는 함수들
	  1. println()
	   - ()안에 전달한 데이터를 콘솔에 출력하면서 줄을 자동으로 바꿔준다.
	   
	  2. print()
	   - ()안에 전달한데이터를 콘솔에 출력한다
	   
	  3. printf()
	   - print Format
	   - 서식을 이용해 원하는 출력 형태를 미리 만들어 둘 수 있는 함수
	   - 서식 문자 자리에 값을 순서대로 채워서 사용한다
	   - \n이 자동으로 추가되지 않으므로 주의해야 한다
	   
	   # 서식 문자의 종류
	   
	    %d : 해당 자리에 전달한 정수값을 10진수로 출력(decimal)
	    %x : 해당 자리에 전달한 정수값을 16진수로 출력(소문자)
	    %X : 해당 자리에 전달한 정수값을 16진수로 출력(대문자)
	    %o : 해당 자리에 전달한 정수값을 8진수로 출력
	    %s : 문자열
	    %c : 문자
	    %f : 실수
	    %% : 그냥 %를  출력하고 싶을 때 사용
	    1234(8) = 8^3 * 1 + 8^2 * 2 + 8^1 * 3 + 4
	   
	   # 서식 문자 옵션
	   
	     - 서식 문자의 %와 문자 사이에 넣어서 사용한다
	     
	     1. %숫자d
	      - 자릿수를 숫자만큼 확보하면서 출력한다
	    
	     2. %-숫자d
	      - 자릿수를 숫자만큼 확보하면서 왼쪽 정렬하여 출력한다
	      
	     3. %0숫자d
	      - 자릿수를 숫자만큼 확보하고 빈자리에 0을 채워 출력
	      
	     4. %.숫자f
	      - 실수의 소수점 아래 자릿수를 설정한다

			위 옵션들은 서로 조합하여 사용가능
	 */
	
	

	
	public static void main(String[] args) {
		
		System.out.printf("오늘은 %d%d 입니다. \n", 4, 13);
		
		int year = 2022;
		int month = 4;
		int day = 13;
		int hour = 14;
		int min = 25;
		int sec = 55;
		
		System.out.printf("오늘은 %d%d 입니다. \n", 4, 13);
		System.out.printf("오늘은 " + year + "년 " + month + "월 " + day + "일이고 "
				+ "현재 시간은 "+ hour + "시 " + min + "분 " + sec + "초 입니다 \n");
		System.out.printf("오늘은 %d년 %d월 %d일이고, 현재시간은 %d시 %d분 %d초 입니다. \n",
				           year, month, day, hour, min, sec);
		
		System.out.printf("30(10): %d\n", 30);
		System.out.printf("30(16): %x\n", 30);
		System.out.printf("30(16): %X\n", 30);
		System.out.printf("30(8): %o\n", 30);
		System.out.printf("오늘은 %s 입니다\n", "목요일");
		System.out.printf("오늘은 %c 입니다\n", '5');
		System.out.printf("오늘은 %f 입니다\n", 24.3);
		
		System.out.printf("%5d\n", 24);
		System.out.printf("%10d\n", 24);
		System.out.printf("%15d\n", 24);
		
		System.out.printf("%-5d : 10\n", 15);
		System.out.printf("%-10d : 10\n", 15);
		System.out.printf("%-15d : 10\n", 15);
		
		System.out.printf("%02d\n",15);
		System.out.printf("%02d\n",3);
		
		System.out.printf("%010.3f\n",123.555555555); //서식문자 옵션 조합
		System.out.printf("%02d\n",3);
	
		
	}
}
