package quiz;

import java.util.Scanner;

public class B07_CountE {

	/* 
	 사용자가 문장을입력하면 해당 문장에 알파벳 e가 몇 번 등장하는지 알려주는 프로그램을 만들어 봇요
	 
	 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int big = 0, small = 0;
		System.out.print("문장을 입력하세요>>");
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
		System.out.printf("문장에 등장한 e의 개수는 %d개, E의 개수는 %d개입니다.", small, big);
		
		
	}
}
