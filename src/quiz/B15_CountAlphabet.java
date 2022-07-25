package quiz;

import java.util.Scanner;

public class B15_CountAlphabet {

	/*
	  사용자로부터 문장을 입력받으면 해당 문장에 각 알파벳이 등장한 횟수를 배열에 저장한 후 
	  1회 이상 등장한 알파벳만 몇 회 등장했는지 출력
	  (대문자, 소문자는 따로 저장해야함)
	 */
	
	public static void main(String[] args) {
		
		/* 내코드
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하세요>>");
		String str = sc.nextLine();
		
		
		int[] alnum = new int[52]; // 앞 26개는 대문자 뒤 26개는 소문자
		int bigcnt=0; // 대문자 카운트
		int smlcnt=0; // 소문자 카운트
		
		//
		for(int j='A' ;j<'Z';j++) { 			// j가 A일때 문자열을 한번 다 돌려서 비교 다음 B일때 한번 다 돌려서 비교 / 대문자 범위 지정할때 65말고 'A'도 가능
			bigcnt=0;							// 문자마다 한번 돌리고 다음문자때는 횟수를 초기화 해줘야하기때문
			for(int i=0;i<str.length();i++) { 	// 문장 길이만큼 돌리면서 비교하기
				if(((char)j) == str.charAt(i)) {// 대문자 범위에서 일치하는 문자가 있을때 
					bigcnt++; 					// 문장에서 해당 문자가 등장한 횟수만큼 카운트해줌
					alnum[j-'A'] = bigcnt; 		// 해당 배열 자리에 횟수 저장
				}
			}
			smlcnt=0;
			for(int i=0;i<str.length();i++) {
				if(((char)(j+32)) == str.charAt(i)) {//65+32='a' 이기 때문에
					smlcnt++;
					alnum[j-39] = smlcnt; // 65-39=26  0~25번이 대문자 26~52번이 소문자이므로 39를 빼줌
				}
			}
		}
		
//		for(int i=0;i<str.length();i++) { // 알파벳 등장 횟수만큼 저장 됐는지 확인
//			System.out.printf("%c의 개수 : %d \n", (char)(i+65),alnum[i]);
//			System.out.printf("%c의 개수 : %d \n", (char)(i+97),alnum[i+26]);
//		}
		
		for(int i=0;i<alnum.length;i++) {
			if(i<26) { // 대문자 출력하기 위해
				if(alnum[i]>=1) { // 등장횟수가 1회 이상인것
					System.out.printf("%s의 등장 횟수는 %d번 입니다.\n",(char)(i+65),alnum[i]); // i=0부터이고 대문자 범위 65 더해줘서 A부터 비교 가능
				}
			}
			else { //  소문자 출력
				if(alnum[i]>=1) { // 등장횟수 1회 이상
					System.out.printf("%s의 등장 횟수는 %d번 입니다.\n",(char)(i+71),alnum[i]);// i=26부터이고 소문자 범위 97에서 시작하려면 97-26=71부터 비교
				}
			}
		}	
여기까지 내코드		*/
		
		//강사님 코드
		
		System.out.print("문장을 입력하세요>>");
		String text = new Scanner(System.in).nextLine();
		
		int[] lower = new int[26];
		int[] upper = new int[26];
		
		for(int i=0;i<text.length();i++) {
			char ch = (text.charAt(i)); // 문장의 한 문자씩 ch에 저장
			
			if(ch>='a'&&ch<='z') { // ch가 소문자 범위 일때
				lower[ch - 'a']++; // 소문자 배열의 0번째 ch=65 'a'=65 65-65=0 번째 자리 횟수 1증가
			}
			else if(ch >= 'A' && ch <= 'Z') {// 대문자 범위 일때
				upper[ch - 'A']++;
			}
		}
		
		for(int i=0;i<26;i++) {
			if(lower[i] !=0) {// 횟수가 1이상인 것만 출력
				System.out.printf("%c : %d\n", (char)(i+'a'),lower[i]);
			}
			if(upper[i] !=0) {
				System.out.printf("%c : %d\n", (char)(i+'A'),upper[i]);
				
			}
			
		}
		
		
		
	}	
}
