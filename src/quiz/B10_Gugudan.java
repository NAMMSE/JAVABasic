package quiz;

public class B10_Gugudan {

	/*
	  1. 구구단 출력
	  2단: 2x1=2 2x2=4 2x3=6 ...
	  3단: 3x1=3 ...
	  
	  2. 세로 출력
	  2단	3단		4단
	  2x1=2  3x1=3  4x1=4
	  2x2=2  3x2=6  4x2=8
	  
	 */
	public static void main(String[] args) {
		int dan, gop;
		for (dan = 2; dan <= 9; dan++) {
			System.out.printf("%d단: ", dan);
			for (gop = 1; gop <= 9; gop++) {
				System.out.printf("%dx%d=%-2d  ", dan, gop, dan * gop);// /t 말고 %-2d쓰기
				//System.out.printf("\t");
			}
			System.out.printf("\n");
		}
		System.out.printf("\n\n");

	//	for (dan = 2; dan <= 9; dan++) {
		//	System.out.printf("%d단\t", dan);
	//	}
		
		System.out.printf("\n");
		for (gop = 0; gop <= 9; gop++) { // 0부터 시작해서 if문으로 0일떄는 ㄷ%d단 출력
			// System.out.printf("%d");
			for (dan = 2; dan <= 9; dan++) {
				if(gop==0) {
					System.out.printf("%d단\t",dan);
				}
				else {
				System.out.printf("%dx%d=%d\t", dan, gop, dan * gop);
				}
			}
			System.out.printf("\n");
		}

	}
}
