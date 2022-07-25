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
		
		//1. numArr�� ��� ���� 0~100 ������ ���� ������ �ٲٱ�
		
		//2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ����� ���
		
		//3. numArr�� �� ��(row)�� ���� ���ؼ� ����ϱ�
		
		//4. numArr�� �� ��(column)�� ���� ���ؼ� ����ϱ�    // #######������ �ٽ� Ǯ��#######
		
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
		System.out.printf("numArr�� ������ %d, ����� %.2f\n", sum, sum/(double)cnt);
		System.out.println("\"=========================\"");
		
		int maxColumnSize = 0; // �� �迭���� �ִ������ �迭�� ���̸� ���ϱ����� ����
		for(int i=0;i<numArr.length;i++) {
			int len = numArr[i].length;
			maxColumnSize = len > maxColumnSize ? len : maxColumnSize; // Math.max(len,maxColumnSize);
			sum=0;
			for(int j=0;j<len;j++) {
				sum+=numArr[i][j];
			}
			System.out.printf("numArr[%d]�� ���� : %d\n",i, sum);
		}
		System.out.println("\"=========================\"");
		/* ���ڵ�
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
//			System.out.printf("numArr %d���� ���� : %.0f\n",i,sum);
//		}
//		
		
//		�� �迭�� ���� Ȯ�� �� �迭 ������ �ִ밪 ���ϱ�
	//	�ִ밪�� ���̸�ŭ if������ 1���� �ִ���̱��� ��� �����鼭 ���� �ȿ� ������ �׶� �ױ��̸�ŭ�� �� ���� ������
		������� �� �ڵ�*/
		
		
		// ������ ���ϱ� ����� �ڵ�
//		System.out.println(maxColumnSize);
//		int numArrsize = numArr.length;
//		for( int col=0;col<maxColumnSize;col++) {
//			sum=0;
//			for(int row=0;row<numArr.length;row++) {
//				if(col<numArr[row].length) {
//					sum+=numArr[row][col];
//					System.out.printf("col : %d, row : %d�� ���� ���߽��ϴ�.",col,row);
//				}
//				else {
//					System.out.printf("col : %d, row : %d���� ���� �������� �ʽ��ϴ�..",col,row);
//				}
//			}
//			System.out.printf("%d���� �� : %d\n",col,sum);
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
