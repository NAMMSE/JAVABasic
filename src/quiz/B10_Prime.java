package quiz;

import java.util.Scanner;

public class B10_Prime {

	/*
	 ����ڷκ��� ���ڸ� �Է¹����� 1���� �Է��� ���� ���̿� �����ϴ� ��� �Ҽ��� ���
	 2 3 5 7 11 13 17 19
	 
	 1���� �ڱ� �ڽű��� �������� 2���� �Ҽ�
	 2���� �ڱ��ڽ�-1���� �������� ����� 0���� �Ҽ�
	 2���� �ش������ �����ٱ��� �������� ����� 0����� �Ҽ���
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, result, cnt=0;
		//System.out.printf("%d",11%10);
		for(;;) {
			System.out.print("���ڸ� �Է��ϼ���>>");
			num = sc.nextInt();
			if(num>0) {
				break;
			}
			else {
				System.out.print("����� �ٽ� ");
			}
		}
		
		
		/*
		System.out.print("�Է��� ���ڱ����� �Ҽ� : ");
		for(int i =2;i<=num;i++) { // �Ҽ��� �ƴ� ���ڵ��� �������� 0�μ����� �ݵ�� ���� ���� �̿��Ϸ��ٰ� ���� �ٽ� ����
			for(int j=2;j<i;j++) {
				result = i%j;
			//	System.out.printf("%d %% %d = %d\n",i,j,result);
				if(result==0) {
					cnt++;
				}
			}
			if(cnt==0) {
				System.out.printf("%d ",i);
			}
			cnt=0;
		}
		*/
		
		/* �� ������ �ڵ�
		if(num==1) {
			System.out.println("�Է��� ���ڱ����� �Ҽ��� �����ϴ�.");
			return;
		}
		System.out.print("�Է��� ���ڱ����� �Ҽ� : "); 
		for(int i=2;i<=num;i++) { // 1���� �ش� ���ڱ��� �������� �������� 0�� ������ 1�� �����϶� �ۿ� ����
			for(int j=1;j<=i;j++) {
				result=i%j;
				if(result==0) {
					cnt++;
				}
				//System.out.printf("%d / %d = %d\n",i,j,result);
			}
			//System.out.printf("--\n");
			if(cnt==2) {
				System.out.printf("%d ",i);
			}
			cnt=0;
		} �������
		*/ 
		
		// ����� �ڵ�
		//for(num = sc.nextInt();num<2;num=sc.nextInt()) {
			//System.out.println("�ٽ� �Է����ּ��� "+num);
			//System.out.print("2�̻��� ���ڸ� �Է����ּ���>> ");}
		
		for(int i = 2; i<= num; i++){
			boolean prime = true;

			double sqrt = Math.sqrt(i);
			for(int test = 2; test<=sqrt ; test++){
				if(i%test == 0){
					prime = false;
					break;
				}
			}
			if(prime){
				System.out.printf("%d�� �Ҽ��Դϴ�. \n",i);
			}
		}
	}
}

 


