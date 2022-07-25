package quiz;

import java.util.ArrayList;
import java.util.Collections;

public class D01_ArrayListSort {

	// ArrayList�� 100���� ���� ���� ä�� �� ������������ �����Ͽ� ����ϱ�
	public static void main(String[] args) {
		
//		ArrayList<String> animals = new ArrayList<String>();
//		
//		animals.add("Monkey");
//		animals.add("Zibra");
//		animals.add("Giraffe");
//		animals.add("Lion");
//		
//		// Collections.sort(list) : ����Ʈ�� ������ ������������ �������ִ� �޼���
//		Collections.sort(animals);

		// Collections.reverse(list) : ����Ʈ�� ������ �Ųٷ� �������ִ� �޼���
		//Collections.reverse(animals);
//		System.out.println(animals);
		
		// Q. ArrayList�� 100���� ���� ���� ���� ä�� �� ������������ �����Ͽ� ����ϱ�
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<100;i++) {
			a.add(i,(int)(Math.random()*1000+1));
		}
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		
		int temp;
		for(int i=0;i<a.size()-1;i++){// ���� ��������
			for(int j=0;j<a.size()-1-i;j++) {
				if(a.get(j)>a.get(j+1)) {
					temp=a.get(j);
					a.set(j,a.get(j+1));
					a.set(j+1,temp);	
				}
			}		
		}
		System.out.println(a);
		for(int i=0;i<a.size()-1;i++){ // ���� ��������
			for(int j=0;j<a.size()-1-i;j++) {
				if(a.get(j)<a.get(j+1)) {
					temp=a.get(j);
					a.set(j,a.get(j+1));
					a.set(j+1,temp);	
				}
			}		
		}
		System.out.println(a);
		
		
		
	}
}
