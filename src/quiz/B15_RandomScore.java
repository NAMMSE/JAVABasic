package quiz;

public class B15_RandomScore {

	/* #############################무조건 백지에 다시 풀어봐야됨#############################
	 * 
	   1. 학생 100명의 점수(0~100)를 랜덤으로 생성하여 배열에 저장
	   2. 배열에 저장된 값을 보기 좋은 형태로 출력
	   3. 모든 학생들의 평균 점수를 출력( 소수 둘째 자리까지 출력) 
	   4. 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은 점수를 출력
	 */
	public static void main(String[] args) {
		
		int[] score = new int[100];
		
		for(int i=0 ; i<score.length ; i++) {
			score[i]=(int)(Math.random()*101); //  100 아니고 101해야 100점까지 나옴
			System.out.printf("%3d번째 학생의 점수 : %d \n",i+1,score[i]);
		}
		System.out.printf("==============================\n");
		
		
		int sum = 0;
		for(int i=0 ; i<score.length ; i++) {
			sum+=score[i];
		}
		System.out.printf("총점은 %d점 모든 학생들의 평균 점수는 %.2f점입니다. \n",sum, sum/100.0);
		System.out.printf("==============================\n");
		
		//강사님 코드
		
		int best =0;
		int worst =100;                          // 100으로 초기화해서 작은 수 나올때마다 그 숫자로 초기화
		for(int i =0;i<score.length;i++) {
			
			//best = best<score[i] ? score[i]:best;
			if(best<score[i]) {
				best = score[i];
			}
			if(worst>score[i]) {
				worst=score[i];
			}
		}
		System.out.printf("가장 낮은 학생의 점수는 %d점, 높은 점수는 %d점입니다.",worst,best
				);
		
		
		
		
		
		/* 내 코드 하다 만거
		int min=0;
		int max=0;
		int temp=0;
		int temp2=0;
		for(int i=0 ; i<score.length-1 ; i++) {
			for(int j=i+1 ; j<score.length-1-i ; j++) {
			
			if(score[i]>score[i+j]) {
				temp=score[i+1];
				continue;
			}
			}
		}
		System.out.printf("가장 낮은 학생의 점수는 %d점, 높은 점수는 %d점입니다.",temp,max);
		*/
		
	}
}

//for(int j=i+1 ; j<score.length-1-i ; j++) {
//
//min=Math.min(score[i], score[i+j]);
//}
		