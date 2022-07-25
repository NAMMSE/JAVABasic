import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static int[] createLottoNumber() {// 중복없는 6개의 랜덤 숫자 생성
		int[] rannum = new int[6]; 
		Random ran = new Random();
		for(int i=0;i<rannum.length;i++) { 
			int newnum = ran.nextInt(45)+1;
			rannum[i]=newnum;
			for(int j=0;j<i;j++) {
				if(newnum==rannum[j]) {
					i--;
					break;
				}
			}
		}	
		return rannum;
	}
	
	public static int[] bubblesort(int[] sorting) {// 7번째 뽑힌 보너스 숫자를 제외하고 나머지 숫자들은 비교하기 쉽게 버블정렬 이용하여 오름차순으로 정렬
		
		for(int i=0;i<sorting.length;i++) { 
			int temp;
			for(int j=0;j<sorting.length-1-i;j++) {
				if(sorting[j]>sorting[j+1]) {
					temp=sorting[j];
					sorting[j]=sorting[j+1];
					sorting[j+1]=temp;
				}
			}
		}
		return sorting;
	}
	
	public static void main(String[] args) {
	
		// 보너스 숫자가 포함된 당첨번호와 계속해서 생성할 6자리 숫자의 개수가 다르므로 7자리 당첨숫자생성은 메서드 사용하지 않음
		int[] winnum = new int[7]; // 최초 7개 당첨숫자 생성
		Random ran = new Random();
		for(int i=0;i<winnum.length;i++) { 
			int newnum = ran.nextInt(45)+1;
			winnum[i]=newnum;
			for(int j=0;j<i;j++) {
				if(newnum==winnum[j]) {
					i--;
					break;
				}
			}
		}	
		for(int i=0;i<winnum.length-1;i++) { // 보너스 숫자 제외 오름차순 정렬
			int temp;
			for(int j=0;j<winnum.length-2-i;j++) {
				if(winnum[j]>winnum[j+1]) {
					temp=winnum[j];
					winnum[j]=winnum[j+1];
					winnum[j+1]=temp;
				}
			}
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("로또를 몇 장 구매하시겠습니까 >> ");
		int lottnum = sc.nextInt();
		int[][] lottnums = new int[lottnum][6];
		for(int i=0;i<lottnum;i++) { // 로또번호 생성하는 반복문
			lottnums[i]=createLottoNumber(); 	// 사용자가 입력한 횟수만큼 로또번호 생성
			lottnums[i]=bubblesort(lottnums[i]); // 생성과 동시에 보너스 번호 제외 오름차순 정렬
			//System.out.println(Arrays.toString(lottnums[i]));
		}
	
		int cnt=0;
		int[] win = new int[5];
		for(int i=0;i<lottnum;i++) {
			cnt=0;
			for(int j=0;j<7;j++) {
				for(int k=0;k<6;k++) {
					if(j!=6 && lottnums[i][k]==winnum[j]) {
						cnt++;
						if(cnt==6) {
							System.out.printf("%d개째에 1등 당첨입니다.\n", i+1);
							System.out.println("로또 번호 : "+Arrays.toString(winnum));
							System.out.println("당첨 번호 : "+Arrays.toString(lottnums[i]));
							win[0]++;
						}
					}
					else if(cnt==5 && lottnums[i][k]==winnum[6] ) {
						System.out.printf("%d개째에 2등 당첨입니다.\n", i+1);
						System.out.println("로또 번호 : "+Arrays.toString(winnum));
						System.out.println("당첨 번호 : "+Arrays.toString(lottnums[i]));
						win[1]++;
						cnt=0;
					}	
				}
			}
			if(cnt==3) {
				System.out.printf("%d개째에 5등 당첨입니다.\n", i+1);
				System.out.println("로또 번호 : "+Arrays.toString(winnum));
				System.out.println("당첨 번호 : "+Arrays.toString(lottnums[i]));
				win[4]++;
			}
			else if(cnt==4){
				System.out.printf("%d개째에 4등 당첨입니다.\n", i+1);
				System.out.println("로또 번호 : "+Arrays.toString(winnum));
				System.out.println("당첨 번호 : "+Arrays.toString(lottnums[i]));
				win[3]++;
			}
			else if(cnt==5) {
				System.out.printf("%d개째에 3등 당첨입니다.\n", i+1);
				System.out.println("로또 번호 : "+Arrays.toString(winnum));
				System.out.println("당첨 번호 : "+Arrays.toString(lottnums[i]));
				win[2]++;
			}
		}
		System.out.println("====================================");
		System.out.printf("총 %d회 시도하여 1등 %d번, 2등 %d번, 3등 %d번, 4등 %d번, 5등 %d번 당첨되었습니다.\n", lottnum, win[0], win[1], win[2], win[3], win[4]);
	}
}
