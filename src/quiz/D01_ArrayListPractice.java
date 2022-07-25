package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class D01_ArrayListPractice {

	/*
	  # ArrayList에 1000부터 9999의 랜덤 정수를 100개 추가한 후 다음을 구해보세요
	  
	   1. 모든 숫자의 평균
	   2. 모둔 숫자 중 가장 큰 수
	   3. 모든 숫자 중 가장 작은 수
	   4. 77번째로 나온 수
	   
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i=0 ; i<100;i++) {
			a.add((int)(Math.random()*9000+1000));
		}
//		
//		for(int i=0;i<100;i++) {
//			
//			if(i%5==0) {
//				System.out.println();
//			}
//			System.out.print(a.get(i)+" ");
//			
//		}
//		//System.out.println(a);
//		
//		//1 번
//		int sum=0;
//		for(int i=0 ;i<100;i++) {
//			sum+=a.get(i);
//		}
//		System.out.println("\n평균 : "+sum/a.size());
//		
//		//2 번
//		
//		int high=1000;
//		int low=9999;
//		for(int i=0;i<100;i++) {
//			if(high<a.get(i)) {
//				high=a.get(i);
//			}
//			if(low>a.get(i)) {
//				low=a.get(i);
//				
//				
//				
//			}
//		}
//		System.out.println("가장 높은 점수 : "+high+"\n가장 낮은 점수 : "+low);
//		
//		//4번
//		
//		System.out.println("77번째 숫자 : "+a.get(76));
		
		int sum = 0;
		int min = a.get(0);
		int max = a.get(0);
		
		for(int num : a) {
			sum+=num;
			min = min>num ? num:min;
			max = max<num ? num:max;
		}
		
		System.out.println("평균 : "+ sum/(double)a.size());
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		System.out.println("77번째 값 : "+a.get(76));
		
		//=================================================================
		
		System.out.println("콜렉션으로 구한 최대값 : "+Collections.max(a));
		System.out.println("콜렉션으로 구한 최소값 : "+Collections.min(a));
		
		// 리스트를 배열로 변환하기
		
		//1. 값을 담을 배열을 미리 생성해둔다
		Integer[] arr = new Integer[a.size()];
		//2. toArray() 메서드에 미리 만들어둔 배열을 전달한다
		a.toArray(arr);
		
		System.out.println(Arrays.toString(arr));
		
		//배열을 리스트로 변환하기
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
		//리스트로 변환된 배열은 컬렉션이기 때문에 다시 ArrayList로 변환할 수 있다
		//list = new ArrayList<>(list);
		Collection<Integer> c = new ArrayList<>(list); // 콜렉션 = 리스트의 부모
		List<Integer> l = new ArrayList<>(list); // 리스트 = 어레이리스트의 부모
		ArrayList<Integer> l2 = new ArrayList<>(list);
		
		//리스트로 변환한 결과를 수정해도 원본 배열에는 영향을 미치지 않는다
		for(int i=0;i<l2.size();i++) {
			if(l2.get(i) > 1100) {
				l2.remove(i--);
			}
		}
		
		System.out.println(l2);
		System.out.println(Arrays.toString(arr));
	}
}
