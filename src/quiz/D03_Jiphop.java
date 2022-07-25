package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D03_Jiphop<X,Y,Z> { // Ŭ���� �� ����<> ������ �ν��Ͻ� ������ �ش� Ÿ������ ���� �ʱ�ȭ�� ��

	/*
	 * 
	  1. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
	  
	  2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
	  
	  2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
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
	
	Set<X> union(Collection<X> a, Collection<X> b) { // �ν��Ͻ� ���� ��<>�ȿ� ���� Ÿ������ �ް� ��ȯ�Ѵ�
		Set<X> union = new HashSet<>(a);
		union.addAll(b);
		return union;
		//a.addAll(b);
//		return new HashSet<>(a);
//		Set<Integer> union = new HashSet<>();
//		union.addAll(b); 
//		return union;// �Ű������� ���� ������ �� �ּҰ��� ������ ���⶧���� ���������� �ڵ鸵�ϸ� ���ο��ִ� ������ ������ �ֱ⶧����
//					// ������ �޼��忡�� ���� ���� �װ��� �̿��� ����ϰ� �����Ѵ�
	}
	
	Set<Y> inter(Collection<Y> a, Collection<Y> b) { // static ������ ���� : 101��° �ٿ��� �ν��Ͻ��� �� Ÿ������ ����������ϱ� ������
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
		
		
		D03_Jiphop<Integer,String,Character> JiphopTool = new D03_Jiphop<>(); // ���⼭ String���� �ν��Ͻ� ���������� ���� <X>�� ���� �κ� ���� String���� �ν�
		
		System.out.println("������ : " + JiphopTool.union(A,B));
		System.out.println("������ : " + JiphopTool.inter(C,D));
		System.out.println("A - B : " + JiphopTool.diff(E,F));
		System.out.println("B - A : " + JiphopTool.diff(F,E));
		
		
		
		
	}
}
