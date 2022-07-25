
public class B09_BreakContinue {
	/*
	 # break
	 
	  - switch - case문에서 사용하면 해당 case를 탈출한다
	  - 반복문 내부에서 사용하면 해당 반복문을 탈출한다
	  
	 # continue
	 
	  - 반복문 내부에서 사용하면 그 즉시 다음 반복으로 넘어간다
	  - continue 아래에 남은 코드는 모두 무시한다
	 */

	public static void main(String[] args) {
		
		for(int i=0; i<100;i++) {
			System.out.println(i);
			if(i==66) {
			break;
			}
		}
		System.out.println("반복문 끝");
		
		for(int i=0;i<1000;i++)
		{
			if(i%10==0)
				continue;
			System.out.println(i);
		}
	}
}
