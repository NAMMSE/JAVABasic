package quiz;

import java.util.Arrays;

public class B15_Lotto {

	/*#########################백지에 다시 풀기#########################
	  1. 1 ~ 45 의 중복 없는 랜덤 숫자 7개를 생성하여 당첨 번호를 만들어보세요
	  2. 당첨 될 때까지 번호를 생성한 후에 몇 회 만에 당첨 되었는지 출력
	  
	  
	  중복없이 7개 숫자 생성 후 오름차순 정렬
	  동일한 방법으로 숫자 생성 후 lotto[i]와 dang[i] 비교
	  
	 */
	
	public static void main(String[] args) { // 숫자 7개 생성인데 중복이 있을 수 있음
		/* 내코드
		int[] lotto = new int[7];
		//boolean[] lonum = new boolean[45];
		for(int i =0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random() * 45 +1);
			System.out.printf("%d: %d \n",i,lotto[i]);
			for(int j=i;j<lotto.length;j++) {
				
			}
		}
		System.out.printf("==================\n\n");
		int temp;
		for(int i =0;i<lotto.length-1;i++) {  // 당첨번호 버블정렬 알고리즘으로 오름차순
			for(int j=0;j<lotto.length-2-i;j++) {
				if(lotto[j]>lotto[j+1]) {
					temp = lotto[j];
					lotto[j]=lotto[j+1];
					lotto[j+1]=temp;
				}
			
			}
			System.out.printf("%d번 숫자: %d \n",i+1,lotto[i]);
		}
	
		/* 도현님 코드
		 * for(int i= 0;i<7;){
		 * dang[i] = (int)(Matn.random()*45+1);
		 * if(!my_pick[my_num[i]]{
		 * my_pick[my_num[i]]=true;
		 * i++
		 * }
		 */
		
		
		
		
		
   
		
		//강사님 코드
		
		int[] win = new int[7];
		for(int i = 0;i<win.length;i++) {
			int newNum=(int)(Math.random() * 45 +1);
		//	System.out.printf("이번에 새로 뽑은 번호 : %d = ",newNum);
		//	System.out.printf("%d(i)번째 숫자 (뽑는 중) \n",i);
			win[i] =newNum;
			for(int j=0;j<i;j++) {
			//	System.out.printf("이전의 숫자를 검토 중 win[%d] : %d \n",j,win[j]);
				
				if(newNum==win[j]) {
			//		System.out.printf("중복 발견! %d(i) 번째 숫자를 다시 뽑습니다 \n",i);
					--i; // 중복 발견 하면 i 감소시키고 반복문 나감> 중복이였던 숫자를 다시 뽑고 비교
					break;
				}
			}
			
		}
		//Arrays.toString(arr) : 전달한 배열을 보기 좋은 문자열로 만들어 반환한다
		System.out.println(Arrays.toString(win)); // 중복없이 뽑은 당첨 숫자
		
		
	/* 내가 강사님 설명 듣고 한 코드
		int temp=0;
		for(int i =0;i<win.length;i++) {  // 당첨될 번호 버블정렬 알고리즘
			for(int j=0;j<win.length-1-i;j++) {
				if(win[j]>win[j+1]) {
					temp = win[j];
					win[j]=win[j+1];
					win[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(win)); // 버블정렬로 오름차순
		
		int dang[] = new int[7];
		int cnt=0, numcnt=0;;
		while(true) { // 7자리 숫자 전부 일치할때까지 돌려야하므로 무한반복
			for(int i = 0;i<dang.length;i++) { // 중복없이 7개 숫자 랜덤생성
				int newNum=(int)(Math.random() * 45 +1);
				dang[i] =newNum;
				for(int j=0;j<i;j++) {
					if(newNum==dang[j]) {
						--i; // 중복 발견 하면 i 감소시키고 반복문 나감> 중복이였던 숫자를 다시 뽑고 비교
						break;
					}
				}
				
			}
			for(int i =0;i<dang.length;i++) {  // 당첨될 번호 버블정렬 알고리즘
				for(int j=0;j<dang.length-1-i;j++) {
					if(dang[j]>dang[j+1]) {
						temp = dang[j];
						dang[j]=dang[j+1];
						dang[j+1]=temp;
					}
				}
			}
			//System.out.println("dang="+Arrays.toString(dang)); // 버블정렬로 오름차순
			cnt=0; // cnt==7 이 되는 순간이 전부 일치하는 순간이기때문에 숫자를 재생성 한 후 비교하기 전 0으로 초기화
			for(int i=0; i<win.length;i++) {
				if(win[i]==dang[i]) { // i번째 숫자 비교하면서 같으면 cnt ++하고 일치여부 출력
					cnt++;
					//System.out.printf("%d 번째까지 일치.\n",i);
				}
				else {// 한번이라도 다른순간 반복문 탈출 후 7개 숫자 재생성
					break;
				}
			}
			
			if(cnt==7) {//cnt가 7이면 7개 숫자 모두 일치한 것이므로 while 탈출(이거 없애고 while 문 조건에 cnt<7해도 가능)
				break;
			}
			numcnt++;// 숫자 재생성 및 비교를 몇번이나 했는지 카운트
			
		}
		System.out.printf("%d회 만에 당첨입니다.\n",numcnt);
		
여기까지		*/
		
		// 강사님 코드
		int autocnt=0;
		while(true) {
			int[] auto = new int[7];
			
			for(int i = 0;i<auto.length;i++) { // 중복없이 7개 숫자 랜덤생성
				int newNum=(int)(Math.random() * 45 +1);
				auto[i] =newNum;
				for(int j=0;j<i;j++) {
					if(newNum==auto[j]) {
						--i; // 중복 발견 하면 i 감소시키고 반복문 나감> 중복이였던 숫자를 다시 뽑고 비교
						break;
					}
				}
				
			}
			autocnt++;
			
			int cnt=0; // 일치하는 번호 개수 세기
			for(int i=0;i<auto.length;++i) {
				for(int j=0;j<win.length;j++) {
					if(auto[i]==win[j]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt==7) {
				System.out.printf("1등 당첨입니다.  %d회 \n",autocnt);
				System.out.println("당첨번호 : "+Arrays.toString(win));
				System.out.println("자동번호 : "+Arrays.toString(auto));
				break;
				
			}
			else if(cnt==6) {
				System.out.printf("2등 당첨입니다.  %d회 \n",autocnt);
				System.out.println("당첨번호 : "+Arrays.toString(win));
				System.out.println("자동번호 : "+Arrays.toString(auto));
			}
		}
	}
	
}
