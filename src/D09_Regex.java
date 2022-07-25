import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {

	/*
	  # ���� ǥ����(regular expression)
	  
	   - ���ڿ��� �������� �˻��� �� �ִ� ǥ����
	   - Ư�� ���α׷��� ���� �ִ� ���� �ƴ� ������ ��Ģ�̴�
	   - ������ ����ǥ���� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��� �� �ִ�
	   
	   
	  # Java�� ����ǥ���� Ŭ����
	  
	   - Pattern
	   - Matcher
	 */
	
	public static void main(String[] args) {
		// Pattern.matches(regex, input) : input�� regex�� �ش��ϴ� ���ڿ����� �˻��ϴ� �޼���
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش� ��ġ�� �� ���ڿ� �� �� �ִ� ���ڵ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lhk]eep", "sleep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sheep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "skeek"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "saeez"));
		
		// \�� ����ǥ���Ŀ����� Ư�� �������� ���Ǳ� ������ \\�� ����� �׳� �������ø� �ǹ��Ѵ�
		System.out.println(Pattern.matches("s[lhk]ee[pkz\\\\]", "saee\\"));
		
		/*
		  [abc] : a �Ǵ� b �Ǵ� c�� ��� ���
		  [a-z] : a���� z���� ��� ���
		  [A-Z] : A���� Z���� ��� ���
		  [a-e&&c-g] : a-e�� c-g�� ��� ������Ű�� ���ڸ� ���
		 */
		
		System.out.println(Pattern.matches("s[c-kC-K\t]eep", "s	eep"));
		
		/*
		  # �ϳ��� ���� ���ڸ� ��Ÿ���� �͵�
		  
		   . : ��� ���ڸ� ����Ѵ� /  [.]�̳� \.�� �׳� ���� ��Ÿ����
		   \d : ��� ����
		   \D : ���ڸ� ������ ��� ��
		   \s : ��� ���� (\t, \n, , \r)
		   \S : ������ ������ ��� ��
		   \w : �Ϲ����� ���ڵ��� ���[a-zA-Z0-9_] // _�� _�� ���
		   \W : \w�� ������ ��� ���� ���
		   
		 */
		System.out.println(Pattern.matches("s.eep", "s*eep"));
		System.out.println(Pattern.matches("s.eep", "s1eep"));
		System.out.println(Pattern.matches("s\\.eep", "s.eep"));
		System.out.println(Pattern.matches("s[.]eep", "s.eep"));
		System.out.println(Pattern.matches("\\d\\d\\d", "142"));
		System.out.println(Pattern.matches("\\d\\s\\d", "1 2"));
		System.out.println(Pattern.matches("\\d..", "1@A"));
		
		/*
		  # �ش� ������ ����� ������ ������ �����ϴ� ���
		  
		   .{n} 	: {}���� ������ n�� ��ġ�ؾ� �Ѵ�
		   .{n,m}(���� �ȵ�) : {} ���� ������ �ּ� n���̻� m�� '����' ��ġ�ؾ� �Ѵ�
		   .{n,} 	: {} ���� ������ n�� �̻� ��ġ�ؾ� �Ѵ� / {,m} �̰� ����
		   .? 		: ?���� ������ 0�� �Ǵ� 1�� ���;� �Ѵ�
		   .+		: +���� ������ �ּ� 1�� �̻� ���;� �Ѵ�
		   .* 		: *���� ������ 0�� �̻� ���;� �Ѵ�
		 */
		
		System.out.println(Pattern.matches("\\d{5}", "12345"));
		System.out.println(Pattern.matches("\\d{2,5}", "12345"));
		System.out.println(Pattern.matches("\\d{2,}", "1234555555555555555"));
		System.out.println(Pattern.matches("\\d{2,5}", "12345"));
		System.out.println(Pattern.matches("abc[JQK]?", "abcQK"));
		System.out.println(Pattern.matches("abc[JQK]+", "abc"));
		System.out.println(Pattern.matches("abc[JQK]*", "abc123"));
		
		
		// ���� 1 : �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ����ǥ���� �����
		// ���� 2 : �ش� ���ڿ��� �̸������� �˻��� �� �ִ� ����ǥ���� �����
		
		System.out.println("==========================");
		Scanner sc=new Scanner(System.in);
//		System.out.print("�ڵ��� ��ȣ �Է�>>");
//		String pnum = sc.nextLine();
//		System.out.println(Pattern.matches("\\d{3}[-]\\d{4}[-]\\d{4}", pnum));
	//  System.out.println(Pattern.matches("01[016-9]-\\d{3,4}-\\d{4}", pnum));
//	
//		System.out.print("�̸��� �Է�>>");
//		String email = sc.nextLine();
//		System.out.println(Pattern.matches("\\w*[@][a-z]*[.]+[a-z]{2,4}[.]?[a-z]{2,4}?", email));
//		System.out.println(Pattern.matches("\\w+@\\w+\\.+[a-zA-Z]+(.[a-zA-Z]+)*", email));
//		
		// Matcher Ŭ���� 
		
		String text = "apple/banana/orange/kiwi/pineapple/grape/grapeapple/mango";
		
		// 1. ����ǥ������ �������Ͽ� ���� �ν��Ͻ��� ����
		Pattern applePattern = Pattern.compile("(\\w+)(apple)"); //("\\w+apple") �̷��� �ϸ� �׳� apple �� ��ã�� pine,grape apple ã�� 
		
		// 2. �ش� ���� �ν��Ͻ��� ���ڿ��� �˻�
		Matcher matchResult = applePattern.matcher(text);
		
		// 3. ��ġ ����� �ݺ����� Ȱ���� ��� Ž���� �� �ִ�
		while(matchResult.find()) {
			System.out.println("---- GROUP 0 (��ü) ----");
			System.out.println("ã�� �� : "+matchResult.group(0)); 
			System.out.println("���� �ε��� : "+matchResult.start(0));
			System.out.println("������ �ε��� : "+matchResult.end(0));
			
			System.out.println("---- GROUP 1 (���� ǥ������ ù��° ��ȣ) ----");
			System.out.println("ã�� �� : "+matchResult.group(1)); 
			System.out.println("���� �ε��� : "+matchResult.start(1));
			System.out.println("������ �ε��� : "+matchResult.end(1));
			
			System.out.println("---- GROUP 2 (���� ǥ������ �ι�° ��ȣ)----");
			System.out.println("ã�� �� : "+matchResult.group(2)); 
			System.out.println("���� �ε��� : "+matchResult.start(2));
			System.out.println("������ �ε��� : "+matchResult.end(2));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
