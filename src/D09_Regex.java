import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {

	/*
	  # 정규 표현식(regular expression)
	  
	   - 문자열을 패턴으로 검사할 수 있는 표현식
	   - 특정 프로그래밍 언어에만 있는 것이 아닌 공통의 규칙이다
	   - 정의한 정규표현식 패턴과 일치하는 문자열을 걸러낼 수 있다
	   
	   
	  # Java의 정규표현식 클래스
	  
	   - Pattern
	   - Matcher
	 */
	
	public static void main(String[] args) {
		// Pattern.matches(regex, input) : input이 regex에 해당하는 문자열인지 검사하는 메서드
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : 해당 위치의 한 글자에 올 수 있는 문자들을 정의하는 표현식
		System.out.println(Pattern.matches("s[lhk]eep", "sleep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sheep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "skeek"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "saeez"));
		
		// \는 정규표현식에서도 특수 문법으로 사용되기 때문에 \\를 적어야 그냥 역슬래시를 의미한다
		System.out.println(Pattern.matches("s[lhk]ee[pkz\\\\]", "saee\\"));
		
		/*
		  [abc] : a 또는 b 또는 c를 모두 허용
		  [a-z] : a부터 z까지 모두 허용
		  [A-Z] : A부터 Z까지 모두 허용
		  [a-e&&c-g] : a-e와 c-g를 모두 만족시키는 문자를 허용
		 */
		
		System.out.println(Pattern.matches("s[c-kC-K\t]eep", "s	eep"));
		
		/*
		  # 하나로 여러 문자를 나타내는 것들
		  
		   . : 모든 문자를 허용한다 /  [.]이나 \.은 그냥 점을 나타낸다
		   \d : 모든 숫자
		   \D : 숫자를 제외한 모든 것
		   \s : 모든 공백 (\t, \n, , \r)
		   \S : 공백을 제외한 모든 것
		   \w : 일반적인 문자들을 허용[a-zA-Z0-9_] // _는 _만 허용
		   \W : \w를 제외한 모든 것을 허용
		   
		 */
		System.out.println(Pattern.matches("s.eep", "s*eep"));
		System.out.println(Pattern.matches("s.eep", "s1eep"));
		System.out.println(Pattern.matches("s\\.eep", "s.eep"));
		System.out.println(Pattern.matches("s[.]eep", "s.eep"));
		System.out.println(Pattern.matches("\\d\\d\\d", "142"));
		System.out.println(Pattern.matches("\\d\\s\\d", "1 2"));
		System.out.println(Pattern.matches("\\d..", "1@A"));
		
		/*
		  # 해당 패턴이 적용될 문자의 개수를 지정하는 방법
		  
		   .{n} 	: {}앞의 패턴이 n개 일치해야 한다
		   .{n,m}(띄어쓰면 안됨) : {} 앞의 패턴이 최소 n개이상 m개 '이하' 일치해야 한다
		   .{n,} 	: {} 앞의 패턴이 n개 이상 일치해야 한다 / {,m} 이건 없음
		   .? 		: ?앞의 패턴이 0번 또는 1번 나와야 한다
		   .+		: +앞의 패턴이 최소 1번 이상 나와야 한다
		   .* 		: *앞의 패턴이 0번 이상 나와야 한다
		 */
		
		System.out.println(Pattern.matches("\\d{5}", "12345"));
		System.out.println(Pattern.matches("\\d{2,5}", "12345"));
		System.out.println(Pattern.matches("\\d{2,}", "1234555555555555555"));
		System.out.println(Pattern.matches("\\d{2,5}", "12345"));
		System.out.println(Pattern.matches("abc[JQK]?", "abcQK"));
		System.out.println(Pattern.matches("abc[JQK]+", "abc"));
		System.out.println(Pattern.matches("abc[JQK]*", "abc123"));
		
		
		// 연습 1 : 해당 문자열이 핸드폰 번호인지 검사할 수 있는 정규표현식 만들기
		// 연습 2 : 해당 문자열이 이메일인지 검사할 수 있는 정규표현식 만들기
		
		System.out.println("==========================");
		Scanner sc=new Scanner(System.in);
//		System.out.print("핸드폰 번호 입력>>");
//		String pnum = sc.nextLine();
//		System.out.println(Pattern.matches("\\d{3}[-]\\d{4}[-]\\d{4}", pnum));
	//  System.out.println(Pattern.matches("01[016-9]-\\d{3,4}-\\d{4}", pnum));
//	
//		System.out.print("이메일 입력>>");
//		String email = sc.nextLine();
//		System.out.println(Pattern.matches("\\w*[@][a-z]*[.]+[a-z]{2,4}[.]?[a-z]{2,4}?", email));
//		System.out.println(Pattern.matches("\\w+@\\w+\\.+[a-zA-Z]+(.[a-zA-Z]+)*", email));
//		
		// Matcher 클래스 
		
		String text = "apple/banana/orange/kiwi/pineapple/grape/grapeapple/mango";
		
		// 1. 정규표현식을 컴파일하여 패턴 인스턴스를 생성
		Pattern applePattern = Pattern.compile("(\\w+)(apple)"); //("\\w+apple") 이렇게 하면 그냥 apple 은 안찾고 pine,grape apple 찾음 
		
		// 2. 해당 패턴 인스턴스로 문자열을 검사
		Matcher matchResult = applePattern.matcher(text);
		
		// 3. 매치 결과를 반복문을 활용해 모두 탐색할 수 있다
		while(matchResult.find()) {
			System.out.println("---- GROUP 0 (전체) ----");
			System.out.println("찾은 것 : "+matchResult.group(0)); 
			System.out.println("시작 인덱스 : "+matchResult.start(0));
			System.out.println("마지막 인덱스 : "+matchResult.end(0));
			
			System.out.println("---- GROUP 1 (정규 표현식의 첫번째 괄호) ----");
			System.out.println("찾은 것 : "+matchResult.group(1)); 
			System.out.println("시작 인덱스 : "+matchResult.start(1));
			System.out.println("마지막 인덱스 : "+matchResult.end(1));
			
			System.out.println("---- GROUP 2 (정규 표현식의 두번째 괄호)----");
			System.out.println("찾은 것 : "+matchResult.group(2)); 
			System.out.println("시작 인덱스 : "+matchResult.start(2));
			System.out.println("마지막 인덱스 : "+matchResult.end(2));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
