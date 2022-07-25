package quiz;

public class B06_ForQuiz3 {

	/*
	 for문으로 다음 숫자 출력
	 1. 0 3 6 9 ... 96 99
	 2. -35 -28 -21 ... 0 7 ... 35
	 3. 100 200 300 400 ... 700 800 900 1000
	 4. 100 99 98 ... 3 2 1 0
	 5. 10 9 8.. 3 2 1 10 9... 4 3 2 1 (30번만)
	 
	 7. 7 77 777 7777 .... 7777777777
	 */
	
	public static void main(String[] args) {
		int i = 0;
		int cnt = 0;
		//1
		for(i=0 ; i < 34 ; i++) {
			cnt=i*3;
			System.out.printf("%-3d", cnt);
			
		}
		System.out.printf("\n");


		//2
		i=0;
		cnt=0;

		for(i=-5 ; i<=5 ; i++) {
			cnt=i*7;
			System.out.printf("%-3d", cnt);
		}


		//3		
		i=0;
		cnt=0;
		System.out.printf("\n");

		for(i=1 ; i <11;i++) {
			cnt=i*100;
			System.out.printf("%-6d", cnt);

		}
		//4


		i=0;
		System.out.printf("\n");

		for(i=100 ; i>=0 ; i--) {
			System.out.printf("%-3d", i);

		}

		//5
		i=0;
		System.out.printf("\n");

		for(i=0;i<30;i++) {
			for(int j=0; j<10; j++) {
				System.out.printf("%-3d", j);
			}
			System.out.printf("%d번째 출력\n", i);
		}


		//6
		i=0;
		System.out.printf("\n");

		for(i=1;i<=30;i++) {
			for(int j=10; j>0; j--) {
				System.out.printf("%-3d", j);
			}
			System.out.printf("%d번째 출력\n", i);
		}

		//7
		i=0;
		double num = 0;
		System.out.printf("\n");

		for(i=0;i<10;i++) {
			num = num + 7*(Math.pow(10,i));
			System.out.printf("%.0f  ", num);
			
		}
		/*
		  for(i=0;i<10;i++) {
			sum = sum + (long)(7*(Math.pow(10,i)));
			System.out.printf("%.0f  ", num);
			
			
			for(long i =7 ; i<= 777777777; i = i* 10 + 7)
		
		 */
		
		
		
	}
}
