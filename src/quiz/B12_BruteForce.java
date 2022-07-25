package quiz;

public class B12_BruteForce {

	/*
	 * 생성된 임시 비밀번호를 맞출때까지 모든 비밀번호를 생성하고 대조하는 프로그램
	 */
	public static void main(String[] args) {
		
		String password = "";
		for(int i=0;i<4;i++) {
			char ran =(char)(Math.random()*94+33);
			System.out.println(ran);
			password+=ran;
			//System.out.println(password);
		}
		System.out.println("최초 임시 비밀번호는 " +password+"입니다.");
		/* 내코드
		String words = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "`~!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
		
		
		String com_pw;
		for(;;) { // 비교하면서 맞을때까지 반복하니까 무한바복
			com_pw = ""; // 초기화 (여기서 하는게 맞는지 모르겠음)
			for(int i=0;i<94;i++) {  // 천의 자리 반복
				char ran =(char)(words.charAt(i));
				com_pw += ran;
				for(int j=0;j<94;j++ ) {
					ran =(char)(words.charAt(j));
					com_pw += ran;
					for(int t=0;t<94;t++ ) {
						ran =(char)(words.charAt(t));
						com_pw += ran;
						for(int r=0;r<94;r++ ) {
							ran =(char)(words.charAt(r));
							com_pw += ran;
							com_pw.charAt(com_pw.length())="";
							System.out.println(com_pw);
							if(true){
								break;
							}
							
						}
					}
				}
			}
			System.out.println(com_pw);
			if(com_pw.charAt(0)==password.charAt(0)
				&&com_pw.charAt(1)==password.charAt(1)
				&&com_pw.charAt(2)==password.charAt(2)
				&&com_pw.charAt(3)==password.charAt(3)) {
				break;
			}
						
		}
		
		System.out.println("최초 비밀번호 " + password+"와 동일한 비밀번호는 " + com_pw +"입니다.");
		*/
		String symbols = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "`~!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
	
		
		//System.out.println((long)Math.pow(symbols.length(), 4)); // 비밀번호가 4자리일때 나올 수 있는 경우의 수  94*94*94*94
		
		double max_index = Math.pow(symbols.length(), 4);
		
		/*
		 빈 문자열을 만들어 놓고 +=으로 문자열을 한 글자씩 완성시키는 것은 매우느리다
		 문자열을 한 글자씩 완성시킥 싶을 때는 StringBuilder라는 클래스를 사용한다
		 
		 append() : +=으로 문자를 한 글자 맨뒤에 추가하는 것과 같은 효과를 가진 메서드(함수)
		 insert() : 해당 문자열의 맨 앞에 글자를 추가하는 메서드
		 */
		
		
		
		for(int i =0;i<max_index; i++) {
			StringBuilder brutepassword_builder = new StringBuilder();
			int bruteindex = i;
			for(int j=0;j<4;j++) {
				brutepassword_builder.insert(0, symbols.charAt(bruteindex % symbols.length()));
				bruteindex/=symbols.length();
			}
			//stringBuilder로 만들어진 결과를 문자열로 꺼내기
			String brutepassword = brutepassword_builder.toString();
			System.out.println(brutepassword);
		}
		
		
		
		
		
		
		
		
		/* 두번째 코드 설명
		 * 93진법
		 * brute	symbol index	index
		 * aaaa		0001			0
		 * aaab		0002			1
		 * aaaj		0009			9
		 * aaak		000(10)			10
		 * aaa\		000(92)			92
		 * aaba		0010			93 -> 93%92
		 * aabb		0011			94
		 */
		
		/*	강사님 두번째 코드
		for(int i =0;i<max_index; i++) {
			String brutepassword = "";
			int bruteindex = i;
			for(int j=0;j<4;j++) {
				brutepassword += symbols.charAt(bruteindex%symbols.length());
				bruteindex/=symbols.length();
			}
			//brutepassword += symbols.charAt(i%symbols.length());
			//brutepassword += symbols.charAt(i/symbols.length() %symbols.length());
			//brutepassword += symbols.charAt(i/symbols.length()/symbols.length() %symbols.length());
			//brutepassword += symbols.charAt(i/symbols.length()/symbols.length()/symbols.length() %symbols.length()); //
			
			System.out.println(brutepassword);
		}
		*/
		
		
		
		/*	강사님 첫번쨰 코드
		for( int i = 0;i < symbols.length();i++) {
			String temp= "";
			temp+=symbols.charAt(i);
			for( int j =0;j<symbols.length();j++) {
				String temp2;
				temp2=temp + symbols.charAt(j);
				for(int k =0;k<symbols.length();k++){
					String temp3;
					temp3= temp2+symbols.charAt(k);
					for(int l =0;l<symbols.length();l++){
						String temp4;
						temp4=temp3+symbols.charAt(l);
						System.out.println(temp4);
						if(temp4.equals(password)) {
							System.out.println(password + "와 동일한 비밀번호는 " + temp4 +"입니다.");
						}
						
					}
				}
			}
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
	}
}
/*
char ran =(char)(words.charAt(i));
//System.out.println(ran);
com_pw.charAt(i)=ran;*/