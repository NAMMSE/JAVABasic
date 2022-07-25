package quiz;

import java.util.Random;

public class B16_Array2Quiz {

	/*
	 
	 */
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[][] numArr = new int[][] {
			{1, 1, 1, 1, 1},
			{1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1, 1},
			{1, 1},
			{1, 1, 1, 1}
		};
		
		//1. numArr의 모든 값을 0~100 사이의 랜덤 정수로 바꾸기
		
		//2. 랜덤으로 바뀐 numArr의 모든 값을 출력하고 총합과 평균을 출력
		
		//3. numArr의 각 행(row)의 합을 구해서 출력하기
		
		//4. numArr의 각 열(column)의 합을 구해서 출력하기    // #######백지에 다시 풀기#######
		
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr[i].length;j++) {
				numArr[i][j]=(ran.nextInt(101));
				System.out.printf("numArr[%d][%d] : %d\n", i,j,numArr[i][j]);
			}
		}
		int sum=0;
		int cnt=0;
		for(int i=0;i<numArr.length;i++) {
			int len = numArr[i].length;
			cnt+=len;
			for(int j=0;j<len;j++) {
				sum+=numArr[i][j];
				//cnt++;
			}
		}
		System.out.printf("numArr의 총합은 %d, 평균은 %.2f\n", sum, sum/(double)cnt);
		System.out.println("\"=========================\"");
		
		int maxColumnSize = 0; // 각 배열에서 최대길이인 배열의 길이를 구하기위한 변수
		for(int i=0;i<numArr.length;i++) {
			int len = numArr[i].length;
			maxColumnSize = len > maxColumnSize ? len : maxColumnSize; // Math.max(len,maxColumnSize);
			sum=0;
			for(int j=0;j<len;j++) {
				sum+=numArr[i][j];
			}
			System.out.printf("numArr[%d]의 총합 : %d\n",i, sum);
		}
		System.out.println("\"=========================\"");
		/* 내코드
//		for(int i=0; i<numArr[i].length;i++) {
//			sum=0;
//			for(int j=0;j<numArr[i].length;j++) {
//				if(numArr[j][i]>0) {
//				sum+=numArr[j][i];
//				}
//				else {
//					continue;
//				}
//			}
//			System.out.printf("numArr %d열의 총합 : %.0f\n",i,sum);
//		}
//		
		
//		각 배열의 길이 확인 후 배열 길이의 최대값 구하기
	//	최대값의 길이만큼 if문으로 1부터 최대길이까지 계속 돌리면서 범위 안에 들어오면 그때 그길이만큼의 열 값을 더해줌
		여기까지 내 코드*/
		
		
		// 열의합 구하기 강사님 코드
//		System.out.println(maxColumnSize);
//		int numArrsize = numArr.length;
//		for( int col=0;col<maxColumnSize;col++) {
//			sum=0;
//			for(int row=0;row<numArr.length;row++) {
//				if(col<numArr[row].length) {
//					sum+=numArr[row][col];
//					System.out.printf("col : %d, row : %d의 값을 더했습니다.",col,row);
//				}
//				else {
//					System.out.printf("col : %d, row : %d에는 값이 존재하지 않습니다..",col,row);
//				}
//			}
//			System.out.printf("%d열의 합 : %d\n",col,sum);
//		}
//		
		int[] colsum = new int[maxColumnSize];
		for(int row = 0;row<numArr.length;row++) {
			for(int col = 0;col<numArr[row].length;col++) {
				colsum[col] += numArr[row][col];
			}
		}
		
		
		
		
	}
}
