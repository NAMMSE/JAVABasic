package quiz;

public class B11_WhileQuiz {

	/*
	 while���� ����Ͽ� ������ ���Ͻÿ�
	 
	 1. 500 ~ 1200 ���̿� �ִ� ��� 3�� ����� ����
	 2. 30���� 1���� �� �ٿ� ���� 5���� ���
	 3. 1���� 200������ ���� �߿� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
	 
	 */
	
	public static void main(String[] args) {
		
		int i=500, sum=0;
		//1
		while(i<=1200) {
			if(i%3==0) {
				//System.out.printf("%d \n", i);
				sum=sum+i;
			}
			i++;
		}
		System.out.printf("%d \n",sum);
		
		System.out.println("====================");
		
		//2
		i=30;
		
		while(i>=1) {
			System.out.printf("%-4d",i);
			i--;
			if(i%5==0) {
				System.out.println();
			}
		}
		
		System.out.println("====================");
		
		//3
		i=1;
		sum=0;
		while(i<=200) {
			if(i%2!=0 && i%3!=0) {
				//System.out.printf("%d \n", i);
				sum=sum+i;
			}
			i++;
		}
		System.out.printf("%d", sum);
	}
}
