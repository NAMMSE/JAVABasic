package quiz;

import java.util.Arrays;

public class B15_Sort {

	/*
	 ���� ���� 30��(0~99999)�� ����ִ� �迭�� ������ �� 
	 1. �ش� �迭�� ������ ���� ������ ���ʴ�� ������ ���ο� �迭�� ����
	 2. �ش� �迭�� ������ ū ������ ���ʴ�� ������ ���ο� �迭�� ����
	 */
	
	public static void main(String[] args) {
	/*  ���ڵ� ����	
		int[] ran = new int[30];
		int[] minsort = new int[30];
		int[] maxsort = new int[30];
		int temp=0;

		for(int i=0;i<ran.length;i++) {
			ran[i]=(int)(Math.random()*100000); // 10������ ���� ���� ���� �� ����
			//System.out.println(ran[i]);
		}
		
		for(int i=0;i<ran.length;i++) { 		// i�� �ٸ� ���� ������ ������ �ʰ� 30�� �ݺ��ϱ����� �ݺ���
			for(int j=0;j<ran.length-1-i;j++) { // �ѹ� �񱳸� ���� �ϰ� ���� ū ���� �迭�� ���� ������ �ڸ��� ���ְ� ���� �񱳶� �������ڸ��� ���� �ʿ䰡 ���� ������ Ƚ���� ������ i�� �������ν� �ݺ� ������ ������
				if(ran[j]>ran[j+1]) { 			// ���� ���� �տ� ū ���� �ڿ� �;� �ϱ⶧���� �տ� ���� ���� ���� ����
					temp=ran[j]; 				// �ڸ� �̵�
					ran[j]=ran[j+1];
					ran[j+1]=temp;
				}
			}
			minsort[ran.length-1-i]=ran[ran.length-1-i]; // �ѹ� �� �ϸ� ū ���ڰ� �迭 �ڿ������� ä������ ������ ���ο� �迭�� �����Ҷ��� �ڿ������� ����
		}
		for(int i=0;i<ran.length;i++) {
			System.out.printf("�������� %2d��° ���� : %d \n",i+1,minsort[i]);
		}
		System.out.printf("========================\n");
		
		
		for(int i=0;i<ran.length;i++) {			// ���������� Ƚ���� ������ �뵵�̱⶧���� i--�� �ϰų� �� �ʿ䰡 ����
			for(int j=ran.length-1;j>i;j--) {	//�ڿ������� ���ϸ鼭 ���� ū ���ڸ� �տ� �������Ѿ� �ϹǷ� ������ �ڸ����� ���鼭 �� / ���� �񱳶� ���� �պ��� 1ĭ�� ���� �ʿ䰡 ���⶧���� j>i
				if(ran[j]>ran[j-1]) { 			// �ڿ��ִ� ���ڰ� �պ��� ũ�� ������ ������ �ϹǷ�
					temp=ran[j];
					ran[j]=ran[j-1];
					ran[j-1]=temp;
				}
			}
			maxsort[i]=ran[i]; // ���� �պ��� ū ���ڰ� ä������ ������ [i]������ ���� ���ش�
		}
		for(int i=0;i<ran.length;i++) {
			System.out.printf("�������� %2d��° ���� : %d \n",i+1,maxsort[i]);
		}
		
������� �� �ڵ�		*/
		
		
		
		
		
		/*
		 # ���� ����
		 
		 1. �迭 ��ü���� ���� ���� ���� ã�� �� �տ� �ִ´�
		 2. �� ���� ������ �迭 ��ü���� ���� ���� ���� ã�� �� ��° �ڸ��� �ִ´�
		 3. ...
		 */
		
		int[] origin = new int[10];
		
		for(int i=0;i<origin.length;i++) {
			origin[i]=(int)(Math.random()*100000); // 10������ ���� ���� ���� �� ����
			//System.out.println(ran[i]);
		}
		int[] asc = new int[origin.length];// ������������ ������ �迭 ����
		int[] desc = new int[origin.length];//������������ ������ �迭 ����
		
		for(int i=0;i<asc.length;i++) {
			asc[i]=origin[i];// �������� �迭�� ���� ���� ����
			desc[i]=origin[i];// �������� �迭�� ���� ���� ����
		}
		System.out.printf("������: %s \n", Arrays.toString(asc));
		
		// # ���� ����
//		for(int step = 0;step<asc.length ;step++) { // ������ 0���� ����� �迭�� ���̸�ŭ �ݺ�
//			// 1�ܰ� : �ּҰ��� ��ġ�� ã�´�
//			// �ϴ� �ּҰ��� ��ġ�� �ش� �ܰ� ������ �����Ѵ�
//			int min_index = asc[step]; // �迭�� step��° ���� min_index�� ����
//			for(int i = step+1 ; i<asc.length;i++) { // ���ܹ�° ���� �� �������� ���Ͽ� ��������� ���� ���� ����ؼ� �����ϴ� �˰����̹Ƿ� ������ step + 1
//				min_index=asc[step] > asc[i] ? i : min_index; // ���� step��° ���� i��° ���� ���Ͽ� min_index�� �����Ѵ�
//			}
//			
//			// 2�ܰ� : �ּҰ��� �� ��(������ �ܰ� �ε���)���� �̵���Ų��
//			int temp = asc[step];
//			asc[step] = asc[min_index];
//			asc[min_index] = temp;
//			System.out.printf("selsect sort %d �ܰ�: %s\n",step, Arrays.toString(asc));
//			
//		}
		
		// # ���� ����
		
		for(int step = 0; step<desc.length-1;step++) {// 30�� �ݺ��ϱ����� �ݺ��� / 0�� �ε������� n��°�� n+1��°�� ���ϱ⶧���� �ݺ� ������ �迭������ -1
			for(int i=0;i<desc.length -1 -step;i++) {//�ѹ� �񱳸� ���� �ϰ� ���� ū ���� �迭�� ���� ������ �ڸ��� ���ְ� ���� �񱳶� �������ڸ��� ���� �ʿ䰡 ���� ������ Ƚ���� ������ step �������ν� �ݺ� ������ ������
				if(desc[i] < desc[i+1]) {//ū ���� �տ� ���� ���� �ڿ� �;� �ϱ⶧���� �տ� ���� ���� ���� ����
					int temp = desc[i];//�ڸ� �̵�
					desc[i] = desc[i+1];
					desc[i+1] = temp;
				}
			}
			System.out.printf("%d �ܰ�: %s\n",step, Arrays.toString(desc));
		}
	}
}






































