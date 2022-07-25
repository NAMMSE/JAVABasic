package quiz;

import java.util.Scanner;

public class B15_ShuffleText {

	/* ##########################백지에 다시 풀기@@@@@@@@@@@@@@@@@@@@@@
	 사용자로부터 문장을 입력받으면 해당 문장을 랜덤으로 뒤섞어 출력하는 프로그램
	 */
	
	public static void main(String[] args) {
		
		/* 내 코드
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하세요>>");
		String str = sc.nextLine();
		
		int[] ran= new int[str.length()];
		ran[0] = (int)(Math.random()*str.length());
		for(int i =0 ; i<str.length()-1;i++) {
			for(int j=i+1;j<str.length()-1;j++) {
				ran[j] = (int)(Math.random()*str.length());
				if(ran[i]==ran[j]) {
					while(ran[i]!=ran[j]) {
						ran[j] = (int)(Math.random()*str.length());
					}
				}
			}
			
			System.out.printf("%d\n",ran[i]);
		}
		//	ran[i] = (int)(Math.random()*str.length());
//			while(true) {
//					ran[i+1]=(int)(Math.random()*str.length());
//					if(ran[i]!=ran[i+1]) {
//						break;
//					}
//			}
		
		
//		char[] word = new char[str.length()];
//		
//		for(int i= 0;i<str.length();i++) {
//			word[i]=word[ran];
//		}
//		
//		System.out.print("바뀐문장은 ");
//		for(int i= 0;i<str.length();i++) {
//			
//			System.out.print(word[i]);
//		}
 *
 */
		//강사님 코드 1
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		char[] shuffled_text = text.toCharArray();
		for(int i = 0;i<100;i++) { // 100번 동안 서로 맞바꿔줌
			int x = (int)(Math.random() * shuffled_text.length);
			//int y = (int)(Math.random() * shuffled_text.length);
			
			char temp = shuffled_text[x];
			shuffled_text[x] = shuffled_text[0];
			shuffled_text[0] = temp;
		}
		System.out.println(shuffled_text);
		
		//1. 입력받은 문장을 char[]로 변환
		char [] original_text = text.toCharArray();//원상복구
		//2. 문장의 길이와 같은 길이의 boolean 배열을 생성(뽑았던 문자는 다시 뽑지 않기위해 표시해놓는 용도)
		boolean[] pick = new boolean[shuffled_text.length];
		//3. 문자열을 만들기 위한 도구
		StringBuilder shuffled_text_builder = new StringBuilder(); // "" 이 상태
		//4. 빌더는 길이가 0으로 시작하면서 한 문자씩 추가하므로 원래 문장과 길이가 같아지면 모든 문자를 추가 완료한 것이므로 반복문 탈출 (어펜드가 ""상태에서 한 문자씩 추가함)
		while(shuffled_text_builder.length() != original_text.length) {
			int random_index = (int)(Math.random() * original_text.length); // 5. 랜덤 위치(인덱스)를 하나 뽑기
			
			//6. 해당 인덱스가 뽑았던 적이 있으면 추가하지 않음
			if(!pick[random_index]) {//oick 인덱스가 트루면 반복문 돌지않음
				// 입력받은 텍스트에서 랜덤 인덱스에 해당하는 문자를 붙여줌
				shuffled_text_builder.append(original_text[random_index]);
				// 해당 인덱스는 다시 나오는 경우에 if문을 돌지 않아야 하므로 pick인덱스를 true로 바꿔줌
				pick[random_index] = true;
			}
		}
		System.out.println(shuffled_text_builder);
		
		
		
	}
}
//char [] original_text = text.toCharArray();//원상복구
//boolean[] pick = new boolean[shuffled_text.length];
//StringBuilder shuffled_text_builder = new StringBuilder(); // "" 이 상태
//while(shuffled_text_builder.length() != original_text.length) {
//	int random_index = (int)(Math.random() * original_text.length); // 5. 랜덤 위치(인덱스)를 하나 뽑기
//	if(!pick[random_index]) {//oick 인덱스가 트루면 반복문 돌지않음
//		shuffled_text_builder.append(original_text[random_index]);
//		pick[random_index] = true;
//	}
//}
//System.out.println(shuffled_text_builder);

	
	