package quiz;

import java.util.Scanner;

public class B07_CountE {

	/* 
	 ����ڰ� �������Է��ϸ� �ش� ���忡 ���ĺ� e�� �� �� �����ϴ��� �˷��ִ� ���α׷��� ����� ����
	 
	 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int big = 0, small = 0;
		System.out.print("������ �Է��ϼ���>>");
		String sen = sc.nextLine();
		
		for(int i=0;i<sen.length();i++) {
			if(sen.charAt(i)=='e')
			{
				small++;
			}
			else if(sen.charAt(i)=='E')
			{
				big++;
			}
		}
		System.out.printf("���忡 ������ e�� ������ %d��, E�� ������ %d���Դϴ�.", small, big);
		
		
	}
}
