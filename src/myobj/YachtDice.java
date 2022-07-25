package myobj;

import java.util.Arrays;

public class YachtDice {
/* 내코드
	int[] dicenum = new int[5];
	public YachtDice(int[] dicenum) {
		this.dicenum = dicenum;
	}
	
	public void Playing(int[] dicenum) {
		
		int cnt;
		int[] index = new int[5];
		for(int i=0;i<5;i++) {
			index[i]=dicenum[i];
		}
		int temp;
		for(int i =0;i<5;i++) {  			// 11333, 11133 등으로 정렬해서 ㄷ
			for(int j=0;j<4;j++) {
				if(index[j]>index[j+1]) {
					temp = index[j];
					index[j]=index[j+1];
					index[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<5;i++) {  
			cnt=0;
			for(int j=i+1 ;j<5;j++) {
				if(index[i]==index[j]) {
					cnt++;
				}
			}
			if(cnt==4) {
				System.out.print("축하합니다. Yacht입니다. \n주사위 숫자 : ");
				for(int k=0;k<5;k++) {
					System.out.printf("%d ", dicenum[k]);
				}
				return;
			}
			else if(cnt==3){
				System.out.print("축하합니다. 4 다이스입니다. \n주사위 숫자 : ");
				for(int k=0;k<5;k++) {
					System.out.printf("%d ", dicenum[k]);
				}
				return;
			}
			
			else if(cnt==2) {
				
			}
		}
	}*/
	
	final static int GAME_SIZE = 5;
	final static int DICE_FACES = 6;
	
	int life = 2; //두번 다시 돌릴수 있으므로 
	int[] dices; // 랜덤 주사위 눈금 5개 생성
	int[] count = new int[DICE_FACES]; // 주사위 눈금 5개가 각각 어느숫자 몇개씩 뜬건지 확인
	String made; // 어느 조건인지 출력하기 위한 문자열
	
	public YachtDice() { 
		dices = new int[GAME_SIZE];
		//Arrays.fill(arr, val) :배열을 원하는 값으로 한번에 채우는 함수
		//Arrays.fill(dices, roll());
		
		for(int i=0;i<dices.length;i++) {
			roll(i);
		}
		check();
	}
	// 주사위 눈금의 개수를 세어놓은 count 배열에 원하는 숫자가 있는지 체크하는 메서드
	boolean numberContain(int num) {
		return count[num-1] > 0; 	// 1~6까지의 숫자가 몇개들어있는지 나타내는 배열이므로 원하는 숫자 입력시 해당 칸이 0이상이면 1개이상 숫자가 뽑힌것
	}
	
	
	// 주사위 눈금의 개수를 세어놓은 count 배열에 원하는 횟수만큼 등장한 숫자가 있는지 체크하는 메서드
	boolean countContain(int cnt) {
		for( int i =0 ; i< count.length;i++) {
			if(count[i]==cnt) {
				return true;
			}
		}
		return false;
	}
	
	// "245"라고 입력 받으면 2번쨰 4번째 5번째 주사위를 다시 던질 예정
	public void reroll(String idxs) {
		
		if(life<1) {
			return;
		}
		for(int i =0;i<idxs.length();i++) {
			// 문자열로 받은 '숫자'에서 '숫자'를 빼면 아스키코드 값으로 계산하여 숫자 0이 저장됨 '3'-'0' 은 아스키코드값으로 50-48이므로 숫자 2가 저장
			int index = idxs.charAt(i) - '0'; 
			if(index<0 || index>GAME_SIZE) {
				continue;
			}
			else {
				roll( index- 1);
			}
		}
		life--;
		check();
	}
	
	// 현재 dices의 값으로 어떤 숫자가 몇 개 있는지 세는 메서드
	void count() {
		// [0,0,0,0,0,0]
		Arrays.fill(count,0);		// 모든 배열 값을 0으로 만들고 주사위의 눈금이 카운트 될때마다 1씩 증가 해줌
		for(int i=0;i<dices.length;i++) {
			count[dices[i]-1]++; 	// dices 6이 나오면 count배열의 [5]자리에 1이증가 -> 6이 하나 나왔으므로 1 카운트 
		}
	}
	//현재 dices의 값을 통해 족보(조건)를 구분하는 메서드
	void check() {
		count();
		
		if(countContain(5)) {
			made = "Yacht!";
		}
		else if(countContain(4)) {
			made = "4 dice!";
		}
		else if(countContain(3)&&countContain(2)) {
			made = "Full House!";
		}
		else if(numberContain(2)&&numberContain(3)&&numberContain(4)&& // 2345를 하나이상 다 가지고 있고 1이나 6도 포함했을때
				numberContain(5)&&(numberContain(1)||numberContain(6))) {
			made = "Large Straight!";
		}
		else if(numberContain(3)&&numberContain(4)
					&&((numberContain(1)&&numberContain(2))
					||(numberContain(2)&&numberContain(5))
					||(numberContain(5)&&numberContain(6)))) {
				made = "Small Straight!";
			
		}
		else {
			made = "" + (dices[0]+dices[1]+dices[2]+dices[3]+dices[4]);
		}
	}
	
	
	// 원하는 번째의 주사위를 다시 굴리는 메서드
	void roll(int index) {
		dices[index] = (int)(Math.random()*6+1);
	}
	/*
	  # Object.toString()
	  
	   - 해당 클래스가 문자열로서 출력되어야 할 때 저절로 호출되는 메서드
	   - Object는 모든 타입의 부모이기 떄문에 모든 클래스에 toString()이 포함되어 있다
	   - 오버라이드해서 사용하지 않으면 기본적으로 메모리상의 주소값을 출력한다
	 */
	
	
	@Override
	public String toString() {
		// String.format() : printf()처럼 문자열을 생성할 때 사용하는 함수
		return String.format("현재 주사위 : %s\n" + "현재 상태 : %s",Arrays.toString(dices),made);
	}
	
	
}















































