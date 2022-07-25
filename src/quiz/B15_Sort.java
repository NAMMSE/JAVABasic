package quiz;

import java.util.Arrays;

public class B15_Sort {

	/*
	 랜덤 숫자 30개(0~99999)가 들어있는 배열을 생성한 후 
	 1. 해당 배열의 내용을 작은 값부터 차례대로 저장한 새로운 배열을 생성
	 2. 해당 배열의 내용을 큰 값부터 차례대로 저장한 새로운 배열을 생성
	 */
	
	public static void main(String[] args) {
	/*  내코드 시작	
		int[] ran = new int[30];
		int[] minsort = new int[30];
		int[] maxsort = new int[30];
		int temp=0;

		for(int i=0;i<ran.length;i++) {
			ran[i]=(int)(Math.random()*100000); // 10만개의 랜덤 숫자 생성 및 저장
			//System.out.println(ran[i]);
		}
		
		for(int i=0;i<ran.length;i++) { 		// i가 다른 곳에 영향을 주지는 않고 30번 반복하기위한 반복문
			for(int j=0;j<ran.length-1-i;j++) { // 한번 비교를 전부 하고 가장 큰 수가 배열의 가장 마지막 자리에 들어가있고 다음 비교때 마지막자리는 비교할 필요가 없기 때문에 횟수만 돌리는 i를 빼줌으로써 반복 구간이 설정됨
				if(ran[j]>ran[j+1]) { 			// 작은 값이 앞에 큰 값이 뒤에 와야 하기때문에 앞에 작은 값이 오면 무시
					temp=ran[j]; 				// 자리 이동
					ran[j]=ran[j+1];
					ran[j+1]=temp;
				}
			}
			minsort[ran.length-1-i]=ran[ran.length-1-i]; // 한번 비교 하면 큰 숫자가 배열 뒤에서부터 채워지기 때문에 새로운 배열에 저장할때도 뒤에서부터 저장
		}
		for(int i=0;i<ran.length;i++) {
			System.out.printf("오름차순 %2d번째 숫자 : %d \n",i+1,minsort[i]);
		}
		System.out.printf("========================\n");
		
		
		for(int i=0;i<ran.length;i++) {			// 마찬가지로 횟수만 돌리는 용도이기때문에 i--를 하거나 할 필요가 없음
			for(int j=ran.length-1;j>i;j--) {	//뒤에서부터 비교하면서 가장 큰 숫자를 앞에 고정시켜야 하므로 마지막 자리부터 빼면서 비교 / 다음 비교땐 가장 앞부터 1칸씩 비교할 필요가 없기때문에 j>i
				if(ran[j]>ran[j-1]) { 			// 뒤에있는 숫자가 앞보다 크면 앞으로 보내야 하므로
					temp=ran[j];
					ran[j]=ran[j-1];
					ran[j-1]=temp;
				}
			}
			maxsort[i]=ran[i]; // 가장 앞부터 큰 숫자가 채워지기 때문에 [i]번부터 저장 해준다
		}
		for(int i=0;i<ran.length;i++) {
			System.out.printf("내림차순 %2d번째 숫자 : %d \n",i+1,maxsort[i]);
		}
		
여기까지 내 코드		*/
		
		
		
		
		
		/*
		 # 선택 정렬
		 
		 1. 배열 전체에서 가장 작은 값을 찾아 맨 앞에 넣는다
		 2. 맨 앞을 제외한 배열 전체에서 가장 작은 값을 찾아 두 번째 자리에 넣는다
		 3. ...
		 */
		
		int[] origin = new int[10];
		
		for(int i=0;i<origin.length;i++) {
			origin[i]=(int)(Math.random()*100000); // 10만개의 랜덤 숫자 생성 및 저장
			//System.out.println(ran[i]);
		}
		int[] asc = new int[origin.length];// 오름차순으로 저장할 배열 선언
		int[] desc = new int[origin.length];//내림차순으로 저장할 배열 선언
		
		for(int i=0;i<asc.length;i++) {
			asc[i]=origin[i];// 오름차순 배열에 랜덤 숫자 저장
			desc[i]=origin[i];// 내림차순 배열에 랜덤 숫자 저장
		}
		System.out.printf("정렬전: %s \n", Arrays.toString(asc));
		
		// # 선택 정렬
//		for(int step = 0;step<asc.length ;step++) { // 스텝은 0부터 저장된 배열의 길이만큼 반복
//			// 1단계 : 최소값의 위치를 찾는다
//			// 일단 최소값의 위치는 해당 단계 값으로 설정한다
//			int min_index = asc[step]; // 배열의 step번째 값을 min_index에 저장
//			for(int i = step+1 ; i<asc.length;i++) { // 스텝번째 값과 그 다음값을 비교하여 상대적으로 적은 값을 계속해서 저장하는 알고리즘이므로 시작은 step + 1
//				min_index=asc[step] > asc[i] ? i : min_index; // 현재 step번째 값과 i번째 값을 비교하여 min_index에 저장한다
//			}
//			
//			// 2단계 : 최소값을 맨 앞(현재의 단계 인덱스)으로 이동시킨다
//			int temp = asc[step];
//			asc[step] = asc[min_index];
//			asc[min_index] = temp;
//			System.out.printf("selsect sort %d 단계: %s\n",step, Arrays.toString(asc));
//			
//		}
		
		// # 버블 정렬
		
		for(int step = 0; step<desc.length-1;step++) {// 30번 반복하기위한 반복문 / 0번 인덱스부터 n번째와 n+1번째를 비교하기때문에 반복 구간은 배열길이의 -1
			for(int i=0;i<desc.length -1 -step;i++) {//한번 비교를 전부 하고 가장 큰 수가 배열의 가장 마지막 자리에 들어가있고 다음 비교때 마지막자리는 비교할 필요가 없기 때문에 횟수만 돌리는 step 빼줌으로써 반복 구간이 설정됨
				if(desc[i] < desc[i+1]) {//큰 값이 앞에 작은 값이 뒤에 와야 하기때문에 앞에 작은 값이 오면 무시
					int temp = desc[i];//자리 이동
					desc[i] = desc[i+1];
					desc[i+1] = temp;
				}
			}
			System.out.printf("%d 단계: %s\n",step, Arrays.toString(desc));
		}
	}
}






































