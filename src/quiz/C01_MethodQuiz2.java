package quiz;

import java.util.Arrays;
import java.util.Random;

public class C01_MethodQuiz2 {

	/*
	 1. ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ �����ϴ� �޼���
	 
	 2. ���ڿ��� �����ϸ� �ش� ���ڿ��� �������� �ڼ��� ����� ��ȯ�ϴ� �޼���
	    (StringBuilder ���)
	 3. ���ڿ��� �����ϸ� �ش� ���ڿ��� �Ųٷ��� ���ڿ��� ��ȯ�ϴ� �޼���
	    (StringBuilder ���)
	 4. �޼��带 ȣ���ϸ� 1 ~ 45 ������ �ߺ����� ���� 8���� �̷���� �迭�� ��ȯ�ϴ� �޼���
	 
	 */
	
	
	public static int appleBasket(int apple, int basket) {
		if(apple < 0 || basket<=0) {
			return -1; // ����� 0���� �۰ų� �ٱ��ϰ� 0���� ������ ������ �߻��� �� �����Ƿ� -1 ��ȯ
		}
		return apple%basket==0 ? apple/basket : apple/basket+1; // �������� ������ �ٱ��� ������ŭ ��� ������ �� �°� �������� ����� �ٱ��ϰ� �ϳ� �� �־�� ��
	}
	
	public static StringBuilder randomstr(String str) {
		StringBuilder ranstr = new StringBuilder();    // �������� ��� str�� �� ���ڵ��� insert ���ֱ� ���� ��Ʈ������
		
		int[] ran = new int[str.length()];   // �ߺ����� n����ŭ ���ڸ� �̾Ƽ� �迭�� �����ϴ� �ݺ���
		for(int i = 0 ; i<ran.length;i++) {
			int newnum = (int)(Math.random()*str.length());
			ran[i]=newnum;
			for(int j=0;j<i;j++) {
				if(newnum==ran[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0 ; i<str.length();i++) {  // ��Ʈ���� ���̸�ŭ �迭�� �������� �ε����� �����ϰ� �ش� �ε����� ���ڵ��� ranstr�� insert �Ͽ� �־���
			ranstr.insert(0, str.charAt(ran[i]));
		}
		
		return ranstr;
	}
	
	//����� �ڵ� - ���ڿ� ���� 1 
	public static String strShuffle(String str) {
		Random ran = new Random();
		//���ڿ� -> char[]�� �ٲٱ�
		char[] arr = str.toCharArray();
		for(int i = 0 ;i<100;i++) {
			int random_index = ran.nextInt(arr.length);
			
			char temp = arr[0];
			arr[0] = arr[random_index];
			arr[random_index] = temp;
		}
		// �� ���� ���� char[]�� ���ڿ��� ��ȯ�Ͽ� ���� (�׳� arr ������ ������)
		return new String(arr);
	}
	// ����� �ڵ� - ���ڿ� ���� 2
	public static String BuilderShuffle(String str) {
		// ���ο� Stringbuilder�� ���鶧 ���ڿ��� ������ �� �ִ�.
		StringBuilder builder = new StringBuilder(str);
		Random ran = new Random();
		for(int i =0;i<100; i++) {
			int random_index = ran.nextInt(builder.length());
			
			// builder.charAt(index) : �ش� �ε����� ���ڸ� �ϳ� ������
			// builder.setCharAt(index, char) : �ش� �ε����� ������ ���ڷ� ������
			char temp = builder.charAt(0);
			builder.setCharAt(0, builder.charAt(random_index));
			builder.setCharAt(random_index, temp);
		}
		return builder.toString();
	}
	
	public static String reversestr(String str) {
		StringBuilder revstr = new StringBuilder();
		for(int i=0;i<str.length();i++) { // 0��° ���ں��� ������ ���ڱ��� ���ڿ��� ���� �տ� �־��ָ� ������ �������� ������ �ȴ�
			revstr.insert(0,str.charAt(i));
		}
		
		return revstr.toString();
	}
	
	// ����� �ڵ� - ���ڿ� ������
	public static String strReverse(String str) {
		StringBuilder builder = new StringBuilder(str);

		// builder. reverse() : ������ ����ִ� ������ �Ųٷ� �ٲ۴�
		 return builder.reverse().toString();
	}
	
	public static int[] randomnum() {
		Random random = new Random();
		int[] ran = new int[8];
		for(int i = 0 ; i<ran.length;i++) {
			int newnum = random.nextInt(45)+1;
			ran[i]=newnum;
			for(int j=0;j<i;j++) {
				if(newnum==ran[j]) { // ���� ��ġ�� ���ڰ� ������
					i--;			 // --i�� �ٽ� ���ڸ� ����
					break;
				}
			}
		}
		return ran;
	}
	
	public static void main(String[] args) {
		//1��
		System.out.println("�ʿ��� �ٱ����� ���� : "+appleBasket(6,5));
		int basketcount = appleBasket(21, 8);
		switch (basketcount) {
		case -1: // appleBasket �޼��忡�� ���� �߻��ұ�� -1�� �����Ѱ� ���� ���� �װ� �޾Ƽ� �߸��� ����� �����
			System.out.println("�߸��� ����Դϴ�.");
			break;
		default:
			System.out.println("�ʿ��� �ٱ����� ���� : "+basketcount);
			break;
					
		}
		
		System.out.println(BuilderShuffle("hello, world!"));
		System.out.println(strShuffle("hello, world!"));
		
		
		//2��
		
		System.out.println("���ڿ� �������� >> "+randomstr("ABCDEFG"));
		
		//3��
		System.out.println("���ڿ� �Ųٷ� >> "+reversestr("ABCDEFG"));
		System.out.println("���ڿ� �Ųٷ� >> "+strReverse("ABCDEFG"));
		System.out.println("8���� �ߺ����� ���� ���� : "+Arrays.toString(randomnum()));
		
		
	
	}
}
