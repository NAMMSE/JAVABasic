package quiz;

import java.util.Scanner;

public class B15_CountAlphabet {

	/*
	  ����ڷκ��� ������ �Է¹����� �ش� ���忡 �� ���ĺ��� ������ Ƚ���� �迭�� ������ �� 
	  1ȸ �̻� ������ ���ĺ��� �� ȸ �����ߴ��� ���
	  (�빮��, �ҹ��ڴ� ���� �����ؾ���)
	 */
	
	public static void main(String[] args) {
		
		/* ���ڵ�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		String str = sc.nextLine();
		
		
		int[] alnum = new int[52]; // �� 26���� �빮�� �� 26���� �ҹ���
		int bigcnt=0; // �빮�� ī��Ʈ
		int smlcnt=0; // �ҹ��� ī��Ʈ
		
		//
		for(int j='A' ;j<'Z';j++) { 			// j�� A�϶� ���ڿ��� �ѹ� �� ������ �� ���� B�϶� �ѹ� �� ������ �� / �빮�� ���� �����Ҷ� 65���� 'A'�� ����
			bigcnt=0;							// ���ڸ��� �ѹ� ������ �������ڶ��� Ƚ���� �ʱ�ȭ ������ϱ⶧��
			for(int i=0;i<str.length();i++) { 	// ���� ���̸�ŭ �����鼭 ���ϱ�
				if(((char)j) == str.charAt(i)) {// �빮�� �������� ��ġ�ϴ� ���ڰ� ������ 
					bigcnt++; 					// ���忡�� �ش� ���ڰ� ������ Ƚ����ŭ ī��Ʈ����
					alnum[j-'A'] = bigcnt; 		// �ش� �迭 �ڸ��� Ƚ�� ����
				}
			}
			smlcnt=0;
			for(int i=0;i<str.length();i++) {
				if(((char)(j+32)) == str.charAt(i)) {//65+32='a' �̱� ������
					smlcnt++;
					alnum[j-39] = smlcnt; // 65-39=26  0~25���� �빮�� 26~52���� �ҹ����̹Ƿ� 39�� ����
				}
			}
		}
		
//		for(int i=0;i<str.length();i++) { // ���ĺ� ���� Ƚ����ŭ ���� �ƴ��� Ȯ��
//			System.out.printf("%c�� ���� : %d \n", (char)(i+65),alnum[i]);
//			System.out.printf("%c�� ���� : %d \n", (char)(i+97),alnum[i+26]);
//		}
		
		for(int i=0;i<alnum.length;i++) {
			if(i<26) { // �빮�� ����ϱ� ����
				if(alnum[i]>=1) { // ����Ƚ���� 1ȸ �̻��ΰ�
					System.out.printf("%s�� ���� Ƚ���� %d�� �Դϴ�.\n",(char)(i+65),alnum[i]); // i=0�����̰� �빮�� ���� 65 �����༭ A���� �� ����
				}
			}
			else { //  �ҹ��� ���
				if(alnum[i]>=1) { // ����Ƚ�� 1ȸ �̻�
					System.out.printf("%s�� ���� Ƚ���� %d�� �Դϴ�.\n",(char)(i+71),alnum[i]);// i=26�����̰� �ҹ��� ���� 97���� �����Ϸ��� 97-26=71���� ��
				}
			}
		}	
������� ���ڵ�		*/
		
		//����� �ڵ�
		
		System.out.print("������ �Է��ϼ���>>");
		String text = new Scanner(System.in).nextLine();
		
		int[] lower = new int[26];
		int[] upper = new int[26];
		
		for(int i=0;i<text.length();i++) {
			char ch = (text.charAt(i)); // ������ �� ���ھ� ch�� ����
			
			if(ch>='a'&&ch<='z') { // ch�� �ҹ��� ���� �϶�
				lower[ch - 'a']++; // �ҹ��� �迭�� 0��° ch=65 'a'=65 65-65=0 ��° �ڸ� Ƚ�� 1����
			}
			else if(ch >= 'A' && ch <= 'Z') {// �빮�� ���� �϶�
				upper[ch - 'A']++;
			}
		}
		
		for(int i=0;i<26;i++) {
			if(lower[i] !=0) {// Ƚ���� 1�̻��� �͸� ���
				System.out.printf("%c : %d\n", (char)(i+'a'),lower[i]);
			}
			if(upper[i] !=0) {
				System.out.printf("%c : %d\n", (char)(i+'A'),upper[i]);
				
			}
			
		}
		
		
		
	}	
}
