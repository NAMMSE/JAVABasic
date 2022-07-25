package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {

	/*
	  1. charÇü º¯¼ö a°¡ 'q'¶Ç´Â 'Q'ÀÏ ¶§ true
	  1. charÇü º¯¼ö b°¡ °ø¹éÀÌ³ª ÅÇÀÌ ¾Æ´Ò ¶§ true
	  1. charÇü º¯¼ö c°¡ '0' ~ '9' ÀÏ ¶§ true
	  1. charÇü º¯¼ö d°¡ ¿µ¹®ÀÚ(´ë¹®ÀÚ ¶Ç´À ¼Ò¹®ÀÚ)ÀÏ ¶§ true
	  1. charÇü º¯¼ö e ÇÑ±ÛÀÏ ¶§ true
	  1. charÇü º¯¼ö f°¡ ÀÏº»¾îÀÏ ¶§ true
	  7. »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ¹®ÀÚ¿­ÀÌ exitÀÏ ¶§ true 
	 
	 */
	
	
	public static void main(String[] args) {
		
		char a, b, c, d, e, f;
		
		a = 'q';
		System.out.print("1. ");
		System.out.println((a == 'q')||(a == 'Q'));
		
		b = ' ';
		System.out.print("2. ");
		System.out.println(!((b == ' ') || (a == '\t')));
		
		c = '5';
		System.out.print("3. ");
		System.out.println((c >= '0' && c<= '9'));
		
		
		d = 'g';
		System.out.print("4. ");
		System.out.println(((int)d>=65 && (int)d<=90) || ((int)d>=97 && (int)d<=122));
		//System.out.println((d>='a' && d<='z') || (d>='A' && d<='Z'));
		
		
		//ÇÑ±Û ¹üÀ§ : AC00 - D7AF(55203)
		e = 'Œu';
		System.out.print("5. ");
		//System.out.println((char)44032);
		//System.out.println((char)55203);
		System.out.println(e>=44032 && e <=55203); // e>= '°¡' && e<= 'ÆR'
		System.out.println(e>=0xAC00 && e <=0xD7AF);
		
		
		// ÀÏº»¾î ¹üÀ§ : 3040 - 309F
		f = 'g';
		System.out.print("6. ");
		System.out.println(f>=0x3040 && e <=0x309F);
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ÀÔ·Â");
		String str = sc.next();
		System.out.print("7. ");
		System.out.println(str.equals("exit"));
	}
}
