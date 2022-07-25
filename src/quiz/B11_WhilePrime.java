package quiz;

import java.util.Scanner;

public class B11_WhilePrime {

	/*
	 *  while������ ����ڷκ��� ���ڸ� �Է¹����� 1���� �Է��� ���� ���̿� �����ϴ� ��� �Ҽ��� ���
	 2 3 5 7 11 13 17 19
	 
	 1���� �ڱ� �ڽű��� �������� 2���� �Ҽ�
	 2���� �ڱ��ڽ�-1���� �������� ����� 0���� �Ҽ�
	 2���� �ش������ �����ٱ��� �������� ����� 0����� �Ҽ���
	 */
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("���ڸ� �Է��ϼ���>>");
			num = sc.nextInt();
			if(num>1) {
				break;
			}
			else {
				System.out.print("2�̻��� ");
			}
		}
		
		/* �� �ڵ�
		int i = 2;
		int result=0;
		int cnt = 0;
		System.out.print("�ش� ���ڱ����� �Ҽ��� : ");
		while(i<=num) {
			int j = 2; // ���ڿ��� 1�� �ڱ� �ڽ��� �����ϰ� ������ �������� ������ ������ �� �̿�
			while(j<i) {
				result = i%j;
				if(result==0) {// ����� �ִ� ������ �������� 0�� ���� �ݵ�� ����
					cnt++;
				}
				j++;
			}
			if(cnt==0) { // �Ҽ��� �������� 0�� ������ ������ ���� ������ count�� 0�̿��� �Ҽ���
				System.out.printf("%d ",i);
			}
			i++;
			cnt=0; // ī��Ʈ �ʱ�ȭ
		} */
		
		int i = 2;
		while(i<=num) {
			boolean prime = true;
			
			int chk = 2; 
			double sqrt = Math.sqrt(i);
			while(chk<=sqrt) {
				if(i%chk == 0) {
					prime = false;
					break;
				}
				chk++;
			}
			if(prime) {
				System.out.println(i);
			}
			i++;
		}
		
	}
}
