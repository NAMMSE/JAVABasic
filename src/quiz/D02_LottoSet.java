package quiz;

import java.util.ArrayList;
import java.util.HashSet;

public class D02_LottoSet {

	/*
	  HashSet�� �̿��� 1 ~ 45�� �ߺ����� 7���� ���� ���ڸ� �����ϱ�
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
		
		for(;lottoSet.size()<7;) { // �ߺ��� ���͵� 7���� ���ڸ� ���������� ��� �ݺ��ϸ� �ᱹ �ߺ����� ���� 7���� ���´�
			lottoSet.add((int)(Math.random()*45+1));
		}
		System.out.println(lottoSet);
	}
}
