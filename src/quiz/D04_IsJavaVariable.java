package quiz;

import java.util.ArrayList;
import java.util.HashSet;

public class D04_IsJavaVariable {

	public static HashSet<String> keywords = new HashSet<>();
	
	static { // �ν��Ͻ� ���� �� Ű����鿡 ���� ���� �Է����ִ� ������ ��� - ����ƽ ���
		keywords.add("int");
		keywords.add("char");
		keywords.add("long");
		keywords.add("boolean");
		keywords.add("byte");
		keywords.add("break");
		keywords.add("if");
		keywords.add("case");
	}
	/*
	  ���ڿ��� �����ϸ� �ش� ���ڿ��� �ڹ��� �����μ� ���� �� �ִ��� �Ǻ����ִ� �޼��带 �����غ�����
	 */
	
	public static boolean java(String a) {
//		if(a.charAt(0)>='0'&&a.charAt(0)<='9') {
//			return false;
//		}
//		for(int i=0;i<a.length();i++) {
//			if(a.charAt(i)==' ') 
//				return false;
//			else if((a.charAt(i)>='!'&&a.charAt(i)<='/'&&a.charAt(i)!='$')
//					||(a.charAt(i)>=':'&&a.charAt(i)<'@')
//					||(a.charAt(i)>='['&&a.charAt(i)<'`'&&a.charAt(i)!='_')
//					||(a.charAt(i)>='{'&&a.charAt(i)<='~'))
//				return false;
//		}
//		return true;
//		
		//����� �˻�
		if(keywords.contains(a)) {
			System.out.printf("%s�� ��ϵ� ������Դϴ�.",a);
			return false;
		}
		
		
		
		ArrayList<Character> list = new ArrayList<>();
		for(char ch : a.toCharArray()) {
			list.add(ch);
		}
		// ù���� �˻�
		if(!Character.isJavaIdentifierStart(list.get(0))) {
			System.out.printf("%s�� ù ��° ���ڰ� %c�̹Ƿ� ������ �� �� �����ϴ�.\n", a, list.get(0));
			return false;
		}
		
		// �ι�°���� ���� �˻�
		for(int i=1;i<list.size();i++) {
			char ch = list.get(i);
			
			if(!Character.isJavaIdentifierPart(ch)) {
				System.out.printf("%s�� %d��° ���ڰ� %c�̹Ƿ� ������ �� �� �����ϴ�.\n", a,i, list.get(i));
				return false;
			}
		}
		
		
		return true;
		
		
	}
	
	public static void main(String[] args) {
//		String str = "ab cd";
//		String str1 = "1234";
//		String str2 = "$asdf";
//		String String = "123";
//		String r4 = "$!@#";
//		String a = "ASDGFXCsdf$$__123123412412";
//		
//		System.out.println(java(str));
//		System.out.println(java(str1));
//		System.out.println(java(str2));
//		System.out.println(java(String));
//		System.out.println(java(r4));
//		System.out.println(java(a));
//		
		java("abc123");
		java("_123");
		java("123");
		java("asdf#");
		java("int");
	}
}
