package quiz;

import java.util.ArrayList;
import java.util.HashSet;

public class D02_LottoSet {

	/*
	  HashSet을 이용해 1 ~ 45의 중복없는 7개의 랜덤 숫자를 생성하기
	 */
	
	public static void main(String[] args) {
//		HashSet<Integer> lotto = new HashSet<Integer>();
//		ArrayList<Integer> lotto2;
//		for(int i=0;i<7;i++) {
//			int num = (int)(Math.random()*45+1);
//			lotto.add(num);
//			lotto2=new ArrayList<>(lotto);
//			for(int j=0;j<i;j++) {
//				if(num==lotto2.get(j)) {
//					
//					lotto2.set(j,(int)(Math.random()*45+1));
//					break;
//				}
//			}
//			System.out.print(lotto2);
//			System.out.println();
//		}
		
		
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		
		for(;lottoSet.size()<7;) { // 중복이 나와도 7개의 숫자를 뽑을때까지 계속 반복하면 결국 중복없는 숫자 7개가 나온다
			lottoSet.add((int)(Math.random()*45+1));
		}
		System.out.println(lottoSet);
	}
}
