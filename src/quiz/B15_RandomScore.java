package quiz;

public class B15_RandomScore {

	/* #############################������ ������ �ٽ� Ǯ����ߵ�#############################
	 * 
	   1. �л� 100���� ����(0~100)�� �������� �����Ͽ� �迭�� ����
	   2. �迭�� ����� ���� ���� ���� ���·� ���
	   3. ��� �л����� ��� ������ ���( �Ҽ� ��° �ڸ����� ���) 
	   4. �迭�� ����� ���� �� ���� ���� ������ ���� ���� ������ ���
	 */
	public static void main(String[] args) {
		
		int[] score = new int[100];
		
		for(int i=0 ; i<score.length ; i++) {
			score[i]=(int)(Math.random()*101); //  100 �ƴϰ� 101�ؾ� 100������ ����
			System.out.printf("%3d��° �л��� ���� : %d \n",i+1,score[i]);
		}
		System.out.printf("==============================\n");
		
		
		int sum = 0;
		for(int i=0 ; i<score.length ; i++) {
			sum+=score[i];
		}
		System.out.printf("������ %d�� ��� �л����� ��� ������ %.2f���Դϴ�. \n",sum, sum/100.0);
		System.out.printf("==============================\n");
		
		//����� �ڵ�
		
		int best =0;
		int worst =100;                          // 100���� �ʱ�ȭ�ؼ� ���� �� ���ö����� �� ���ڷ� �ʱ�ȭ
		for(int i =0;i<score.length;i++) {
			
			//best = best<score[i] ? score[i]:best;
			if(best<score[i]) {
				best = score[i];
			}
			if(worst>score[i]) {
				worst=score[i];
			}
		}
		System.out.printf("���� ���� �л��� ������ %d��, ���� ������ %d���Դϴ�.",worst,best
				);
		
		
		
		
		
		/* �� �ڵ� �ϴ� ����
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
		System.out.printf("���� ���� �л��� ������ %d��, ���� ������ %d���Դϴ�.",temp,max);
		*/
		
	}
}

//for(int j=i+1 ; j<score.length-1-i ; j++) {
//
//min=Math.min(score[i], score[i+j]);
//}
		