package quiz;

public class B02_ConditionQuiz {

	/*/
	 1. int형 변수 a가 10보다 크고 20보다 작을 때 true
	 1. int형 변수 b가 짝수일 때 true
	 1. int형 변수 c가 7의 배수일때 true
	 1. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true
	 1. int형 변수 d와 e의 차이가 30일 때 true
	 1. int형 변수 year가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고 100으로나누어 떨어지지 않을때 true
	 1. 민수가 철수보다 생일이 3달 빠르면 때 true
	 1. boolean형 변수 powerOn이 false일 때 true
	 1. 문자열 참조변수 str이 "yes"일 때 true
	 
	 */
	
	public static void main(String[] args) {
		
		int a, b, c, hour, d, e, year, 민수나이, 철수나이, 민수생일, 철수생일;
		boolean powerOn;
		String str1, str2;
		
		a= 15;
		System.out.println("1. " + (a>10 && a<20));
		
		b=4;
		System.out.println("2. " +(b%2==0));
		
		c=49;
		System.out.println("3. "+(c%7==0));
		
		hour = 15;
		System.out.println("4. "+((hour>=0 && hour<24) && hour>=12));
		//System.out.println("4. "+(!((hour<0)) && (!(hour>=24)) && hour>=12));
		//System.out.println("4. "+(!(hour<0 || hour>=24) && hour>=12));
		
		
		d=10; e= 40;
		System.out.println("5. "+((d-e==30) || (e-d==30))); //Math.abs()
		
		year = 1000;
		System.out.println("6. "+((year%400==0) || (year%4==0 && year%100!=0)));
		
		
		
		
		민수생일 = 1;
		철수생일 = 12;
		민수나이 = 25;//94
		철수나이 = 26;//95
		System.out.println("7. "+((민수나이==철수나이 && 철수생일-민수생일>=3) || (민수나이>철수나이&&민수생일-철수생일<=9) || (민수나이<철수나이) ));
		
		/*
		 
		 System.out.println((민수생일+3)%12 == 철수생일)
		 System.out.println((철수생일-3+12)%12 == 민수생일)
		 System.out.println(철수 - 민수 == 3 || 민수 - 철수 == 9)
		 
		 */
		
		
		
		powerOn = false;
		System.out.println("8. "+(!powerOn));
		
		
		
		str1 = "yes";
		str2 = "yes";
		String str3 = new String("yes");
		System.out.println("9. "+(str1=="yes"));
		System.out.println("9. "+(str1==str2));
		System.out.println("9. "+(str1==str3));
		
		System.out.println("9. "+(str1.equals(str3))); // 실제 값을 통한 비교(주소값이 아닌 실제 값을 통해 비교)
		
		
		
		// 참조형 변수는 ==으로 비교하면 주소값을 통해 비교한다
		// String은 메모리에 그 값 자체가 아닌 해당 문자열을 담고있는 별개 메모리의 첫 주소를 가리키고 있기 때문에 문자열 자체가 아닌 주소값으로 비교를 한다.
		// 만약 같은 문자열이 있으면 최초에 만들어진 문자열의 주소값을 계속해서 사용하고 추가적으로 새로 같은내용의 문자열을 만들 시 기존 문자열과 새 문자열을 == 으로 비교하면 주소값이 다르기때문에 false가 나온다
		
	}
}
