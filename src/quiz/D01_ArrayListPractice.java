package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class D01_ArrayListPractice {

	/*
	  # ArrayList�� 1000���� 9999�� ���� ������ 100�� �߰��� �� ������ ���غ�����
	  
	   1. ��� ������ ���
	   2. ��� ���� �� ���� ū ��
	   3. ��� ���� �� ���� ���� ��
	   4. 77��°�� ���� ��
	   
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
//		//1 ��
//		int sum=0;
//		for(int i=0 ;i<100;i++) {
//			sum+=a.get(i);
//		}
//		System.out.println("\n��� : "+sum/a.size());
//		
//		//2 ��
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
//		System.out.println("���� ���� ���� : "+high+"\n���� ���� ���� : "+low);
//		
//		//4��
//		
//		System.out.println("77��° ���� : "+a.get(76));
		
		int sum = 0;
		int min = a.get(0);
		int max = a.get(0);
		
		for(int num : a) {
			sum+=num;
			min = min>num ? num:min;
			max = max<num ? num:max;
		}
		
		System.out.println("��� : "+ sum/(double)a.size());
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
		System.out.println("77��° �� : "+a.get(76));
		
		//=================================================================
		
		System.out.println("�ݷ������� ���� �ִ밪 : "+Collections.max(a));
		System.out.println("�ݷ������� ���� �ּҰ� : "+Collections.min(a));
		
		// ����Ʈ�� �迭�� ��ȯ�ϱ�
		
		//1. ���� ���� �迭�� �̸� �����صд�
		Integer[] arr = new Integer[a.size()];
		//2. toArray() �޼��忡 �̸� ������ �迭�� �����Ѵ�
		a.toArray(arr);
		
		System.out.println(Arrays.toString(arr));
		
		//�迭�� ����Ʈ�� ��ȯ�ϱ�
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
		//����Ʈ�� ��ȯ�� �迭�� �÷����̱� ������ �ٽ� ArrayList�� ��ȯ�� �� �ִ�
		//list = new ArrayList<>(list);
		Collection<Integer> c = new ArrayList<>(list); // �ݷ��� = ����Ʈ�� �θ�
		List<Integer> l = new ArrayList<>(list); // ����Ʈ = ��̸���Ʈ�� �θ�
		ArrayList<Integer> l2 = new ArrayList<>(list);
		
		//����Ʈ�� ��ȯ�� ����� �����ص� ���� �迭���� ������ ��ġ�� �ʴ´�
		for(int i=0;i<l2.size();i++) {
			if(l2.get(i) > 1100) {
				l2.remove(i--);
			}
		}
		
		System.out.println(l2);
		System.out.println(Arrays.toString(arr));
	}
}
