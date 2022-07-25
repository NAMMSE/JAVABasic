package quiz;

import java.util.ArrayList;
import java.util.HashSet;

public class D04_IsJavaVariable {

	public static HashSet<String> keywords = new HashSet<>();
	
	static { // 인스턴스 생성 전 키워드들에 대한 값을 입력해주는 유일한 방법 - 스태틱 블록
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
	  문자열을 전달하면 해당 문자열이 자바의 변수로서 사용될 수 있는지 판별해주는 메서드를 정의해보세요
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
		//예약어 검사
		if(keywords.contains(a)) {
			System.out.printf("%s는 등록된 예약어입니다.",a);
			return false;
		}
		
		
		
		ArrayList<Character> list = new ArrayList<>();
		for(char ch : a.toCharArray()) {
			list.add(ch);
		}
		// 첫글자 검사
		if(!Character.isJavaIdentifierStart(list.get(0))) {
			System.out.printf("%s는 첫 번째 글자가 %c이므로 변수가 될 수 없습니다.\n", a, list.get(0));
			return false;
		}
		
		// 두번째글자 이후 검사
		for(int i=1;i<list.size();i++) {
			char ch = list.get(i);
			
			if(!Character.isJavaIdentifierPart(ch)) {
				System.out.printf("%s는 %d번째 글자가 %c이므로 변수가 될 수 없습니다.\n", a,i, list.get(i));
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
