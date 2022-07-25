
public class B15_Array {

	/*
	 # 배열
	 
	  - 같은 타입 변수를 한번에 여러개 선언하는 문법
	  - 같은 이름으로 변수를 여러개 선언한 후에 인덱스로 구분한다
	  - 배열은 선언과 동시에 크기를 정해야 한다
	  - 크기가 정해지면 크기를 변경할 수 없다
	  - 배열의 인덱스는 0부터 전체길이-1번 까지 있다
	  - 배열은 생성과 동시에 모든 값이 초기화 되어있다
	    (정수 : 0, 실수 : 0.0, boolean : false, 참조형 : NULL)
	    
	    
	 
	 # 배열 선언 방법
	 
	  1. 타입[] 변수명 = new 타입[크기];
	  2. 타입[] 변수명 = {값1, 값2, 값3 ...};            2, 3번은 내가 넣은 값의 양에 따라 크기가 알아서 정해짐
	  3. 타입[] 변수명 = new 타입[] {값1, 값2, 값3, ...};
	 */
	public static void main(String[] args) {
		
		int[] score = new int[5]; // 배열의 길이가 3일때 방번호는 2번까지 있다
		
		score[0] = 99;
		score[1] = 92;
		score[2] = 91;
		//score[3] = 94;
		
		System.out.println("score의 길이: " +score.length);// 배열은 length 뒤에 괄호 붙이면 안됨
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]); // 배열은 선언과 동시에 초기화를 안해줘도 0으로 초기화함(자바에서는)
		System.out.println(score[4]);
		
		boolean[] complete = new boolean[5];
		
		for(int i = 0; i<complete.length;i++) {
			System.out.println(complete[i]);
		}
		
		char[] text = new char[100];
		
		text[0] = 'h';
		text[1] = 'e';
		text[2] = 'l';
		text[3] = 'l';
		text[4] = 'o';
		
		//char[] 은 문자열이나 다름없다
		System.out.println(text);
	
		// 배열 선언하기
		
		short[] eye_power = new short[10];
		long[] money = {123L, 234L, 5, 6, 789L}; //long 타입에 int 타입의 값을 넣어도 오류가 안나는건 일종의 타입캐스팅
		String[] name = new String[] {"김철수", "이철수", "박철수", "최철수", "안철수"};
		
		//배열에 값을 넣기(값 수정하기)
		name[3] = "송진우";
		
		//배열의 값 사용하기
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		String welcomeMessage = "Hello, World!!";
		
		char[] msg = welcomeMessage.toCharArray();
		System.out.println(msg[0]);
		System.out.println(msg[1]);
		System.out.println(msg[msg.length -1]);// length -1 번째 인덱스는 마지막 글자
		System.out.println(msg[msg.length -2]);
		System.out.println(msg[msg.length -3]);
		System.out.println(msg[msg.length -4]);
		System.out.println(msg[msg.length -5]);
	
	}
	
	
}
