package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D03_Jiphop<X,Y,Z> { // 클래스 명 옆에<> 적으면 인스턴스 생성시 해당 타입으로 전부 초기화가 됨

	/*
	 * 
	  1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렌셕의 합집합을 Set으로 반환하는 메서드
	  
	  2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
	  
	  2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
	 */
	
//	public static Set hapJiphop(Collection a, Collection b) {
//		Set hap = new HashSet();
//		hap.addAll(a);
//		hap.addAll(b);
//		
//		return hap;
//	}
//	
//	public static Set gyoJiphop(Collection a, Collection b) {
//		Set hap = new HashSet();
//		hap.addAll(a);
//		hap.retainAll(b);
//		
//		return hap;
//	}
//
//	public static Set chaJiphop(Collection a, Collection b) {
//	
//		Set hap = new HashSet();
//		hap.addAll(a);
//		hap.removeAll(b);
//
//		return hap;
//	}	
	
	Set<X> union(Collection<X> a, Collection<X> b) { // 인스턴스 생성 시<>안에 들어가는 타입으로 받고 반환한다
		Set<X> union = new HashSet<>(a);
		union.addAll(b);
		return union;
		//a.addAll(b);
//		return new HashSet<>(a);
//		Set<Integer> union = new HashSet<>();
//		union.addAll(b); 
//		return union;// 매개변수로 오는 값들은 그 주소값을 가지고 오기때문에 직접적으로 핸들링하면 메인에있는 변수에 영향을 주기때문에
//					// 변수를 메서드에서 따로 만들어서 그것을 이용해 계산하고 리턴한다
	}
	
	Set<Y> inter(Collection<Y> a, Collection<Y> b) { // static 못쓰는 이유 : 101번째 줄에서 인스턴스를 각 타입으로 생성해줘야하기 때문에
//		a.retainAll(b);
//		return new HashSet<>(a);
		Set<Y> inter  = new HashSet<>(a);
		inter.retainAll(b);
		return inter;
	}
	
	 Set<Z> diff(Collection<Z> a, Collection<Z> b) {
//		a.removeAll(b);
//		return new HashSet<>(a);
		 Set<Z> diff  = new HashSet<>(a);
			diff.removeAll(b);
			return diff;
	}
	
	public static void main(String[] args) {
//		Collection a = new ArrayList<>();
//		Collection b = new ArrayList<>();
//		
//		Collections.addAll(a, "apple","banana","pear","grape",12,13,14);
//		Collections.addAll(b, "apple","tomato","lemon","melon",11,12,13);
//		
//		System.out.println(hapJiphop(a,b));
//		System.out.println(gyoJiphop(a, b));
//		System.out.println(chaJiphop(a, b));
//		System.out.println(chaJiphop(b, a));
		
		List<Integer> A= new ArrayList<>();
		Set<Integer> B = new HashSet<>();
		List<String> C= new ArrayList<>();
		List<String> D= new ArrayList<>();
		List<Character> E= new ArrayList<>();
		List<Character> F= new ArrayList<>();
		
		Collections.addAll(A, 1,3,5,7,9 );
		Collections.addAll(B, 7,9,11,13,15 );
		Collections.addAll(C, "A","b","c","d" );
		Collections.addAll(D, "b","c","d","e" );
		Collections.addAll(E, '1','2','3','4');
		Collections.addAll(F, '3','4','5','6' );
		
		
		D03_Jiphop<Integer,String,Character> JiphopTool = new D03_Jiphop<>(); // 여기서 String으로 인스턴스 생성했으니 위에 <X>로 적은 부분 전부 String으로 인식
		
		System.out.println("합집합 : " + JiphopTool.union(A,B));
		System.out.println("교집합 : " + JiphopTool.inter(C,D));
		System.out.println("A - B : " + JiphopTool.diff(E,F));
		System.out.println("B - A : " + JiphopTool.diff(F,E));
		
		
		
		
	}
}
